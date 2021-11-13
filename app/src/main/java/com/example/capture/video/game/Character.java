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
    boolean i=true;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character);
        int level1=15;
        int per=150;

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
        if(level1==5||level1==10||level1==15||level1==20||level1==25||level1==30) {
            userItem(level1);
        }

        //서버에서 경험치 받아와서 경험치 바 표시
        //식이 잘못됨. 100을채워야 레벨업이 된다면 90일떄 0.49를하면 44가 나옴.
        //int exp_per=per/5; 해서 5보다 크거나 같고 100보다 작을 때 조건줘도 되긴함.
        int exp_per = (int) (per * 0.49);
        if(exp_per > 49 && exp_per<100) {
            exp_bar.setImageResource(R.drawable.half_exp);
        }else
            exp_bar.setImageResource(R.drawable.empty_exp);



//여기서부터 표정
        emoji5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_character.setImageResource(R.drawable.emoji5);
                    i=false;
                }else{
                    user_character.setImageResource(R.drawable.character_basic);
                    i=true;
                }
            }
        });

        emoji10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_character.setImageResource(R.drawable.emoji10);
                    i=false;
                }else{
                    user_character.setImageResource(R.drawable.character_basic);
                    i=true;
                }
            }
        });

        emoji15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_character.setImageResource(R.drawable.emoji15);
                    i=false;
                }else{
                    user_character.setImageResource(R.drawable.character_basic);
                    i=true;
                }
            }
        });

        emoji20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_character.setImageResource(R.drawable.emoji20);
                    i=false;
                }else{
                    user_character.setImageResource(R.drawable.character_basic);
                    i=true;
                }
            }
        });

        emoji25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_character.setImageResource(R.drawable.emoji25);
                    i=false;
                }else{
                    user_character.setImageResource(R.drawable.character_basic);
                    i=true;
                }
            }
        });

        emoji30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_character.setImageResource(R.drawable.emoji30);
                    i=false;
                }else{
                    user_character.setImageResource(R.drawable.character_basic);
                    i=true;
                }
            }
        });



    // 여기서부터 옷
        clothes5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_clothes.setImageResource(R.drawable.clothes5);
                    i=false;
                }else{
                    user_clothes.setImageResource(R.drawable.empty_img);
                    i=true;
                }
            }
        });

        clothes10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_clothes.setImageResource(R.drawable.clothes10);
                    i=false;
                }else{
                    user_clothes.setImageResource(R.drawable.empty_img);
                    i=true;
                }
            }
        });

        clothes15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_clothes.setImageResource(R.drawable.clothes15);
                    i=false;
                }else{
                    user_clothes.setImageResource(R.drawable.empty_img);
                    i=true;
                }
            }
        });

        clothes20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_clothes.setImageResource(R.drawable.clothes20);
                    i=false;
                }else{
                    user_clothes.setImageResource(R.drawable.empty_img);
                    i=true;
                }
            }
        });

        clothes25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_clothes.setImageResource(R.drawable.clothes25);
                    i=false;
                }else{
                    user_clothes.setImageResource(R.drawable.empty_img);
                    i=true;
                }
            }
        });

        clothes30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_clothes.setImageResource(R.drawable.clothes30);
                    i=false;
                }else{
                    user_clothes.setImageResource(R.drawable.empty_img);
                    i=true;
                }
            }
        });

    //여기서부터 모자
        hat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_hat.setImageResource(R.drawable.hat5);
                    i=false;
                }else{
                    user_hat.setImageResource(R.drawable.empty_img);
                    i=true;
                }
            }
        });

        hat10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_hat.setImageResource(R.drawable.hat10);
                    i=false;
                }else{
                    user_hat.setImageResource(R.drawable.empty_img);
                    i=true;
                }
            }
        });

        hat15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_hat.setImageResource(R.drawable.hat15);
                    i=false;
                }else{
                    user_hat.setImageResource(R.drawable.empty_img);
                    i=true;
                }
            }
        });

        hat20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_hat.setImageResource(R.drawable.hat20);
                    i=false;
                }else{
                    user_hat.setImageResource(R.drawable.empty_img);
                    i=true;
                }
            }
        });

        hat25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_hat.setImageResource(R.drawable.hat25);
                    i=false;
                }else{
                    user_hat.setImageResource(R.drawable.empty_img);
                    i=true;
                }
            }
        });

        hat30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==true){
                    user_hat.setImageResource(R.drawable.hat30);
                    i=false;
                }else{
                    user_hat.setImageResource(R.drawable.empty_img);
                    i=true;
                }
            }
        });

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
