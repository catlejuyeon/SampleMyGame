package com.example.capture.video.game;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Character extends AppCompatActivity {
    boolean i=true;
    int hat = 0;
    int emoji = 0;
    int clothes = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character);
        int level1=15; //서버에서받아야함 -레벨
        int per=30; //서버에서받아야함 -경험치

        TextView level=findViewById(R.id.level);
        ImageView user_character=findViewById(R.id.user_character);
        ImageView user_clothes=findViewById(R.id.user_clothes);
        ImageView user_hat=findViewById(R.id.user_hat);
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
        //30에는 서버에서 받은걸 넣기.

        SharedPreferences pref;
        SharedPreferences.Editor editor;

        pref = getSharedPreferences("character", Activity.MODE_PRIVATE);
        editor = pref.edit();


        hat = pref.getInt("hat",0);
        clothes = pref.getInt("clothes",0);
        emoji = pref.getInt("emoji",0);

        Log.d("clothes: ", String.valueOf(clothes));
        Log.d("hat: ", String.valueOf(hat));
        Log.d("emoji: ", String.valueOf(emoji));

        ConstraintLayout.LayoutParams mLay= null;
        Context context = getApplicationContext();

        switch (emoji){
            case 0:
                user_character.setImageResource(R.drawable.character_basic);
                mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();

                mLay.topMargin = ConvertDPtoPX(context,100);
                mLay.rightMargin = ConvertDPtoPX(context,81);
                mLay.width = ConvertDPtoPX(context,260);
                mLay.height = ConvertDPtoPX(context,260);
                break;
            case 5:
                Log.d("5","5");
                user_character.setImageResource(R.drawable.emoji5);
                mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();


                mLay.topMargin = ConvertDPtoPX(context,109);
                mLay.rightMargin = ConvertDPtoPX(context,80);
                mLay.width = ConvertDPtoPX(context,252);
                mLay.height = ConvertDPtoPX(context,252);

                user_character.setLayoutParams(mLay);
                i=false;

                emoji = 5;
                break;
            case 10:
                Log.d("10","10");
                user_character.setImageResource(R.drawable.emoji10);
                mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();


                mLay.topMargin = ConvertDPtoPX(context,109);
                mLay.rightMargin = ConvertDPtoPX(context,80);
                mLay.width = ConvertDPtoPX(context,252);
                mLay.height = ConvertDPtoPX(context,252);

                user_character.setLayoutParams(mLay);
                i=false;

                emoji = 10;
                break;
            case 15:
                Log.d("15","15");
                user_character.setImageResource(R.drawable.emoji15);
                mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();


                mLay.topMargin = ConvertDPtoPX(context,109);
                mLay.rightMargin = ConvertDPtoPX(context,80);
                mLay.width = ConvertDPtoPX(context,252);
                mLay.height = ConvertDPtoPX(context,252);

                user_character.setLayoutParams(mLay);
                i=false;

                emoji = 15;
                break;
            case 20:
                Log.d("20","20");
                user_character.setImageResource(R.drawable.emoji20);
                mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();


                mLay.topMargin = ConvertDPtoPX(context,109);
                mLay.rightMargin = ConvertDPtoPX(context,80);
                mLay.width = ConvertDPtoPX(context,252);
                mLay.height = ConvertDPtoPX(context,252);

                user_character.setLayoutParams(mLay);
                i=false;

                emoji = 20;
                break;
            case 25:
                Log.d("25","25");
                user_character.setImageResource(R.drawable.emoji25);
                mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();


                mLay.topMargin = ConvertDPtoPX(context,109);
                mLay.rightMargin = ConvertDPtoPX(context,80);
                mLay.width = ConvertDPtoPX(context,252);
                mLay.height = ConvertDPtoPX(context,252);

                user_character.setLayoutParams(mLay);
                i=false;

                emoji = 25;
                break;
            case 30:
                Log.d("30","30");
                user_character.setImageResource(R.drawable.emoji30);
                mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();


                mLay.topMargin = ConvertDPtoPX(context,109);
                mLay.rightMargin = ConvertDPtoPX(context,80);
                mLay.width = ConvertDPtoPX(context,252);
                mLay.height = ConvertDPtoPX(context,252);

                user_character.setLayoutParams(mLay);
                i=false;

                emoji = 30;
                break;

            case 100:
                Log.d("100","100");
                user_character.setImageResource(R.drawable.character_basic);
                mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();

                mLay.topMargin = ConvertDPtoPX(context,100);
                mLay.rightMargin = ConvertDPtoPX(context,81);
                mLay.width = ConvertDPtoPX(context,260);
                mLay.height = ConvertDPtoPX(context,260);


                user_character.setLayoutParams(mLay);
                i=false;

                emoji = 100;
                break;

        }

        switch (clothes){
            case 0:
                user_clothes.setImageResource(R.drawable.empty_img);
                clothes=0;
                i=false;
                break;
            case 5:
                Log.d("5","5");
                user_clothes.setImageResource(R.drawable.clothes5);
                mLay = (ConstraintLayout.LayoutParams) user_clothes.getLayoutParams();

                mLay.topMargin = ConvertDPtoPX(context,42);
                mLay.rightMargin = ConvertDPtoPX(context,70);
                mLay.width = ConvertDPtoPX(context,270);
                mLay.height = ConvertDPtoPX(context,330);

                user_clothes.setLayoutParams(mLay);
                i=false;

                clothes = 5;
                break;
            case 10:
                Log.d("10","10");
                user_clothes.setImageResource(R.drawable.clothes10);
                mLay = (ConstraintLayout.LayoutParams) user_clothes.getLayoutParams();

                mLay.topMargin = ConvertDPtoPX(context,66);
                mLay.rightMargin = ConvertDPtoPX(context,70);
                mLay.width = ConvertDPtoPX(context,270);
                mLay.height = ConvertDPtoPX(context,330);

                user_clothes.setLayoutParams(mLay);
                i=false;
                clothes = 10;
                break;
            case 15:
                Log.d("15","15");
                user_clothes.setImageResource(R.drawable.clothes15);

                mLay = (ConstraintLayout.LayoutParams) user_clothes.getLayoutParams();

                mLay.topMargin = ConvertDPtoPX(context,25);
                mLay.rightMargin = ConvertDPtoPX(context,67);
                mLay.width = ConvertDPtoPX(context,270);
                mLay.height = ConvertDPtoPX(context,330);

                user_clothes.setLayoutParams(mLay);

                i=false;
                clothes = 15;
                break;
            case 20:
                Log.d("20","20");
                user_clothes.setImageResource(R.drawable.clothes20);

                mLay = (ConstraintLayout.LayoutParams) user_clothes.getLayoutParams();

                mLay.topMargin = ConvertDPtoPX(context,25);
                mLay.rightMargin = ConvertDPtoPX(context,45);
                mLay.width = ConvertDPtoPX(context,270);
                mLay.height = ConvertDPtoPX(context,310);

                user_clothes.setLayoutParams(mLay);

                i=false;
                clothes = 20;
                break;
            case 25:
                Log.d("25","25");
                user_clothes.setImageResource(R.drawable.clothes25);

                mLay = (ConstraintLayout.LayoutParams) user_clothes.getLayoutParams();

                mLay.topMargin = ConvertDPtoPX(context,45);
                mLay.rightMargin = ConvertDPtoPX(context,65);
                mLay.width = ConvertDPtoPX(context,270);
                mLay.height = ConvertDPtoPX(context,290);

                user_clothes.setLayoutParams(mLay);

                i=false;
                clothes = 25;
                break;
            case 30:
                Log.d("30","30");
                user_clothes.setImageResource(R.drawable.clothes30);

                mLay = (ConstraintLayout.LayoutParams) user_clothes.getLayoutParams();

                mLay.topMargin = ConvertDPtoPX(context,53);
                mLay.rightMargin = ConvertDPtoPX(context,72);
                mLay.width = ConvertDPtoPX(context,270);
                mLay.height = ConvertDPtoPX(context,300);

                user_clothes.setLayoutParams(mLay);

                i=false;
                clothes =0;
                break;
        }

        switch (hat){
            case 0:
                user_hat.setImageResource(R.drawable.empty_img);
                break;
            case 5:
                Log.d("5","5");
                user_hat.setImageResource(R.drawable.hat5);

                mLay = (ConstraintLayout.LayoutParams) user_hat.getLayoutParams();

                mLay.topMargin = ConvertDPtoPX(context,15);
                mLay.rightMargin = ConvertDPtoPX(context,27);
                mLay.width = ConvertDPtoPX(context,280);
                mLay.height = ConvertDPtoPX(context,280);

                user_hat.setLayoutParams(mLay);

                i=false;
                hat = 5;
                break;
            case 10:
                Log.d("10","10");
                user_hat.setImageResource(R.drawable.hat10);

                mLay = (ConstraintLayout.LayoutParams) user_hat.getLayoutParams();

                mLay.topMargin = ConvertDPtoPX(context,6);
                mLay.rightMargin = ConvertDPtoPX(context,65);
                mLay.width = ConvertDPtoPX(context,280);
                mLay.height = ConvertDPtoPX(context,270);

                user_hat.setLayoutParams(mLay);

                i=false;
                hat = 10;
                break;
            case 15:
                Log.d("15","15");
                user_hat.setImageResource(R.drawable.hat15);

                mLay = (ConstraintLayout.LayoutParams) user_hat.getLayoutParams();

                mLay.topMargin = ConvertDPtoPX(context,6);
                mLay.rightMargin = ConvertDPtoPX(context,65);
                mLay.width = ConvertDPtoPX(context,280);
                mLay.height = ConvertDPtoPX(context,270);

                user_hat.setLayoutParams(mLay);

                i=false;
                hat = 15;
                break;
            case 20:
                Log.d("20","20");
                user_hat.setImageResource(R.drawable.hat20);

                mLay = (ConstraintLayout.LayoutParams) user_hat.getLayoutParams();

                mLay.topMargin = ConvertDPtoPX(context,17);
                mLay.rightMargin = ConvertDPtoPX(context,70);
                mLay.width = ConvertDPtoPX(context,290);
                mLay.height = ConvertDPtoPX(context,270);

                user_hat.setLayoutParams(mLay);

                i=false;
                hat = 20;
                break;
            case 25:
                Log.d("25","25");
                user_hat.setImageResource(R.drawable.hat25);

                mLay = (ConstraintLayout.LayoutParams) user_hat.getLayoutParams();

                mLay.topMargin = ConvertDPtoPX(context,23);
                mLay.rightMargin = ConvertDPtoPX(context,62);
                mLay.width = ConvertDPtoPX(context,290);
                mLay.height = ConvertDPtoPX(context,270);

                user_hat.setLayoutParams(mLay);

                i=false;
                hat = 25;
                break;
            case 30:
                Log.d("30","30");
                user_hat.setImageResource(R.drawable.hat30);

                mLay = (ConstraintLayout.LayoutParams) user_hat.getLayoutParams();

                mLay.topMargin = ConvertDPtoPX(context,0);
                mLay.rightMargin = ConvertDPtoPX(context,30);
                mLay.width = ConvertDPtoPX(context,350);
                mLay.height = ConvertDPtoPX(context,320);

                user_hat.setLayoutParams(mLay);

                i=false;
                hat = 30;
                break;
        }

        //게임하러 가기 버튼
        Button go_game=findViewById(R.id.go_game);
        go_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        //되돌리기 버튼
        Button reset=findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_character.setImageResource(R.drawable.character_basic);
                user_clothes.setImageResource(R.drawable.empty_img);
                user_hat.setImageResource(R.drawable.empty_img);

                ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();
                Context context = getApplicationContext();
                mLay.topMargin = ConvertDPtoPX(context,100);
                mLay.rightMargin = ConvertDPtoPX(context,81);
                mLay.width = ConvertDPtoPX(context,260);
                mLay.height = ConvertDPtoPX(context,260);

                clothes=100;
                hat=100;
                emoji=100;
            }
        });

        //저장하기 버튼
        Button save=findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pref;
                SharedPreferences.Editor editor;

                Log.d("","");

                pref = getSharedPreferences("character", Activity.MODE_PRIVATE);
                editor = pref.edit();

                editor.putInt("hat", hat);
                editor.putInt("clothes", clothes);
                editor.putInt("emoji", emoji);
                editor.apply();

                Toast.makeText(getApplicationContext(), "저장 되었습니다. ",Toast.LENGTH_LONG).show();
            }
        });


        //level에 따라 잠금이 풀리는 아이템
        //근데 이게 보여지는것만 그렇게 보이는거라서 30레벨이 아니여도 30레벨 선택이 가능함 (조건걸어줘야함)
        if(level1==5||level1==10||level1==15||level1==20||level1==25||level1==30) {
            userItem(level1);
        }

        //서버에서 경험치 받아와서 경험치 바 표시
        int exp_per = per;
        if(exp_per > 49 && exp_per<100) {
            exp_bar.setImageResource(R.drawable.half_exp);
        }else
            exp_bar.setImageResource(R.drawable.empty_exp);



