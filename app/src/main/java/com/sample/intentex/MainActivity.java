package com.sample.intentex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_move, btn_move2, btn_move3, btn_move4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_move = findViewById(R.id.BtnMove);
        btn_move2 = findViewById(R.id.BtnMove2);
        btn_move3 = findViewById(R.id.BtnMove3);
        btn_move4 = findViewById(R.id.BtnMove4);




        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity1.class);
                startActivity(intent); //게시판 액티비티 이동
            }
        });
        btn_move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity2.class);
                startActivity(intent); //체중관리 액티비티 이동
            }
        });
        btn_move3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity3.class);
                startActivity(intent); //식단 액티비티 이동
            }
        });
        btn_move4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity4.class);
                startActivity(intent); //캘린더 액티비티 이동
            }
        });
    }
}