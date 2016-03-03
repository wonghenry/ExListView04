package com.ehappy.exlistview04;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by wong on 2015/9/16.
 */
public class newone extends ActionBarActivity
{


    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.newone);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void gobackoutline1(View v)
    {
        Intent it = new Intent(this,newoutline.class);
        startActivity(it);
         newone.this.finish();


    }

    public boolean onKeyDown(int keyCode, KeyEvent event)
    {

        if ((keyCode == KeyEvent.KEYCODE_BACK)) {   //確定按下退出鍵

            Intent it = new Intent(this,newoutline.class);
            startActivity(it);
            newone.this.finish();
            return true;

        }

        return super.onKeyDown(keyCode, event);

    }

}
