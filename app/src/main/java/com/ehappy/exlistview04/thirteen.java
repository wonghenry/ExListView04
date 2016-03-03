package com.ehappy.exlistview04;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.View;


public class thirteen extends ActionBarActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirteen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
    public void gobackoutline13(View v)
    {
        Intent it = new Intent(this,newoutline.class);
        startActivity(it);
        thirteen.this.finish();
    }
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {

        if ((keyCode == KeyEvent.KEYCODE_BACK)) {   //確定按下退出鍵

            Intent it = new Intent(this,newoutline.class);
            startActivity(it);
            finish();
            thirteen.this.finish();
            return true;

        }

        return super.onKeyDown(keyCode, event);

    }

}

