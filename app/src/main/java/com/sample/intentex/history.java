package com.sample.intentex;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class history extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }
    public void eventbtn2(View v){
        Toast.makeText(getApplicationContext(),"이전 화면으로 이동합니다",Toast.LENGTH_LONG).show();
        finish();
    }
}
