package com.example.ticutu.croco;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.example.ticutu.juego.R;

public class Final extends Activity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        MediaPlayer miPlayer = MediaPlayer.create(Final.this, R.raw.sonido_final);
        miPlayer.start();
    }
    public void onClickButton12(View any)
    {
        Intent intent = new Intent(Final.this, Juego.class);
        Final.this.startActivity(intent);
    }
}
