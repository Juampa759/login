package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registro extends AppCompatActivity {
    private Button BtnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        BtnVolver = findViewById(R.id.BtnBack);
        BtnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenIdex();
            }
        });
    }
    public void OpenIdex(){
        Intent intent = new Intent(this,MainActivity.class );
        startActivity(intent);
    }
}
