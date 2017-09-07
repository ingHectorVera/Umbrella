package com.foo.umbrella.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.foo.umbrella.R;

public class MainActivity extends AppCompatActivity {

    private boolean flag = true;
    private int main_activity_code = 1;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
  }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == main_activity_code){
            flag = data.getBooleanExtra("flag",true);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(flag){
            Intent intent = new Intent(this, Settings.class);
            intent.putExtra("flag", flag);
            startActivityForResult(intent, main_activity_code);
        }else {
        }
    }
}
