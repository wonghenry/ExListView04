package com.ehappy.exlistview04;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.View;

/**
 * Created by wong on 2015/9/13.
 */
public class newoutline extends ActionBarActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newoutline);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
    public void gotoone(View v)
    {
        Intent it = new Intent(this,newone.class);
        startActivity(it);
        finish();
    }
    public void gototwo(View v)
    {
        Intent it = new Intent(this,newtwo.class);
        startActivity(it);
        finish();
    }
    public void gotothree(View v)
    {
        Intent it = new Intent(this,newthree.class);
        startActivity(it);
        finish();
    }
    public void gotofour(View v)
    {
        Intent it = new Intent(this,four.class);
        startActivity(it);
        finish();
    }
    public void gotofive(View v)
    {
        Intent it = new Intent(this,five.class);
        startActivity(it);
        finish();
    }
    public void gotosix(View v)
    {
        Intent it = new Intent(this,newsix.class);
        startActivity(it);
        finish();
    }
    public void gotoseven(View v)
    {
        Intent it = new Intent(this,newseven.class);
        startActivity(it);
        finish();
    }
    public void gotoeight(View v)
    {
        Intent it = new Intent(this,neweight.class);
        startActivity(it);
        finish();
    }
    public void gotonine(View v)
    {
        Intent it = new Intent(this,nine.class);
        startActivity(it);
        finish();
    }
    public void gototen(View v)
    {
        Intent it = new Intent(this,ten.class);
        startActivity(it);
        finish();
    }
    public void gotoeleven(View v)
    {
        Intent it = new Intent(this,neweleven.class);
        startActivity(it);
        finish();
    }
    public void gototwelve(View v)
    {
        Intent it = new Intent(this,twelve.class);
        startActivity(it);
        finish();
    }
    public void gotothirteen(View v)
    {
        Intent it = new Intent(this,thirteen.class);
        startActivity(it);
        finish();
    }
    public void gotoalarm(View v)
    {
        Intent intent =new Intent();
        intent.setAction("android.intent.action.SET_ALARM");
        startActivity(intent);
        finish();
    }
    public void gotointrod(View v)
    {
        Intent it = new Intent(this,introduction.class);
        startActivity(it);
        finish();
    }

    public void gotoabout(View v)
    {
        Intent it = new Intent(this,about.class);
        startActivity(it);
        finish();
    }
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {

        if ((keyCode == KeyEvent.KEYCODE_BACK)) {   //確定按下退出鍵

            ConfirmExit(); //呼叫ConfirmExit()函數

            return true;

        }

        return super.onKeyDown(keyCode, event);

    }
    public void ConfirmExit()
    {

        AlertDialog.Builder ad=new AlertDialog.Builder(newoutline.this); //創建訊息方塊

        ad.setTitle("吉祥圓滿");

        ad.setMessage("是否要離開?記得要做迴向哦!");

        ad.setPositiveButton("是", new DialogInterface.OnClickListener()
        { //按"是",則退出應用程式

            public void onClick(DialogInterface dialog, int i)
            {

                //newoutline.this.finish();//關閉activity
                //System.exit(0);
                android.os.Process.killProcess(android.os.Process.myPid());

            }

        });

        ad.setNegativeButton("否",new DialogInterface.OnClickListener() { //按"否",則不執行任何操作

            public void onClick(DialogInterface dialog, int i) {

            }

        });

        ad.show();//顯示訊息視窗

    }



}
