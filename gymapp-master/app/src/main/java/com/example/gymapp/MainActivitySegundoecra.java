package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivitySegundoecra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_segundoecra);
        final float[] imc = new float[1];
        Button btCaulcular = (Button) findViewById(R.id.btCalcular);
        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View v){
                TextView editPeso = (TextView) findViewById(R.id.editPeso);
                TextView editAltura = (TextView) findViewById(R.id.editAltura);
                TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
                TextView tvDescricao = (TextView) findViewById(R.id.tvDescricao);
                int peso = Integer.parseInt(editPeso.getText().toString());
                float altura = Float.parseFloat(editAltura.getText().toString());
                imc[0] = peso / (altura * altura);
                if (imc[0]<18.5) {
                    tvResultado.setText(imc[0] + "");
                    tvDescricao.setText("Baixo Peso");
                }else{
                    if (imc[0]<25) {
                        tvResultado.setText(imc[0] + "");
                        tvDescricao.setText("Peso Adequado");
                    }else{
                        if (imc[0]<30) {
                            tvResultado.setText(imc[0] + "");
                            tvDescricao.setText("Peso a mais");
                        }else{
                            if (imc[0]<30) {
                                tvResultado.setText(imc[0] + "");
                                tvDescricao.setText("Obesidade");
                        }

                    }
                }

            }
        }
    }
}