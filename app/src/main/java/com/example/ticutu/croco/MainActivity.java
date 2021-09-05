package com.example.ticutu.juego;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.example.ticutu.croco.Juego;


public class MainActivity extends Activity
{

    private MediaPlayer miPlayer;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ejecutaSonido();
    }//end on create
    public void onClickButton(View any)
    {
        Intent intent = new Intent(MainActivity.this, Juego.class);
        MainActivity.this.startActivity(intent);
    }
    public void ejecutaSonido()
    {
        miPlayer = MediaPlayer.create(MainActivity.this,R.raw.sonidointro);
        miPlayer.start();
    }
}
