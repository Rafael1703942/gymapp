package com.example.programaoparadispositivosmoveis_trabalho;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ecra2 extends AppCompatActivity {


    EditText txpeso, txaltura;
    button btCalcular;
    TextView7 txIMC, txResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecra2);

        txpeso = (EditText) findViewById(R.id.txpeso)

    }

    public void calculateButton(View view){ //onclick (View view)
        double dpeso, daltura, dimc;
        String sMensagem;
        txpeso = Double.parseDouble(txpeso.getText().toString());
        txaltura = Double.parseDouble(txpeso.getText().toString());

        try {
            dimc = dpeso / (daltura * daltura);
            if (dimc < 16)
                SMensagem = "magreza severa";
            else if (dimc < 17)
                SMensagem = "magreza moderada";
            else if (dimc < 18.5)
                SMensagem = "magreza leve";
            else if (dimc < 25)
                SMensagem = "mpeso normal";
            else if (dimc < 30)
                SMensagem = "Sobrepeso";
            else if (dimc < 35)
                SMensagem = "Obesidade classe I";
            else if (dimc < 40)
                SMensagem = "Obesidade classe II";
            else
                SMensagem = "Obesidade classe III";
            tximc.setText(String.valueOf(dimc));
            txresultado.setTExt(sMensagem);
        } catch (Exception e) {
        }


    }
}
