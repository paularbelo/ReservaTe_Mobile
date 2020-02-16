package com.example.reservate.Activities.UI.Bienvenida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import android.widget.Button;

import com.example.reservate.Activities.UI.Account.LoginActivity;
import com.example.reservate.Activities.UI.Home.MainActivity;
import com.example.reservate.R;

public class PrincipalActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pincipal);

        final Button login=findViewById(R.id.login);
        final Button comenzar = findViewById(R.id.comenzar);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrincipalActivity.this, LoginActivity.class));
                finish();
            }

        });

        comenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PrincipalActivity.this, MainActivity.class));
                finish();
            }

        });

    }
}
