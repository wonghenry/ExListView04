package com.ehappy.exlistview04;

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
public class newthree extends ActionBarActivity implements MediaPlayer.OnPreparedListener,
        MediaPlayer.OnErrorListener,
        MediaPlayer.OnCompletionListener
{
    Uri uri;
    Button mbtnplay3;
    MediaPlayer mper2;
    Toast tos;
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.newthree);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        mbtnplay3=(Button)findViewById(R.id.btnplay3);
        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.three);
        mper2 =new MediaPlayer();
        mper2.setOnPreparedListener(this);
        mper2.setOnErrorListener(this);
        mper2.setOnCompletionListener(this);
        tos=Toast.makeText(this,"",Toast.LENGTH_SHORT);
        prepareMusic();
    }
    public  void prepareMusic()
    {
        mbtnplay3.setText("播放MP3");
        try
        {
            mper2.reset();
            mper2.setDataSource(this, uri);
            mper2.prepareAsync();
        }catch (Exception e)
        {
            tos.setText("檔案錯誤!");
            tos.show();
        }
    }
    @Override
    public void onPrepared(MediaPlayer mp)
    {
        mbtnplay3.setEnabled(true);
    }
    @Override
    public void onCompletion(MediaPlayer mp)
    {
        mper2.seekTo(0);
        mbtnplay3.setText("播放MP3");
    }
    @Override
    public boolean onError(MediaPlayer mp,int what,int extra)
    {
        tos.setText("發生錯誤");
        tos.show();
        return true;
    }
    public void onMpPlay(View v)
    {
        if(mper2.isPlaying())
        {
            mper2.pause();
            mbtnplay3.setText("播放MP3");
        }else
        {
            mper2.start();
            mbtnplay3.setText("暫停");
        }
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        if(mper2.isPlaying())
        {
            mbtnplay3.setText("播放MP3");
            mper2.pause();
        }
    }
    @Override
    protected void onDestroy()
    {
        mper2.release();
        super.onDestroy();
    }
    public void gobackoutline3(View v)
    {
        Intent it = new Intent(this,newoutline.class);
        startActivity(it);
        newthree.this.finish();
    }
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {

        if ((keyCode == KeyEvent.KEYCODE_BACK)) {   //確定按下退出鍵

            Intent it = new Intent(this,newoutline.class);
            startActivity(it);
            newthree.this.finish();
            return true;

        }

        return super.onKeyDown(keyCode, event);

    }
}