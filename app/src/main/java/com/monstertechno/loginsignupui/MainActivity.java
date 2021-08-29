package com.monstertechno.loginsignupui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import soup.neumorphism.ShapeType;

public class MainActivity extends AppCompatActivity {
    TextView signuprtn_button;
    Button signin_button;
    TextView forgotpasstrn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_main);

        signuprtn_button = findViewById(R.id.Signuprtn);
        signin_button = findViewById(R.id.Signin);
        forgotpasstrn = findViewById(R.id.forgotpassrtn);

        signuprtn_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });
        forgotpasstrn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent nt = new Intent(MainActivity.this,frgtpass.class);
                startActivity(nt);
            }
        });



    }


}
