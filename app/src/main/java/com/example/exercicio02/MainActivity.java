package com.example.exercicio02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText dados, lados;
    TextView resultado;
    Button lancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dados = findViewById(R.id.dados);
        lados = findViewById(R.id.faces);
        resultado = findViewById(R.id.resultado);
        lancar = findViewById(R.id.lancar);
    }

    public void lancarDados(View view) {
        if(!dados.getText().toString().isEmpty() && !lados.getText().toString().isEmpty()){
            Random random = new Random();
            int soma = 0;
            int lado = Integer.parseInt(lados.getText().toString());
            int dado = Integer.parseInt(dados.getText().toString());
            String saida="";
            for(int i=1;i<=dado;i++){
                int aux = random.nextInt((lado - 1) + 1) + 1;
                soma= soma + aux;
                saida=saida+String.valueOf(i)+" Dado - Valor: "+String.valueOf(aux)+"\n";
            }
            resultado.setText(saida + "(Valor total dos lados: "+String.valueOf(soma)+")");
        }
    }
}
