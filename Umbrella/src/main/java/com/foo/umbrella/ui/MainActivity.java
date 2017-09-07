package com.foo.umbrella.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.foo.umbrella.R;

public class MainActivity extends AppCompatActivity {

    private boolean flag = true;
    private int main_activity_code = 1;
    private Toolbar toolbar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      toolbar = (Toolbar) findViewById(R.id.main_toolbar);
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
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivityForResult(intent, main_activity_code);
            
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == main_activity_code){
            //flag = data.getBooleanExtra("flag",true);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        /*if(flag){
            Intent intent = new Intent(this, SettingsActivity.class);
            intent.putExtra("flag", flag);
            startActivityForResult(intent, main_activity_code);
        }else {
        }*/
    }
}
