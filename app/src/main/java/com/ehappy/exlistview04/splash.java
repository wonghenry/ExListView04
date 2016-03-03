package com.ehappy.exlistview04;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class splash extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wellcome);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    Thread.sleep(1000);//這邊可以做你想預先載入的資料
                    //接下來轉跳到app的主畫面
                    startActivity(new Intent().setClass(splash.this,newoutline.class));
                    finish();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }

        }).start();

    }


}
