package com.sample.intentex;
//게시판//
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivity1 extends AppCompatActivity {

    private Button write_text, go_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        write_text = findViewById(R.id.WriteText);
        go_back = findViewById(R.id.GoBack);

        write_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubActivity1.this, WriteText.class);
                startActivity(intent); //액티비티 이동
            }
        });

        //홈 화면으로 이동 go_back 버튼
        go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubActivity1.this, MainActivity.class);
                startActivity(intent); //액티비티 이동
            }
        });

    }
}