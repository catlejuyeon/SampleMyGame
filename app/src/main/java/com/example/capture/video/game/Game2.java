package com.example.capture.video.game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class Game2 extends AppCompatActivity {

    android.widget.TextView TextView;
    TimerTask timerTask;
    Timer timer = new Timer();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game2);

        TextView = findViewById(R.id.Time);

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
            int count = 60;

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
}
