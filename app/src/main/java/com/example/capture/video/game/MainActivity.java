package com.example.capture.video.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView main_img = (ImageView)findViewById(R.id.imageView);
        Glide.with(this).load(R.raw.main).into(main_img);

        Button imageButton = (Button) findViewById(R.id.game3_btn);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Character.class);
                startActivity(intent);
            }
        });
    }
}