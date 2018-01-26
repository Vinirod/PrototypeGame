package com.jogo.vincius.jogo04;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);


        Button tabuleiro1 = (Button) findViewById(R.id.tabuleiro1);
        tabuleiro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Play.this, Game.class);
                    startActivity(intent);

            }
        });

        Button tabuleiro2 = (Button) findViewById(R.id.tabuleiro2);
        tabuleiro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Play.this, game1.class);
                startActivity(intent);

            }
        });

        Button tabuleiro3 = (Button) findViewById(R.id.tabuleiro3);
        tabuleiro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Play.this, game2.class);
                startActivity(intent);

            }
        });

    }

}
