package com.foo.umbrella.ui;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.foo.umbrella.events.ListEvent;
import com.foo.umbrella.model.ForecastModel;
import com.foo.umbrella.ui.adapters.ListAdapter;
import com.foo.umbrella.R;
import com.foo.umbrella.data.api.WeatherService;
import com.foo.umbrella.data.model.CurrentObservation;
import com.foo.umbrella.data.model.HourlyForecast;
import com.foo.umbrella.data.model.WeatherData;
import com.foo.umbrella.database.ConfigData;
import com.foo.umbrella.database.UmbrellaConfigDH;
import com.foo.umbrella.database.library.Library;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final int MAIN_ACTIVITY_CODE = 1;
    private Toolbar toolbar;
    private String zipCode, unit;
    private TextView tempText, weatherText;
    private ListView containerList;
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();
        getSettings();
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                ForecastModel.forecastForZipCallable(zipCode);
            }
        }, Library.TIMER_MINUTES * 60 * 1000);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
        timer = null;
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
            storeUnits();
            ForecastModel.forecastForZipCallable(zipCode);
        }
    }

    @Subscribe
    public void onEvent(ListEvent event) {
        String currentLocation = event.getWeatherData().getCurrentObservation().getDisplayLocation().getFull();
        //Toast.makeText(this, currentLocation, Toast.LENGTH_SHORT).show();
        toolbar.setTitle(currentLocation);
        if (unit.equals(Library.CELSIUS)) {
            tempText.setText(event.getWeatherData().getCurrentObservation().getTempC() + " ºC");
        } else {
            tempText.setText(event.getWeatherData().getCurrentObservation().getTempF() + " ºF");
        }
        setBackgroundColor(event.getWeatherData().getCurrentObservation().getTempF());
        sendNotification(event.getWeatherData());
        ListAdapter listAdapter = new ListAdapter(getApplicationContext(), event.getFinalList(), unit);
        containerList.setAdapter(listAdapter);
    }

    private void sendNotification(WeatherData weatherData) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, Library.NOTIFICATION_REQUEST_CODE, intent, 0);

        builder.setContentIntent(pendingIntent);
        builder.setSmallIcon(R.drawable.ic_weather_black);
        builder.setContentTitle(weatherData.getCurrentObservation().getDisplayLocation().getFull());
        if (unit.equals(Library.CELSIUS)) {
            builder.setContentText(weatherData.getCurrentObservation().getTempC() + " ºC");
        } else {
            builder.setContentText(weatherData.getCurrentObservation().getTempF() + " ºF");
        }

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(Library.NOTIFICATION_REQUEST_CODE, builder.build());
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

    private void setUI() {
        toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        tempText = (TextView) findViewById(R.id.tempText);
        weatherText = (TextView) findViewById(R.id.weatherText);
        containerList = (ListView) findViewById(R.id.containerList);
    }

    private void getSettings() {
        UmbrellaConfigDH umbrellaConfigDH = new UmbrellaConfigDH(getApplicationContext());
        ConfigData configData = umbrellaConfigDH.selectConfigData();
        if(configData.getZipCode() != null && configData.getUnit() != null) {
            zipCode = configData.getZipCode();
            unit = configData.getUnit();
            ForecastModel.forecastForZipCallable(zipCode);
            setSupportActionBar(toolbar);
        } else {
            Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
            startActivityForResult(intent, MAIN_ACTIVITY_CODE);
        }
    }

    private void storeUnits() {
        UmbrellaConfigDH umbrellaConfigDH = new UmbrellaConfigDH(getApplicationContext());
        ConfigData configData = umbrellaConfigDH.selectConfigData();
        if(configData.getZipCode() != null && configData.getUnit() != null){
            umbrellaConfigDH.updateZipCode(zipCode);
            umbrellaConfigDH.updateUnit(unit);
        }else {
            umbrellaConfigDH.addZipCode(zipCode);
            umbrellaConfigDH.addUnit(unit);
        }
    }

}
