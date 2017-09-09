package com.foo.umbrella.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.foo.umbrella.R;
import com.foo.umbrella.data.api.WeatherService;
import com.foo.umbrella.data.model.HourlyForecast;
import com.foo.umbrella.data.model.WeatherData;
import com.foo.umbrella.database.ConfigData;
import com.foo.umbrella.database.UmbrellaConfigDH;
import com.foo.umbrella.database.library.Library;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.adapter.rxjava.Result;
import rx.Observable;

public class MainActivity extends AppCompatActivity {

    private static final int MAIN_ACTIVITY_CODE = 1;
    private static final String DEBUG = "Debug_Main";
    private Toolbar toolbar;
    private String zipCode, unit;
    private TextView tempText, weatherText;
    private ListView containerView;
    private String [] arrayText;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      setContentView(R.layout.activity_main);
      toolbar = (Toolbar) findViewById(R.id.main_toolbar);
      tempText = (TextView) findViewById(R.id.tempText);
      weatherText = (TextView) findViewById(R.id.weatherText);
      containerView = (ListView) findViewById(R.id.containerView);

      arrayText = new String[]{"String 1","String 2","String 3","String 4","String 5",
              "String 6","String 7","String 8"};

      UmbrellaConfigDH umbrellaConfigDH = new UmbrellaConfigDH(getApplicationContext());

      ConfigData configData = umbrellaConfigDH.selectConfigData();
      if(configData.getZipCode() != null && configData.getUnit() != null) {
          zipCode = configData.getZipCode();
          unit = configData.getUnit();

          forecastForZipCallable();
          setSupportActionBar(toolbar);
      } else {
          Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
          startActivityForResult(intent, MAIN_ACTIVITY_CODE);
      }
  }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.main_search){
            Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
            startActivityForResult(intent, MAIN_ACTIVITY_CODE);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == MAIN_ACTIVITY_CODE && resultCode == RESULT_OK && data != null){
            zipCode = data.getStringExtra("zipCode");
            unit = data.getStringExtra("unit");

            setSupportActionBar(toolbar);

            UmbrellaConfigDH umbrellaConfigDH = new UmbrellaConfigDH(getApplicationContext());

            ConfigData configData = umbrellaConfigDH.selectConfigData();
            if(configData.getZipCode() != null && configData.getUnit() != null){
                umbrellaConfigDH.updateZipCode(zipCode);
                umbrellaConfigDH.updateUnit(unit);
            }else {
                umbrellaConfigDH.addZipCode(zipCode);
                umbrellaConfigDH.addUnit(unit);
            }
            forecastForZipCallable();
        }
    }

    private void forecastForZipCallable(){

        WeatherService.Factory.getInstance().forecastForZipCallable(zipCode).enqueue(new Callback<WeatherData>() {
            @Override
            public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {
                WeatherData weatherData = response.body();
                toolbar.setTitle(weatherData.getCurrentObservation().getDisplayLocation().getFull());
                if(unit.equals(Library.CELSIUS)){
                    tempText.setText(weatherData.getCurrentObservation().getTempC()+"*");
                }else{
                    tempText.setText(weatherData.getCurrentObservation().getTempF()+"*");
                }
                weatherText.setText(weatherData.getCurrentObservation().getWeather());
                setBackgroundColor(weatherData.getCurrentObservation().getTempF());

                ArrayAdapter<String> firstAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,
                        arrayText);
                containerView.setAdapter(firstAdapter);
               Log.d(DEBUG, "onResponse");
            }

            @Override
            public void onFailure(Call<WeatherData> call, Throwable t) {
                Log.d(DEBUG, "onFailure");
                t.printStackTrace();
            }
        });

    }

    private void setBackgroundColor(double tempF){
        if(tempF >= Library.TEMPERATURE_LIMIT){
            toolbar.setBackgroundColor(getResources().getColor(R.color.weather_warm));
            tempText.setBackgroundColor(getResources().getColor(R.color.weather_warm));
            weatherText.setBackgroundColor(getResources().getColor(R.color.weather_warm));
        }else{
            toolbar.setBackgroundColor(getResources().getColor(R.color.weather_cool));
            tempText.setBackgroundColor(getResources().getColor(R.color.weather_cool));
            weatherText.setBackgroundColor(getResources().getColor(R.color.weather_cool));
        }
    }
}
