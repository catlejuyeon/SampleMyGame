package com.example.capture.video.game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Character extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character);

        TextView level=findViewById(R.id.level);
        ImageView exp_bar=findViewById(R.id.exp_bar);

        ImageView emoji5=findViewById(R.id.emoji5);
        ImageView emoji10=findViewById(R.id.emoji10);
        ImageView emoji15=findViewById(R.id.emoji15);
        ImageView emoji20=findViewById(R.id.emoji20);
        ImageView emoji25=findViewById(R.id.emoji25);
        ImageView emoji30=findViewById(R.id.emoji30);

        ImageView hat5=findViewById(R.id.hat5);
        ImageView hat10=findViewById(R.id.hat10);
        ImageView hat15=findViewById(R.id.hat15);
        ImageView hat20=findViewById(R.id.hat20);
        ImageView hat25=findViewById(R.id.hat25);
        ImageView hat30=findViewById(R.id.hat30);

        ImageView clothes5=findViewById(R.id.clothes5);
        ImageView clothes10=findViewById(R.id.clothes10);
        ImageView clothes15=findViewById(R.id.clothes15);
        ImageView clothes20=findViewById(R.id.clothes20);
        ImageView clothes25=findViewById(R.id.clothes25);
        ImageView clothes30=findViewById(R.id.clothes30);

        level.setText("Lv"+"30");

        Button go_game=findViewById(R.id.go_game);
        go_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
