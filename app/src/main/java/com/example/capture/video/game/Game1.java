package com.example.capture.video.game;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
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
    MediaPlayer mediaPlayer;
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

        mediaPlayer = MediaPlayer.create(this, R.raw.mgame1);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();


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
        }
    }

    private void startTimerTask() {
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
                        TextView.setText(count + " ???");
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
            TextView.setText("30 ???");
            timerTask.cancel();
            timerTask = null;
            Intent intent = new Intent(getApplicationContext(),Game1Over.class);
            startActivity(intent);
        }
    }

    void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Game1.this);
            builder.setIcon(R.drawable.bt_hint);
            builder.setTitle("??????");
            builder.setMessage("??? ?????? ????????? ????????? ?????? ????????? ???????????? ?????????");
            builder.setPositiveButton("??????", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
        builder.show();
    }

    void showDialog2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Game1.this);
            builder.setIcon(R.drawable.bt_stop);
            builder.setTitle("????????????");

            builder.setPositiveButton("????????????", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });

            builder.setNegativeButton("?????????", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
            });
            builder.show();
    }

}
