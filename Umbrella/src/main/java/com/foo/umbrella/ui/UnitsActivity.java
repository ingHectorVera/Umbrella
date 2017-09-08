package com.foo.umbrella.ui;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.foo.umbrella.R;

public class UnitsActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units);

        toolbar = (Toolbar) findViewById(R.id.units_toolbar);
        toolbar.setTitle("UNITS");
        setSupportActionBar(toolbar);
        radioGroup = (RadioGroup) findViewById(R.id.units_radio_group);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                RadioButton radioButton = (RadioButton) findViewById(checkedId);
                String units = radioButton.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("units", units);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
