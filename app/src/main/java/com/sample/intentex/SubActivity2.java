package com.sample.intentex;
//체중관리//MainActivity from 상헌
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;


import java.util.ArrayList;

public class SubActivity2 extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findViewById(R.id.btn).setOnClickListener(ClickListener);
    }
    // 그래프 넣을라고 이것저것 시도했는데 오류가 너무 떠서 일단 정리하고 다 지워놨습니다..
    Button.OnClickListener ClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn:
                    new AlertDialog.Builder(SubActivity2.this)
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
}