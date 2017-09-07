package com.foo.umbrella.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.foo.umbrella.R;
import com.foo.umbrella.data.ApiServicesProvider;
import com.foo.umbrella.data.model.WeatherData;
import com.foo.umbrella.service.CommunicationService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final int MAIN_ACTIVITY_CODE = 1;
    private static final String DEBUG = "Debug_Main";
    private Toolbar toolbar;
    private String zipCode, unit;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      toolbar = (Toolbar) findViewById(R.id.main_toolbar);
      zipCode = "";
      unit = "";
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
            zipCode = data.getStringExtra("zipCode");
            unit = data.getStringExtra("unit");

            forecastForZipCallable();
        }
    }

    private void forecastForZipCallable(){

        Intent intent = new Intent(MainActivity.this, CommunicationService.class);
        intent.putExtra("zipCode",zipCode);
        startService(intent);


        /*ApiServicesProvider api = new ApiServicesProvider(getApplication());

        Call<WeatherData> call = api.getWeatherService().forecastForZipCallable(zipCode);
        call.enqueue(new Callback<WeatherData>() {
            @Override
            public void onResponse(Call<WeatherData> call, Response<WeatherData> response) {
                Log.d(DEBUG, "onResponse");
                WeatherData weatherData = response.body();
                toolbar.setTitle(weatherData.getCurrentObservation().getDisplayLocation().getFullName());
            }

            @Override
            public void onFailure(Call<WeatherData> call, Throwable t) {
                Log.d(DEBUG, "onFailure");
                Log.d(DEBUG, t.getMessage());
                t.printStackTrace();
            }
        });*/
    }
}
