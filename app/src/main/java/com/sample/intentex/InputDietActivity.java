package com.sample.intentex;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InputDietActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_diet);
    }

    // 식단 추가 버튼 클릭 시
//    Button addButton = findViewById(R.id.addButton);
//        addButton.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            EditText mealNameEditText = findViewById(R.id.mealNameEditText);
//            EditText mealDescriptionEditText = findViewById(R.id.mealDescriptionEditText);
//
//            String mealName = mealNameEditText.getText().toString();
//            String mealDescription = mealDescriptionEditText.getText().toString();
//
//            addMealToList(mealName, mealDescription);
//
//            mealNameEditText.setText("");
//            mealDescriptionEditText.setText("");
//        }
//    });
//
//    public void addMealToList(String mealName, String mealDescription) {
//        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//
//        TextView mealTextView = new TextView(this);
//        mealTextView.setLayoutParams(layoutParams);
//        mealTextView.setText("식단명: " + mealName + "\n식단 설명: " + mealDescription);
//        mealTextView.setPadding(0, 16, 0, 16);
//
//        mealListLayout.addView(mealTextView);
//    }
}