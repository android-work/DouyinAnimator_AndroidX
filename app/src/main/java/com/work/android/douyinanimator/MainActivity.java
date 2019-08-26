package com.work.android.douyinanimator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.work.android.douyinanimatorview.DouYinLoadTwoBallView;
import com.work.android.douyinanimatorview.DouyinLoadingBarView;
import com.work.android.douyinanimatorview.DownloadPopupWindowView;
import com.work.android.douyinanimatorview.ThreePointCycleSwitching;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DouYinLoadTwoBallView load_ball = findViewById(R.id.load_ball);
        DouyinLoadingBarView load_bar = findViewById(R.id.load_bar);
        DownloadPopupWindowView downloadPopupWindowView = findViewById(R.id.load_down);
        ThreePointCycleSwitching load_three = findViewById(R.id.load_three);

        load_ball.startAnimator();
        load_bar.startAnimator();
        load_three.startAnimator();

        for (float i =0 ; i<1; i+=0.01){
            downloadPopupWindowView.setCurrentPorgress(i);
        }
    }
}
