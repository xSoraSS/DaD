package com.example.dad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

        Button opcionA = findViewById(R.id.opcionA); //Atlas Acompañará
        Button opcionB = findViewById(R.id.opcionB); //Atlas no Acompañará

//        startGame.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, GameActivity.class);
//                startActivity(intent);
//            }
//        });

    }
}
