package com.example.capture.video.game;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class Game1 extends AppCompatActivity {

    Button btn_hint;
    Button btn_stop;
    TextView TextView;
    TimerTask timerTask;
    Timer timer = new Timer();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game1);

        TextView = findViewById(R.id.Time);
        btn_hint = findViewById(R.id.Hint);
        btn_stop = findViewById(R.id.Stop);

        btn_hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog2();
            }
        });

    }

    @Override
    protected void onDestroy()
    {
        timer.cancel();
        super.onDestroy();
    }

    public void clickHandler(View view)
    {
        switch(view.getId())
        {
            case R.id.Start:
                startTimerTask();
                break;
            case R.id.Stop:
                stopTimerTask();
                break;
        }
    }

    private void startTimerTask()
    {
        stopTimerTask();

        timerTask = new TimerTask()
        {
            int count = 30;

            @Override
            public void run()
            {
                count--;
                TextView.post(new Runnable() {
                    @Override
                    public void run() {
                        TextView.setText(count + " 초");
                    }
                });
            }
        };
        timer.schedule(timerTask,0 ,1000);
    }

    private void stopTimerTask()
    {
        if(timerTask != null)
        {
            TextView.setText("30 초");
            timerTask.cancel();
            timerTask = null;
        }
    }

    void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Game1.this);
            builder.setIcon(R.drawable.bt_hint);
            builder.setTitle("힌트");
            builder.setMessage("두 개의 카드를 뒤집어 같은 그림이 나오도록 하세요");
            builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
        builder.show();
    }

    void showDialog2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Game1.this);
            builder.setIcon(R.drawable.bt_stop);
            builder.setTitle("일시정지");

            builder.setPositiveButton("다시하기", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });

            builder.setNegativeButton("나가기", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            builder.show();
    }

}
