package com.sample.intentex;
//체중관리//MainActivity from 상헌
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SangSubActivity2 extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(ClickListener);
    }

    Button.OnClickListener ClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn:
                    new AlertDialog.Builder(SangSubActivity2.this)
                            .setTitle("팝업")
                            .setMessage("기록되었습니다!!\n\n")
                            .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dlg, int sumthin) {
                                }
                            })
                            .show(); // 팝업창 보여줌

                    break;
            }
        }
    };
    public void eventbtn1(View v){
        Intent intent = new Intent(getApplication(),history.class);
        startActivity(intent);
    }
}