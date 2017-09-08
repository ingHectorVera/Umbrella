package com.foo.umbrella.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.foo.umbrella.R;

import org.w3c.dom.Text;

public class SettingsActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText zipCode;
    private TextView units;
    private static final int SETTINGS_ACTIVITY_CODE = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        zipCode = (EditText) findViewById(R.id.zip_code);
        units = (TextView) findViewById(R.id.units);
        units.setClickable(true);
        units.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UnitsActivity.class);
                startActivityForResult(intent, SETTINGS_ACTIVITY_CODE,null);
            }
        });

        toolbar = (Toolbar) findViewById(R.id.settings_toolbar);
        if(toolbar != null){
            setSupportActionBar(toolbar);
            if(getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setDisplayShowHomeEnabled(true);
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == SETTINGS_ACTIVITY_CODE && resultCode == RESULT_OK && data != null){
            String units = data.getStringExtra("units");
            this.units.setText(units);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            if(checkEditText()) {
                Intent intent = new Intent();
                intent.putExtra("zipCode",zipCode.getText().toString());
                intent.putExtra("unit", units.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }else{
                Toast.makeText(this, "Missing information", Toast.LENGTH_SHORT).show();
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(checkEditText()) {
            Intent intent = new Intent();
            intent.putExtra("zipCode",zipCode.getText().toString());
            intent.putExtra("unit", units.getText().toString());
            setResult(RESULT_OK, intent);
            finish();
        }else{
            Toast.makeText(this, "Missing information", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean checkEditText(){
        String sUnit = units.getText().toString();
        String sZipCode = zipCode.getText().toString();
        boolean flag = false;
        if(!sUnit.equals("") && !sZipCode.equals("")){
            flag = true;
        }
        return flag;
    }
}
