package com.example.ticutu.croco;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.example.ticutu.juego.R;

public class Juego extends Activity
{
    private AnimationDrawable animacion, loop;
    private MediaPlayer miPlayer;
    private int orden = 0;

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        ImageView video = (ImageView) findViewById(R.id.secuencia);
        video.setBackgroundResource(R.drawable.animation_drawable_start);
        animacion = (AnimationDrawable) video.getBackground();
        animacion.start();
        checkIfAnimationDone0(animacion);
    }
    public void checkIfAnimationDone0(AnimationDrawable anim)
    {
        final AnimationDrawable a = anim;
        int timeBetweenChecks = 20;
        android.os.Handler h = new android.os.Handler();
        h.postDelayed(new Runnable() {
            public void run() {
                if (a.getCurrent() != a.getFrame(a.getNumberOfFrames() - 1) && orden == 0) {
                    checkIfAnimationDone0(a);
                } else {
                    ImageView video = (ImageView) findViewById(R.id.secuencia);
                    video.setBackgroundResource(R.drawable.animation_drawable_loop_inicio);
                    loop = (AnimationDrawable) video.getBackground();
                    loop.start();
                    orden=1;
                }
            }
        }, timeBetweenChecks);
    };
    public void checkIfAnimationDone1(AnimationDrawable anim)
    {
        final AnimationDrawable a = anim;
        int timeBetweenChecks = 20;
        android.os.Handler h = new android.os.Handler();
        h.postDelayed(new Runnable() {
            public void run() {
                if (a.getCurrent() != a.getFrame(a.getNumberOfFrames() - 1) && orden == 1) {
                    checkIfAnimationDone1(a);
                } else {
                    ImageView video = (ImageView) findViewById(R.id.secuencia);
                    video.setBackgroundResource(R.drawable.animation_drawable_loop_boton_1);
                    loop = (AnimationDrawable) video.getBackground();
                    loop.start();
                    orden=2;
                }
            }
        }, timeBetweenChecks);
    };
    public void checkIfAnimationDone2(AnimationDrawable anim)
    {
        final AnimationDrawable a = anim;
        int timeBetweenChecks = 20;
        android.os.Handler h = new android.os.Handler();
        h.postDelayed(new Runnable() {
            public void run() {
                if (a.getCurrent() != a.getFrame(a.getNumberOfFrames() - 1) && orden == 2) {
                    checkIfAnimationDone2(a);
                } else {
                    ImageView video = (ImageView) findViewById(R.id.secuencia);
                    video.setBackgroundResource(R.drawable.animation_drawable_loop_boton_2);
                    loop = (AnimationDrawable) video.getBackground();
                    loop.start();
                }
            }
        }, timeBetweenChecks);
    };
    public void onClickButton2(View any)
    {
        if (animacion.getCurrent() == animacion.getFrame(animacion.getNumberOfFrames() - 1))
        {
            ImageView video = (ImageView) findViewById(R.id.secuencia);
            video.setBackgroundResource(R.drawable.animation_drawable_boton_1);
            animacion = (AnimationDrawable) video.getBackground();
            miPlayer = MediaPlayer.create(Juego.this, R.raw.sonido_boton_1);
            animacion.start();
            miPlayer.start();
            checkIfAnimationDone1(animacion);
        }
    }
    public void onClickButton3(View any)
    {
        if (animacion.getCurrent() == animacion.getFrame(animacion.getNumberOfFrames() - 1))
        {
            ImageView video = (ImageView) findViewById(R.id.secuencia);
            video.setBackgroundResource(R.drawable.animation_drawable_boton_2);
            animacion = (AnimationDrawable) video.getBackground();
            miPlayer = MediaPlayer.create(Juego.this, R.raw.sonido_boton_2);
            animacion.start();
            miPlayer.start();
            checkIfAnimationDone2(animacion);
        }
    }
    public void onClickButton4(View any)
    {
        if (animacion.getCurrent() == animacion.getFrame(animacion.getNumberOfFrames() - 1))
        {
            ImageView video = (ImageView) findViewById(R.id.secuencia);
            video.setBackgroundResource(R.drawable.animation_drawable_boton_3);
            animacion = (AnimationDrawable) video.getBackground();
            miPlayer = MediaPlayer.create(Juego.this, R.raw.sonido_boton_3);
            animacion.start();
            miPlayer.start();
        }
    }
    public void onClickButton5(View any)
    {
        if (animacion.getCurrent() == animacion.getFrame(animacion.getNumberOfFrames() - 1))
        {
            ImageView video = (ImageView) findViewById(R.id.secuencia);
            video.setBackgroundResource(R.drawable.animation_drawable_boton_4);
            animacion = (AnimationDrawable) video.getBackground();
            animacion.start();
        }
    }
    public void onClickButton6(View any)
    {
        if (animacion.getCurrent() == animacion.getFrame(animacion.getNumberOfFrames() - 1))
        {
            ImageView video = (ImageView) findViewById(R.id.secuencia);
            video.setBackgroundResource(R.drawable.animation_drawable_boton_5);
            animacion = (AnimationDrawable) video.getBackground();
            miPlayer = MediaPlayer.create(Juego.this, R.raw.sonido_boton_5);
            animacion.start();
            miPlayer.start();
        }
    }
    public void onClickButton7(View any)
    {
        if (animacion.getCurrent() == animacion.getFrame(animacion.getNumberOfFrames() - 1))
        {
            ImageView video = (ImageView) findViewById(R.id.secuencia);
            video.setBackgroundResource(R.drawable.animation_drawable_boton_6);
            animacion = (AnimationDrawable) video.getBackground();
            miPlayer = MediaPlayer.create(Juego.this, R.raw.sonido_boton_6);
            animacion.start();
            miPlayer.start();
        }
    }
    public void onClickButton8(View any)
    {
        if (animacion.getCurrent() == animacion.getFrame(animacion.getNumberOfFrames() - 1))
        {
            ImageView video = (ImageView) findViewById(R.id.secuencia);
            video.setBackgroundResource(R.drawable.animation_drawable_boton_7);
            animacion = (AnimationDrawable) video.getBackground();
            miPlayer = MediaPlayer.create(Juego.this, R.raw.sonido_boton_7);
            animacion.start();
            miPlayer.start();
        }
    }
    public void onClickButton9(View any)
    {
        if (animacion.getCurrent() == animacion.getFrame(animacion.getNumberOfFrames() - 1))
        {
            ImageView video = (ImageView) findViewById(R.id.secuencia);
            video.setBackgroundResource(R.drawable.animation_drawable_boton_8);
            animacion = (AnimationDrawable) video.getBackground();
            miPlayer = MediaPlayer.create(Juego.this, R.raw.sonido_boton_8);
            animacion.start();
            miPlayer.start();
        }
    }
    public void onClickButton10(View any)
    {
        if (animacion.getCurrent() == animacion.getFrame(animacion.getNumberOfFrames() - 1))
        {
            ImageView video = (ImageView) findViewById(R.id.secuencia);
            video.setBackgroundResource(R.drawable.animation_drawable_boton_9);
            animacion = (AnimationDrawable) video.getBackground();
            miPlayer = MediaPlayer.create(Juego.this, R.raw.sonido_boton_9);
            animacion.start();
            miPlayer.start();
        }
    }
    public void onClickButton11(View any)
    {
        if (animacion.getCurrent() == animacion.getFrame(animacion.getNumberOfFrames() - 1))
        {
            ImageView video = (ImageView) findViewById(R.id.secuencia);
            video.setBackgroundResource(R.drawable.animation_drawable_boton_10);
            animacion = (AnimationDrawable) video.getBackground();
            miPlayer = MediaPlayer.create(Juego.this, R.raw.sonido_boton_10);
            animacion.start();
            miPlayer.start();
        }
    }
}
