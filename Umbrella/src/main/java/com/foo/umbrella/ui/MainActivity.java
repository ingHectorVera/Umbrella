package com.foo.umbrella.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.foo.umbrella.R;
import com.foo.umbrella.data.ApiServicesProvider;
import com.foo.umbrella.data.model.WeatherData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final int MAIN_ACTIVITY_CODE = 1;
    private Toolbar toolbar;
    private String zipCode, unit;
    private ApiServicesProvider api ;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      toolbar = (Toolbar) findViewById(R.id.main_toolbar);
      zipCode = "";
      unit = "";
      api = new ApiServicesProvider(getApplication());
      setSupportActionBar(toolbar);
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
            //flag = data.getBooleanExtra("flag",true);
            zipCode = data.getStringExtra("zipCode");
            unit = data.getStringExtra("unit");

            forecastForZipCallable();

            //Toast.makeText(this, zipCode + " " + unit, Toast.LENGTH_LONG).show();
        }
    }

    private void forecastForZipCallable(){

        Callback<WeatherData> callback = new Callback<WeatherData>() {
            @Override
            public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {
                WeatherData weatherData = response.body();
                toolbar.setTitle(weatherData.getCurrentObservation().getDisplayLocation().getFullName());
            }

            @Override
            public void onFailure(Call<WeatherData> call, Throwable t) {
            }
        };
        Call<WeatherData> call = api.getWeatherService().forecastForZipCallable(zipCode);
        call.enqueue(callback);
    }
}
