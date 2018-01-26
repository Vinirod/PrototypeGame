package com.jogo.vincius.jogo04;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class game1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);

        ImageButton d11 = (ImageButton) findViewById(R.id.d11);
        d11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game1.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Pegar");
                alertDialog.show();

            }
        });

        ImageButton d13 = (ImageButton) findViewById(R.id.d13);
        d13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game1.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Uma");
                alertDialog.show();

            }
        });

        ImageButton d15 = (ImageButton) findViewById(R.id.d15);
        d15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game1.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Não");
                alertDialog.show();

            }
        });

        ImageButton d21 = (ImageButton) findViewById(R.id.d21);
        d21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game1.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Inicial de cabeça");
                alertDialog.show();

            }

        });

        ImageButton d23 = (ImageButton) findViewById(R.id.d23);
        d23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game1.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Dentro");
                alertDialog.show();
            }
        });

        ImageButton d33 = (ImageButton) findViewById(R.id.d33);
        d33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game1.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Para");
                alertDialog.show();

            }
        });

        ImageButton d41 = (ImageButton) findViewById(R.id.d41);
        d41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game1.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Gato");
                alertDialog.show();

            }
        });

        ImageButton d45 = (ImageButton) findViewById(R.id.d45);
        d45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game1.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Ligar");
                alertDialog.show();

            }
        });

        ImageButton d51 = (ImageButton) findViewById(R.id.d51);
        d51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game1.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Inicial de escuro");
                alertDialog.show();
            }
        });

        ImageButton d53 = (ImageButton) findViewById(R.id.d53);
        d53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game1.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Ir");
                alertDialog.show();
            }
        });

        ImageButton d62 = (ImageButton) findViewById(R.id.d62);
        d62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(game1.this);
                alertDialog.setTitle("Dica");
                alertDialog.setMessage("Poder");
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
                EditText ed14 = (EditText) findViewById(R.id.ed14);
                EditText ed22 = (EditText) findViewById(R.id.ed22);
                EditText ed24 = (EditText) findViewById(R.id.ed24);
                EditText ed25 = (EditText) findViewById(R.id.ed25);
                EditText ed31 = (EditText) findViewById(R.id.ed31);
                EditText ed32 = (EditText) findViewById(R.id.ed32);
                EditText ed34 = (EditText) findViewById(R.id.ed34);
                EditText ed35 = (EditText) findViewById(R.id.ed35);
                EditText ed42 = (EditText) findViewById(R.id.ed42);
                EditText ed43 = (EditText) findViewById(R.id.ed43);
                EditText ed44 = (EditText) findViewById(R.id.ed44);
                EditText ed52 = (EditText) findViewById(R.id.ed52);
                EditText ed54 = (EditText) findViewById(R.id.ed54);
                EditText ed55 = (EditText) findViewById(R.id.ed55);
                EditText ed61 = (EditText) findViewById(R.id.ed61);
                EditText ed63 = (EditText) findViewById(R.id.ed63);
                EditText ed64 = (EditText) findViewById(R.id.ed64);
                EditText ed65 = (EditText) findViewById(R.id.ed65);

                int  pontuacao = 1;
                if(ed12.getText().toString().equalsIgnoreCase("c") && ed14.getText().toString().equalsIgnoreCase("a") &&
                        ed22.getText().toString().equalsIgnoreCase("a") && ed24.getText().toString().equalsIgnoreCase("i") &&
                        ed25.getText().toString().equalsIgnoreCase("n") && ed31.getText().toString().equalsIgnoreCase("h") &&
                        ed32.getText().toString().equalsIgnoreCase("t") && ed34.getText().toString().equalsIgnoreCase("t") &&
                        ed35.getText().toString().equalsIgnoreCase("o") && ed42.getText().toString().equalsIgnoreCase("c") &&
                        ed43.getText().toString().equalsIgnoreCase("a") && ed44.getText().toString().equalsIgnoreCase("t") &&
                        ed52.getText().toString().equalsIgnoreCase("h") && ed54.getText().toString().equalsIgnoreCase("g") &&
                        ed55.getText().toString().equalsIgnoreCase("o") && ed61.getText().toString().equalsIgnoreCase("d") &&
                        ed63.getText().toString().equalsIgnoreCase("c") && ed64.getText().toString().equalsIgnoreCase("a") &&
                        ed65.getText().toString().equalsIgnoreCase("n")){

                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(game1.this);
                    alertDialog.setTitle("Parabéns");
                    alertDialog.setMessage("Você ganhou");
                    alertDialog.show();

                }else{

                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(game1.this);
                    alertDialog.setTitle("Atenção");
                    alertDialog.setMessage("Há algo errado! Reveja seus preechimentos");
                    alertDialog.show();

                }

            }

        });

    }

}
