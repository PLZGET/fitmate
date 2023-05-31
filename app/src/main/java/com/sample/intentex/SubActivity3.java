package com.sample.intentex;
//식단관리// MainActivity from 수빈
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);



        // 1. 식단 추천(블로그 링크 연결하기)
        ImageButton recommendButton = findViewById(R.id.recommendButton);
        recommendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String blogLink = "https://example.com";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(blogLink));
                startActivity(intent);
            }
        });

        // 2. 나의 식단(게시판처럼 입력한 식단 내용 넣기)
        ImageButton myDietButton = findViewById(R.id.myDietButton);
        myDietButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 나의 식단 페이지로 이동하는 코드 작성
                Intent intent = new Intent(SubActivity3.this, MyDietActivity.class);
                startActivity(intent);
            }
        });

        // 3. 식단 입력하기 버튼으로 식단 입력하는 페이지로 이동
        Button inputDietButton = findViewById(R.id.inputDietButton);
        inputDietButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 식단 입력하기 페이지로 이동하는 코드 작성
                Intent intent = new Intent(SubActivity3.this, InputDietActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onRecommendButtonClick(View view) {
        // 식단 추천 버튼 클릭 시 처리하는 메서드
        String blogLink = "https://todayfoodpic.netlify.app/"; // 식단 추천을 위한 블로그 링크
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(blogLink));
        startActivity(intent);

    }

    public void onMyDietButtonClick(View view) {
        // 나의 식단 버튼 클릭 시 처리하는 메서드
        Intent intent = new Intent(SubActivity3.this, MyDietActivity.class);
        startActivity(intent);
    }

    public void onInputDietButtonClick(View view) {

        // 식단 입력하기 버튼 클릭 시 처리하는 메서드
        Intent intent = new Intent(SubActivity3.this, InputDietActivity.class);
        startActivity(intent);
    }
}
