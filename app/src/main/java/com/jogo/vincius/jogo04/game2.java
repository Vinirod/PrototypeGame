package com.jogo.vincius.jogo04;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class game2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        ImageButton d11 = (ImageButton) findViewById(R.id.d11);
        d11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game2.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Canídeo");
                alertDialog.show();

            }
        });

        ImageButton d13 = (ImageButton) findViewById(R.id.d13);
        d13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game2.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Latino");
                alertDialog.show();

            }
        });

        ImageButton d14 = (ImageButton) findViewById(R.id.d14);
        d14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game2.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Isto");
                alertDialog.show();

            }
        });

        ImageButton d15 = (ImageButton) findViewById(R.id.d15);
        d15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game2.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Faz");
                alertDialog.show();
            }
        });

        ImageButton d31 = (ImageButton) findViewById(R.id.d31);
        d31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game2.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Inicial de Transição");
                alertDialog.show();

            }
        });

        ImageButton d33 = (ImageButton) findViewById(R.id.d33);
        d33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game2.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Para");
                alertDialog.show();

            }
        });

        ImageButton d41 = (ImageButton) findViewById(R.id.d41);
        d41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game2.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Por exemplo");
                alertDialog.show();

            }
        });

        ImageButton d44 = (ImageButton) findViewById(R.id.d44);
        d44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game2.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Oi");
                alertDialog.show();

            }
        });

        ImageButton d45 = (ImageButton) findViewById(R.id.d45);
        d45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game2.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("De");
                alertDialog.show();

            }
        });

        ImageButton d51 = (ImageButton) findViewById(R.id.d51);
        d51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game2.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Eco");
                alertDialog.show();

            }
        });

        ImageButton d61 = (ImageButton) findViewById(R.id.d61);
        d61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game2.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Inicial de necessário");
                alertDialog.show();

            }
        });

        ImageButton d63 = (ImageButton) findViewById(R.id.d63);
        d63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game2.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Se");
                alertDialog.show();

            }
        });

        Button abandonar = (Button) findViewById(R.id.abandonar);
        abandonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });

        Button completo = (Button) findViewById(R.id.completo);
        completo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText ed12 = (EditText) findViewById(R.id.ed12);
                EditText ed21 = (EditText) findViewById(R.id.ed21);
                EditText ed22 = (EditText) findViewById(R.id.ed22);
                EditText ed23 = (EditText) findViewById(R.id.ed23);
                EditText ed24 = (EditText) findViewById(R.id.ed24);
                EditText ed25 = (EditText) findViewById(R.id.ed25);
                EditText ed32 = (EditText) findViewById(R.id.ed32);
                EditText ed34 = (EditText) findViewById(R.id.ed34);
                EditText ed35 = (EditText) findViewById(R.id.ed35);
                EditText ed42 = (EditText) findViewById(R.id.ed42);
                EditText ed43 = (EditText) findViewById(R.id.ed43);
                EditText ed52 = (EditText) findViewById(R.id.ed52);
                EditText ed53 = (EditText) findViewById(R.id.ed53);
                EditText ed54 = (EditText) findViewById(R.id.ed54);
                EditText ed55 = (EditText) findViewById(R.id.ed55);
                EditText ed62 = (EditText) findViewById(R.id.ed62);
                EditText ed64 = (EditText) findViewById(R.id.ed64);
                EditText ed65 = (EditText) findViewById(R.id.ed65);

                int pontuacao = 1;
                if(ed12.getText().toString().equalsIgnoreCase("l") && ed21.getText().toString().equalsIgnoreCase("c") &&
                        ed22.getText().toString().equalsIgnoreCase("a") && ed23.getText().toString().equalsIgnoreCase("n") &&
                        ed24.getText().toString().equalsIgnoreCase("i") && ed25.getText().toString().equalsIgnoreCase("d") &&
                        ed32.getText().toString().equalsIgnoreCase("t") && ed34.getText().toString().equalsIgnoreCase("t") &&
                        ed35.getText().toString().equalsIgnoreCase("o") && ed42.getText().toString().equalsIgnoreCase("e") &&
                        ed43.getText().toString().equalsIgnoreCase("g") && ed52.getText().toString().equalsIgnoreCase("e") &&
                        ed53.getText().toString().equalsIgnoreCase("c") && ed54.getText().toString().equalsIgnoreCase("h") &&
                        ed55.getText().toString().equalsIgnoreCase("o") && ed62.getText().toString().equalsIgnoreCase("n") &&
                        ed64.getText().toString().equalsIgnoreCase("i") && ed65.getText().toString().equalsIgnoreCase("f")){

                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(game2.this);
                    alertDialog.setTitle("Parabéns");
                    alertDialog.setMessage("Você ganhou");
                    alertDialog.show();

                }else{

                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(game2.this);
                    alertDialog.setTitle("Atenção");
                    alertDialog.setMessage("Há algo errado! Reveja seus preechimentos");
                    alertDialog.show();
                }

            }

        });



    }

}
