package com.example.capture.video.game;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Character extends AppCompatActivity {
    int per=0;  //여기에다가 서버에서 받는 경험치 넣어야함. onCreate에다가 넣어야할지 아니면 다른데다가 넣어야할진 모르겠음
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character);


        TextView level=findViewById(R.id.level);
        ImageView user_character=findViewById(R.id.user_character);
        ImageView exp_bar=findViewById(R.id.exp_bar);
        ImageView emoji5=findViewById(R.id.emoji5);
        ImageView emoji10=findViewById(R.id.emoji10);
        ImageView emoji15=findViewById(R.id.emoji15);
        ImageView emoji20=findViewById(R.id.emoji20);
        ImageView emoji25=findViewById(R.id.emoji25);
        ImageView emoji30=findViewById(R.id.emoji30);


        level.setText("Lv"+"30");
        //30에는 서버에서 받은걸 넣기.


        Button go_game=findViewById(R.id.go_game);
        go_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Button reset=findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_character.setImageResource(R.drawable.character_basic);
            }
        });

        Button save=findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //캐릭터를 꾸미고 꾸민 이미지를 메인 화면에다 넣는건가? 아니면 그냥 꾸미기창에 보이기? 쨌든 최종으로 꾸민 걸 저장해야함.
            }
        });



        //level==5했을 때 level이 빨간밑줄(int가 아니여서그런듯)
        //한번만 실행하고 끝인가?(이 화면 켜질때 한번만 실행하면 되니까 반복안해도됨)
        //swith case문으로 했을 때 만약 20이라면 5~15까지레벨이 풀려야하는데 20이면 20만 풀리면 어떡하지? if문을 써야하나?(일단대충해결)
        if(level==5||level==10||level==15||level==20||level==25||level==30) {
            userItem(level);
        }

        //서버에서 경험치 받아와서 경험치 바 표시
        //expBar 함수 호출해서 맞는 이미지로 바꾸기 이게맞나?
        exp_bar.setImageResource(expBar());

        emoji5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(level==5){
                    user_character.setImageResource(R.drawable.emoji5);
                }
            }
        });

        emoji10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(level==10){
                    user_character.setImageResource(R.drawable.emoji10);
                }
            }
        });

        emoji15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(level==15){
                    user_character.setImageResource(R.drawable.emoji15);
                }
            }
        });

        emoji20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(level==20){
                    user_character.setImageResource(R.drawable.emoji20);
                }
            }
        });

        emoji25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(level==25){
                    user_character.setImageResource(R.drawable.emoji25);
                }
            }
        });

        emoji30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(level==30){
                    user_character.setImageResource(R.drawable.emoji30);
                }
            }
        });


    }

    //근데 여기 메소드 만들때 private int userItem(level)이 아니야? 근데 이렇게하면 또 이상하게 되긴함.
    private void userItem(int level){
        //level이 textview의 값이여야 하는데 그게 안들어감.
        //userItem이 죽어있음. => onCreate에서 호출하면 되려나?(ㅇ)
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

            switch (level) {
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

    private int expBar(per) {
        //만들어야할게 레벨업 할 때마다 경험치 다르게 설정
        //여기서 per는 서버에서 사용자 경험치, 임시로 맨위에 0으로 초기화함
        ImageView exp_bar = findViewById(R.id.exp_bar);   //이게맞아? xml에 있는 경험치바임
        int exp_per = (int) (per * 0.49);
        if (exp_per > 49 && exp_per<100) {
            exp_bar.setImageResource(R.drawable.half_exp);
        } else if(exp_per<=49 && exp_per==100)
            exp_bar.setImageResource(R.drawable.empty_exp);
    }
    //아이콘 눌렀을 때 캐릭터 변하기
    private void characterSet(){
        if ()
    }
}
