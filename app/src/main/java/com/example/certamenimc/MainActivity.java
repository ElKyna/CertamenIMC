package com.example.certamenimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText Peso, Estatura, ValorIMC;
    Button CalcularIMC;
    Spinner Sexo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
//https://github.com/ElKyna/CertamenIMC
    public void Calcular (View view) {

        Peso = findViewById(R.id.txtPeso);
        Estatura = findViewById(R.id.txtEstatura);
        ValorIMC = findViewById(R.id.txtIMC);
        CalcularIMC = findViewById(R.id.button);
        Sexo = findViewById(R.id.SpinnerSexo);

        String  PesoPersona =Peso.getText().toString();
        String EstaturaPersona= Estatura.getText().toString();
        Double PesoP = Double.parseDouble(PesoPersona);
        Double EstaturaM = Double.parseDouble(EstaturaPersona)/100.0;
        Double IMC = PesoP / (EstaturaM * EstaturaM) ;

        if (IMC<18.5){
            ValorIMC.setText("Bajo Peso");
        } else if (IMC) {

        }

    }




}