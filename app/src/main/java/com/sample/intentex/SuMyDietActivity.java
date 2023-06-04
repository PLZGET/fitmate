package com.sample.intentex;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SuMyDietActivity extends AppCompatActivity {

    private LinearLayout mealListLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_diet);

        mealListLayout = findViewById(R.id.mealListLayout);

        // 식단 추가 버튼 클릭 시
        Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText mealNameEditText = findViewById(R.id.mealNameEditText);
                EditText mealDescriptionEditText = findViewById(R.id.mealDescriptionEditText);

                String mealName = mealNameEditText.getText().toString();
                String mealDescription = mealDescriptionEditText.getText().toString();

                addMealToList(mealName, mealDescription, R.drawable.fake_image1);

                mealNameEditText.setText("");
                mealDescriptionEditText.setText("");
            }
        });

        // 식단 입력하기 버튼으로 식단 입력하는 페이지로 이동
        Button inputDietButton = findViewById(R.id.addButton); // 수정: 버튼 ID 변경
        inputDietButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 식단 입력하기 페이지로 이동하는 코드 작성
                Intent intent = new Intent(SuMyDietActivity.this, SuInputDietActivity.class);
                startActivity(intent);
            }
        });

        // 추가된 식단 목록을 불러오기
        loadMealList();
    }

    public void addMealToList(String mealName, String mealDescription, int imageResource) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        // 식단 정보를 표시할 뷰 생성
        TextView mealTextView = new TextView(this);
        mealTextView.setLayoutParams(layoutParams);
        mealTextView.setText("식단명: " + mealName + "\n식단 설명: " + mealDescription);
        mealTextView.setPadding(0, 16, 0, 16);
        mealTextView.setTextSize(21); // 텍스트 크기 조절

        // 이미지를 표시할 뷰 생성
        ImageView mealImageView = new ImageView(this);
        mealImageView.setLayoutParams(layoutParams);
        mealImageView.setImageResource(imageResource); // 가상 이미지 설정
        mealImageView.setPadding(0, 16, 0, 16);
        mealImageView.setAdjustViewBounds(true);
        mealImageView.setMaxHeight(600); // 이미지 높이 조절

        // 식단 정보와 이미지를 담을 수 있는 컨테이너 뷰 생성
        LinearLayout mealContainer = new LinearLayout(this);
        mealContainer.setLayoutParams(layoutParams);
        mealContainer.setOrientation(LinearLayout.VERTICAL);

        // 구분 선 추가
        View dividerView = new View(this);
        LinearLayout.LayoutParams dividerLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 1); // 구분 선의 높이를 1로 지정
        dividerView.setLayoutParams(dividerLayoutParams);
        dividerView.setBackgroundColor(Color.BLACK);



        // 식단 정보 뷰와 이미지 뷰를 컨테이너에 추가
        mealContainer.addView(mealTextView);
        mealContainer.addView(mealImageView);



        // 컨테이너를 식단 목록 레이아웃에 추가
        mealListLayout.addView(mealContainer);
        mealListLayout.addView(dividerView);
    }

    public void loadMealList() {
        // 여기에 추가된 식단 목록을 불러오는 로직을 구현
        // 예를 들어, 저장된 식단 데이터를 읽어와서 addMealToList() 메서드를 호출하여 목록에 추가

        String[] mealNames = {"아침 식단", "점심 식단", "저녁 식단"};
        String[] mealDescriptions = {"현미밥, 소고기, 계란, 토마토 샐러드", "순두부, 계란, 콩나물, 사과", "미역국, 계란말이, 토마토"};
        int[] fakeImageResources = {R.drawable.fake_image1, R.drawable.fake_image2, R.drawable.fake_image3}; // 가상 이미지 리소스의 식별자

        for (int i = 0; i < mealNames.length; i++) {
            addMealToList(mealNames[i], mealDescriptions[i],  fakeImageResources[i]);
        }
    }
}
