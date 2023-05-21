package com.sample.intentex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WriteText extends AppCompatActivity {
    private Button submitButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_text);

        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WriteText.this, SubActivity1.class);
                startActivity(intent); //액티비티 이동

                Toast.makeText(getApplicationContext(), "게시글 작성완료!",
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}