package com.example.appvacinamais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.example.appvacinamais.ui.login.LoginActivity;

public class SplashActivity extends AppCompatActivity {

    String TAG = "APP VACINA MAIS";

    int tempoDeEspera = 1000 * 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(TAG, "onCreate: Tela Splash carregada....");

        trocarTela();

    }

    private void trocarTela() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent trocarDeTela = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(trocarDeTela);
                finish();


            }
        }, tempoDeEspera);



    }


}

