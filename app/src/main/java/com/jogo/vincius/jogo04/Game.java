package com.jogo.vincius.jogo04;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ImageButton d11 = (ImageButton) findViewById(R.id.d11);
        d11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Game.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Ator");
                alertDialog.show();
            }
        });

        ImageButton d13 = (ImageButton) findViewById(R.id.d13);
        d13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Game.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Ação");
                alertDialog.show();

            }
        });

        ImageButton d14 = (ImageButton) findViewById(R.id.d14);
        d14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Game.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Inicial de obrigação");
                alertDialog.show();

            }
        });

        ImageButton d15 = (ImageButton) findViewById(R.id.d15);
        d15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Game.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Arquivar/Registrar");
                alertDialog.show();

            }
        });

        ImageButton d31 = (ImageButton) findViewById(R.id.d31);
        d31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Game.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Inicial de férias");
                alertDialog.show();

            }
        });

        ImageButton d33 = (ImageButton) findViewById(R.id.d33);
        d33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Game.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Continente");
                alertDialog.show();

            }
        });

        ImageButton d34 = (ImageButton) findViewById(R.id.d34);
        d34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Game.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Leitura");
                alertDialog.show();

            }
        });

        ImageButton d41 = (ImageButton) findViewById(R.id.d41);
        d41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Game.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Agência Internacional de Pesquisa sobre o Câncer");
                alertDialog.show();
            }
        });

        ImageButton d51 = (ImageButton) findViewById(R.id.d51);
        d51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Game.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Ser/Estar");
                alertDialog.show();

            }
        });

        ImageButton d72 = (ImageButton) findViewById(R.id.d72);
        d72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Game.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Adicionar");
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
                EditText ed35 = (EditText) findViewById(R.id.ed35);
                EditText ed42 = (EditText) findViewById(R.id.ed42);
                EditText ed43 = (EditText) findViewById(R.id.ed43);
                EditText ed44 = (EditText) findViewById(R.id.ed44);
                EditText ed45 = (EditText) findViewById(R.id.ed45);
                EditText ed52 = (EditText) findViewById(R.id.ed52);
                EditText ed53 = (EditText) findViewById(R.id.ed53);
                EditText ed54 = (EditText) findViewById(R.id.ed54);
                EditText ed55 = (EditText) findViewById(R.id.ed55);
                EditText ed61 = (EditText) findViewById(R.id.ed61);
                EditText ed62 = (EditText) findViewById(R.id.ed62);
                EditText ed63 = (EditText) findViewById(R.id.ed63);
                EditText ed64 = (EditText) findViewById(R.id.ed64);
                EditText ed65 = (EditText) findViewById(R.id.ed65);
                EditText ed71 = (EditText) findViewById(R.id.ed71);
                EditText ed73 = (EditText) findViewById(R.id.ed73);
                EditText ed74 = (EditText) findViewById(R.id.ed74);
                EditText ed75 = (EditText) findViewById(R.id.ed75);

                if (ed12.getText().toString().equalsIgnoreCase("a") && ed21.getText().toString().equalsIgnoreCase("a") &&
                        ed22.getText().toString().equalsIgnoreCase("c") && ed23.getText().toString().equalsIgnoreCase("t") &&
                        ed24.getText().toString().equalsIgnoreCase("o") && ed25.getText().toString().equalsIgnoreCase("r") &&
                        ed32.getText().toString().equalsIgnoreCase("t") && ed35.getText().toString().equalsIgnoreCase("e") &&
                        ed42.getText().toString().equalsIgnoreCase("i") &&
                        ed43.getText().toString().equalsIgnoreCase("a") && ed44.getText().toString().equalsIgnoreCase("r") &&
                        ed45.getText().toString().equalsIgnoreCase("c") && ed52.getText().toString().equalsIgnoreCase("o") &&
                        ed53.getText().toString().equalsIgnoreCase("s") && ed54.getText().toString().equalsIgnoreCase("e") &&
                        ed55.getText().toString().equalsIgnoreCase("o") && ed61.getText().toString().equalsIgnoreCase("b") &&
                        ed62.getText().toString().equalsIgnoreCase("n") && ed63.getText().toString().equalsIgnoreCase("i") &&
                        ed64.getText().toString().equalsIgnoreCase("a") && ed65.getText().toString().equalsIgnoreCase("r") &&
                        ed71.getText().toString().equalsIgnoreCase("e") && ed73.getText().toString().equalsIgnoreCase("a") &&
                        ed74.getText().toString().equalsIgnoreCase("d") && ed75.getText().toString().equalsIgnoreCase("d")) {

                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(Game.this);
                        alertDialog.setTitle("Parabéns");
                        alertDialog.setMessage("Você ganhou");
                        alertDialog.show();

                } else {

                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(Game.this);
                    alertDialog.setTitle("Atenção");
                    alertDialog.setMessage("Há algo errado, reveja seus preenchimentos");
                    alertDialog.show();

                }

            }

        });

    }

}