//여기서부터 표정
        emoji5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emoji != 5){
                    user_character.setImageResource(R.drawable.emoji5);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,109);
                    mLay.rightMargin = ConvertDPtoPX(context,80);
                    mLay.width = ConvertDPtoPX(context,252);
                    mLay.height = ConvertDPtoPX(context,252);

                    user_character.setLayoutParams(mLay);

                    emoji= 5;
                }else{
                    user_character.setImageResource(R.drawable.character_basic);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,100);
                    mLay.rightMargin = ConvertDPtoPX(context,81);
                    mLay.width = ConvertDPtoPX(context,260);
                    mLay.height = ConvertDPtoPX(context,260);

                    emoji = 0;
                }
            }
        });

        emoji10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emoji != 10){
                    user_character.setImageResource(R.drawable.emoji10);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,109);
                    mLay.rightMargin = ConvertDPtoPX(context,80);
                    mLay.width = ConvertDPtoPX(context,252);
                    mLay.height = ConvertDPtoPX(context,252);

                    user_character.setLayoutParams(mLay);

                    emoji= 10;
                }else{
                    user_character.setImageResource(R.drawable.character_basic);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,100);
                    mLay.rightMargin = ConvertDPtoPX(context,81);
                    mLay.width = ConvertDPtoPX(context,260);
                    mLay.height = ConvertDPtoPX(context,260);

                    emoji = 0;
                }
            }
        });

        emoji15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emoji != 15){
                    user_character.setImageResource(R.drawable.emoji15);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,109);
                    mLay.rightMargin = ConvertDPtoPX(context,80);
                    mLay.width = ConvertDPtoPX(context,252);
                    mLay.height = ConvertDPtoPX(context,252);

                    user_character.setLayoutParams(mLay);

                    emoji= 15;
                }else{
                    user_character.setImageResource(R.drawable.character_basic);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,100);
                    mLay.rightMargin = ConvertDPtoPX(context,81);
                    mLay.width = ConvertDPtoPX(context,260);
                    mLay.height = ConvertDPtoPX(context,260);

                    emoji = 0;
                }
            }
        });

        emoji20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emoji != 20){
                    user_character.setImageResource(R.drawable.emoji20);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,109);
                    mLay.rightMargin = ConvertDPtoPX(context,80);
                    mLay.width = ConvertDPtoPX(context,252);
                    mLay.height = ConvertDPtoPX(context,252);

                    user_character.setLayoutParams(mLay);

                    emoji= 20;
                }else{
                    user_character.setImageResource(R.drawable.character_basic);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,100);
                    mLay.rightMargin = ConvertDPtoPX(context,81);
                    mLay.width = ConvertDPtoPX(context,260);
                    mLay.height = ConvertDPtoPX(context,260);

                    emoji = 0;
                }
            }
        });

        emoji25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emoji != 25){
                    user_character.setImageResource(R.drawable.emoji25);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,109);
                    mLay.rightMargin = ConvertDPtoPX(context,80);
                    mLay.width = ConvertDPtoPX(context,252);
                    mLay.height = ConvertDPtoPX(context,252);

                    user_character.setLayoutParams(mLay);

                    emoji= 25;
                }else{
                    user_character.setImageResource(R.drawable.character_basic);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,100);
                    mLay.rightMargin = ConvertDPtoPX(context,81);
                    mLay.width = ConvertDPtoPX(context,260);
                    mLay.height = ConvertDPtoPX(context,260);

                    emoji = 0;
                }
            }
        });

        emoji30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emoji != 30){
                    user_character.setImageResource(R.drawable.emoji30);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,109);
                    mLay.rightMargin = ConvertDPtoPX(context,80);
                    mLay.width = ConvertDPtoPX(context,252);
                    mLay.height = ConvertDPtoPX(context,252);

                    user_character.setLayoutParams(mLay);

                    emoji= 30;
                }else{
                    user_character.setImageResource(R.drawable.character_basic);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_character.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,100);
                    mLay.rightMargin = ConvertDPtoPX(context,81);
                    mLay.width = ConvertDPtoPX(context,260);
                    mLay.height = ConvertDPtoPX(context,260);

                    emoji = 0;
                }
            }
        });



    // 여기서부터 옷
        clothes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clothes != 5){
                    user_clothes.setImageResource(R.drawable.clothes5);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_clothes.getLayoutParams();

                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,42);
                    mLay.rightMargin = ConvertDPtoPX(context,70);
                    mLay.width = ConvertDPtoPX(context,270);
                    mLay.height=ConvertDPtoPX(context,330);

                    user_clothes.setLayoutParams(mLay);

                    clothes = 5;
                }else{
                    user_clothes.setImageResource(R.drawable.empty_img);
                    clothes = 0;
                }
            }
        });

        clothes10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clothes != 10){
                    user_clothes.setImageResource(R.drawable.clothes10);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_clothes.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,66);
                    mLay.rightMargin = ConvertDPtoPX(context,70);
                    mLay.width = ConvertDPtoPX(context,270);
                    mLay.height = ConvertDPtoPX(context,330);

                    user_clothes.setLayoutParams(mLay);

                    clothes = 10;
                }else{
                    user_clothes.setImageResource(R.drawable.empty_img);

                    clothes = 0;
                }
            }
        });

        clothes15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clothes != 15){
                    user_clothes.setImageResource(R.drawable.clothes15);

                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_clothes.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,25);
                    mLay.rightMargin = ConvertDPtoPX(context,67);
                    mLay.width = ConvertDPtoPX(context,270);
                    mLay.height = ConvertDPtoPX(context,330);

                    user_clothes.setLayoutParams(mLay);

                    clothes = 15;
                }else{
                    user_clothes.setImageResource(R.drawable.empty_img);

                    clothes = 0;
                }
            }
        });

        clothes20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clothes != 20){
                    user_clothes.setImageResource(R.drawable.clothes20);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_clothes.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,25);
                    mLay.rightMargin = ConvertDPtoPX(context,45);
                    mLay.width = ConvertDPtoPX(context,270);
                    mLay.height= ConvertDPtoPX(context,310);

                    user_clothes.setLayoutParams(mLay);

                    clothes = 20;
                }else{
                    user_clothes.setImageResource(R.drawable.empty_img);

                    clothes=0;
                }
            }
        });

        clothes25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clothes!=25){
                    user_clothes.setImageResource(R.drawable.clothes25);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_clothes.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,45);
                    mLay.rightMargin = ConvertDPtoPX(context,65);
                    mLay.width = ConvertDPtoPX(context,270);
                    mLay.height= ConvertDPtoPX(context,290);

                    user_clothes.setLayoutParams(mLay);

                    clothes = 25;
                }else{
                    user_clothes.setImageResource(R.drawable.empty_img);

                    clothes=0;
                }
            }
        });

        clothes30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clothes!=30){
                    user_clothes.setImageResource(R.drawable.clothes30);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_clothes.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,53);
                    mLay.rightMargin = ConvertDPtoPX(context,72);
                    mLay.width = ConvertDPtoPX(context,270);
                    mLay.height= ConvertDPtoPX(context,300);

                    user_clothes.setLayoutParams(mLay);

                    clothes = 30;
                }else{
                    user_clothes.setImageResource(R.drawable.empty_img);
                    clothes=0;
                }
            }
        });

    //여기서부터 모자
        hat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hat!=5){
                    user_hat.setImageResource(R.drawable.hat5);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_hat.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,15);
                    mLay.rightMargin = ConvertDPtoPX(context,27);
                    mLay.width = ConvertDPtoPX(context,280);
                    mLay.height= ConvertDPtoPX(context,280);

                    user_hat.setLayoutParams(mLay);

                    hat = 5;
                }else{
                    user_hat.setImageResource(R.drawable.empty_img);
                    hat=0;
                }
            }
        });

        hat10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hat!=10){
                    user_hat.setImageResource(R.drawable.hat10);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_hat.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,6);
                    mLay.rightMargin = ConvertDPtoPX(context,65);
                    mLay.width = ConvertDPtoPX(context,280);
                    mLay.height= ConvertDPtoPX(context,270);

                    user_hat.setLayoutParams(mLay);

                    hat = 10;
                }else{
                    user_hat.setImageResource(R.drawable.empty_img);
                    hat =0;
                }
            }
        });

        hat15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hat!=15){
                    user_hat.setImageResource(R.drawable.hat15);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_hat.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,6);
                    mLay.rightMargin = ConvertDPtoPX(context,65);
                    mLay.width = ConvertDPtoPX(context,280);
                    mLay.height= ConvertDPtoPX(context,270);

                    user_hat.setLayoutParams(mLay);

                    hat = 15;
                }else{
                    user_hat.setImageResource(R.drawable.empty_img);
                    hat=0;
                }
            }
        });

        hat20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hat!=20){
                    user_hat.setImageResource(R.drawable.hat20);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_hat.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,17);
                    mLay.rightMargin = ConvertDPtoPX(context,70);
                    mLay.width = ConvertDPtoPX(context,290);
                    mLay.height= ConvertDPtoPX(context,270);

                    user_hat.setLayoutParams(mLay);

                    hat = 10;
                }else{
                    user_hat.setImageResource(R.drawable.empty_img);
                    i=true;
                }
            }
        });

        hat25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hat!=25){
                    user_hat.setImageResource(R.drawable.hat25);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_hat.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,23);
                    mLay.rightMargin = ConvertDPtoPX(context,62);
                    mLay.width = ConvertDPtoPX(context,290);
                    mLay.height= ConvertDPtoPX(context,270);

                    user_hat.setLayoutParams(mLay);

                    hat = 25;
                }else{
                    user_hat.setImageResource(R.drawable.empty_img);
                    hat=0;
                }
            }
        });

        hat30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hat!=30){
                    user_hat.setImageResource(R.drawable.hat30);
                    ConstraintLayout.LayoutParams mLay = (ConstraintLayout.LayoutParams) user_hat.getLayoutParams();
                    Context context = getApplicationContext();
                    mLay.topMargin = ConvertDPtoPX(context,0);
                    mLay.rightMargin = ConvertDPtoPX(context,30);
                    mLay.width = ConvertDPtoPX(context,350);
                    mLay.height= ConvertDPtoPX(context,320);

                    user_hat.setLayoutParams(mLay);

                    hat = 30;
                }else{
                    user_hat.setImageResource(R.drawable.empty_img);
                    hat=0;
                }
            }
        });

    }

    public static int ConvertDPtoPX(Context context, int dp) {
        float density = context.getResources().getDisplayMetrics().density;
        return Math.round((float) dp * density);
    }


    private void userItem(int level1){
        //level이 textview의 값이여야 하는데 그게 안들어감.
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

            switch (level1) {
                case 5:
                    emoji5.setImageResource(R.drawable.unlock5_e);
                    clothes5.setImageResource(R.drawable.unlock5_c);
                    hat5.setImageResource(R.drawable.unlock5_h);
                    break;
                case 10:
                    emoji5.setImageResource(R.drawable.unlock5_e);
                    clothes5.setImageResource(R.drawable.unlock5_c);
                    hat5.setImageResource(R.drawable.unlock5_h);
                    emoji10.setImageResource(R.drawable.unlock10_e);
                    clothes10.setImageResource(R.drawable.unlock10_c);
                    hat10.setImageResource(R.drawable.unlock10_h);
                    break;
                case 15:
                    emoji5.setImageResource(R.drawable.unlock5_e);
                    clothes5.setImageResource(R.drawable.unlock5_c);
                    hat5.setImageResource(R.drawable.unlock5_h);
                    emoji10.setImageResource(R.drawable.unlock10_e);
                    clothes10.setImageResource(R.drawable.unlock10_c);
                    hat10.setImageResource(R.drawable.unlock10_h);
                    emoji15.setImageResource(R.drawable.unlock15_e);
                    clothes15.setImageResource(R.drawable.unlock15_c);
                    hat15.setImageResource(R.drawable.unlock15_h);
                    break;
                case 20:
                    emoji5.setImageResource(R.drawable.unlock5_e);
                    clothes5.setImageResource(R.drawable.unlock5_c);
                    hat5.setImageResource(R.drawable.unlock5_h);
                    emoji10.setImageResource(R.drawable.unlock10_e);
                    clothes10.setImageResource(R.drawable.unlock10_c);
                    hat10.setImageResource(R.drawable.unlock10_h);
                    emoji15.setImageResource(R.drawable.unlock15_e);
                    clothes15.setImageResource(R.drawable.unlock15_c);
                    hat15.setImageResource(R.drawable.unlock15_h);
                    emoji20.setImageResource(R.drawable.unlock20_e);
                    clothes20.setImageResource(R.drawable.unlock20_c);
                    hat20.setImageResource(R.drawable.unlock20_h);
                    break;
                case 25:
                    emoji5.setImageResource(R.drawable.unlock5_e);
                    clothes5.setImageResource(R.drawable.unlock5_c);
                    hat5.setImageResource(R.drawable.unlock5_h);
                    emoji10.setImageResource(R.drawable.unlock10_e);
                    clothes10.setImageResource(R.drawable.unlock10_c);
                    hat10.setImageResource(R.drawable.unlock10_h);
                    emoji15.setImageResource(R.drawable.unlock15_e);
                    clothes15.setImageResource(R.drawable.unlock15_c);
                    hat15.setImageResource(R.drawable.unlock15_h);
                    emoji20.setImageResource(R.drawable.unlock20_e);
                    clothes20.setImageResource(R.drawable.unlock20_c);
                    hat20.setImageResource(R.drawable.unlock20_h);
                    emoji25.setImageResource(R.drawable.unlock25_e);
                    clothes25.setImageResource(R.drawable.unlock25_c);
                    hat25.setImageResource(R.drawable.unlock25_h);
                    break;
                case 30:
                    emoji5.setImageResource(R.drawable.unlock5_e);
                    clothes5.setImageResource(R.drawable.unlock5_c);
                    hat5.setImageResource(R.drawable.unlock5_h);
                    emoji10.setImageResource(R.drawable.unlock10_e);
                    clothes10.setImageResource(R.drawable.unlock10_c);
                    hat10.setImageResource(R.drawable.unlock10_h);
                    emoji15.setImageResource(R.drawable.unlock15_e);
                    clothes15.setImageResource(R.drawable.unlock15_c);
                    hat15.setImageResource(R.drawable.unlock15_h);
                    emoji20.setImageResource(R.drawable.unlock20_e);
                    clothes20.setImageResource(R.drawable.unlock20_c);
                    hat20.setImageResource(R.drawable.unlock20_h);
                    emoji25.setImageResource(R.drawable.unlock25_e);
                    clothes25.setImageResource(R.drawable.unlock25_c);
                    hat25.setImageResource(R.drawable.unlock25_h);
                    emoji30.setImageResource(R.drawable.unlock30_e);
                    clothes30.setImageResource(R.drawable.unlock30_c);
                    hat30.setImageResource(R.drawable.unlock30_h);
                    break;

            }
        }

    /*private void expBar(int per) { //내가 void를 int 로 써놨늗네 얘가 int를 void로 바꿔놓음 이유가 뭔지
        //만들어야할게 레벨업 할 때마다 경험치 다르게 설정
        //여기서 per는 서버에서 사용자 경험치, 임시로 맨위에 0으로 초기화함
        ImageView exp_bar = findViewById(R.id.exp_bar);   //이게맞아? xml에 있는 경험치바임
        if(per==100){
            exp_bar.setImageResource(R.drawable.empty_exp);
        }
        int exp_per = (int) (per * 0.49);
        if (exp_per > 49 && exp_per<100) {
            exp_bar.setImageResource(R.drawable.half_exp);
        } else if(exp_per<=49 && exp_per==100)
            exp_bar.setImageResource(R.drawable.empty_exp);
    }*/
}
