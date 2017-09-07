package com.foo.umbrella.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.foo.umbrella.R;
import com.foo.umbrella.data.ApiServicesProvider;
import com.foo.umbrella.data.api.WeatherService;
import com.foo.umbrella.data.model.WeatherData;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final int MAIN_ACTIVITY_CODE = 1;
    private Toolbar toolbar;
    private String zip, unit;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      toolbar = (Toolbar) findViewById(R.id.main_toolbar);
      zip = "";
      unit = "";
      setSupportActionBar(toolbar);
  }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        //MenuInflater menuInflater = getMenuInflater();
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
            zip = data.getStringExtra("zipCode");
            unit = data.getStringExtra("unit");

            ApiServicesProvider api = new ApiServicesProvider(getApplication());

            Call<WeatherData> call = api.getWeatherService().forecastForZipCallable(zip);

            try {
                Response<WeatherData> response = call.execute();
                if(response.isSuccessful()){
                    WeatherData weatherData = response.body();
                    toolbar.setTitle(weatherData.getCurrentObservation().getDisplayLocation().getFullName());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            Toast.makeText(this, zip + " " + unit, Toast.LENGTH_LONG).show();
        }
    }
}
