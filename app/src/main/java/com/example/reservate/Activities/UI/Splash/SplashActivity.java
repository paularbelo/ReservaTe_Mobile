package com.example.reservate.Activities.UI.Splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.reservate.Activities.UI.Bienvenida.PrincipalActivity;
import com.example.reservate.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, PrincipalActivity.class);
                startActivity(intent);

            }
        }, 2000);
    }
}
