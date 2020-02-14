package com.example.gastoenergetico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText peso, estatura, edad;
    TextView mensaje;
    RadioButton hombre, mujer;
    Spinner item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = (EditText)findViewById(R.id.etPeso);
        estatura = (EditText)findViewById(R.id.etEstatura);
        edad = (EditText)findViewById(R.id.etEdad);
        mensaje = (TextView)findViewById(R.id.tvMensaje);
        hombre = (RadioButton)findViewById(R.id.rbHombre);
        mujer = (RadioButton)findViewById(R.id.rbMujer);
        item = (Spinner)findViewById(R.id.spItem);

        String[] opciones={"Sedentaria", "Ligera", "Moderada", "Intensa", "Muy intensa", "Accion dinamica"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, opciones);
        item.setAdapter(adapter);
    }

    public void CalcularSegunTipo(View view){

        String valor1 = peso.getText().toString();
        String valor2 = estatura.getText().toString();
        String valor3 = edad.getText().toString();
        double peso1 = Double.parseDouble(valor1);
        double estatura1 = Double.parseDouble(valor2);
        int edad1 = Integer.parseInt(valor3);

        if(hombre.isChecked() == true){

            String actividad = item.getSelectedItem().toString();

            if(actividad.equals("Sedentaria")){

                double GET = (66.5+(13.7*peso1)+(5*estatura1)-(6.8*edad1));
                double GET1 = (GET*0.20)+GET;
                String resultado = String.valueOf(GET1);
                mensaje.setText(resultado);
            }
            if(actividad.equals("Ligera")){

                double GET = 66.5+(13.7*peso1)+(5*estatura1)-(6.8*edad1);
                double GET1 = (GET*0.30)+GET;
                String resultado = String.valueOf(GET1);
                mensaje.setText(resultado);
            }
            if(actividad.equals("Moderada")){

                double GET = 66.5+(13.7*peso1)+(5*estatura1)-(6.8*edad1);
                double GET1 = (GET*0.40)+GET;
                String resultado = String.valueOf(GET1);
                mensaje.setText(resultado);
            }
            if(actividad.equals("Intensa")){

                double GET = 66.5+(13.7*peso1)+(5*estatura1)-(6.8*edad1);
                double GET1 = (GET*0.50)+GET;
                String resultado = String.valueOf(GET1);
                mensaje.setText(resultado);
            }
            if(actividad.equals("Muy intensa")){

                double GET = 66.5+(13.7*peso1)+(5*estatura1)-(6.8*edad1);
                double GET1 = (GET*0.70)+GET;
                String resultado = String.valueOf(GET1);
                mensaje.setText(resultado);
            }
            if(actividad.equals("Accion dinamica")){

                double GET = 66.5+(13.7*peso1)+(5*estatura1)-(6.8*edad1);
                double GET1 = (GET*0.10)+GET;
                String resultado = String.valueOf(GET1);
                mensaje.setText(resultado);
            }
        }else if(mujer.isChecked() == true){

            String actividad = item.getSelectedItem().toString();

            if(actividad.equals("Sedentaria")){

                double GET = 655.1+(9.56*peso1)+(1.85*estatura1)-(4.7*edad1);
                double GET1 = (GET*0.20)+GET;
                String resultado = String.valueOf(GET1);
                mensaje.setText(resultado);
            }
            if(actividad.equals("Ligera")){

                double GET = 655.1+(9.56*peso1)+(1.85*estatura1)-(4.7*edad1);
                double GET1 = (GET*0.30)+GET;
                String resultado = String.valueOf(GET1);
                mensaje.setText(resultado);
            }
            if(actividad.equals("Moderada")){

                double GET = 655.1+(9.56*peso1)+(1.85*estatura1)-(4.7*edad1);
                double GET1 = (GET*0.40)+GET;
                String resultado = String.valueOf(GET1);
                mensaje.setText(resultado);
            }
            if(actividad.equals("Intensa")){

                double GET = 655.1+(9.56*peso1)+(1.85*estatura1)-(4.7*edad1);
                double GET1 = (GET*0.50)+GET;
                String resultado = String.valueOf(GET1);
                mensaje.setText(resultado);
            }
            if(actividad.equals("Muy intensa")){

                double GET = 655.1+(9.56*peso1)+(1.85*estatura1)-(4.7*edad1);
                double GET1 = (GET*0.70)+GET;
                String resultado = String.valueOf(GET1);
                mensaje.setText(resultado);
            }
            if(actividad.equals("Accion dinamica")){

                double GET = 655.1+(9.56*peso1)+(1.85*estatura1)-(4.7*edad1);
                double GET1 = (GET*0.10)+GET;
                String resultado = String.valueOf(GET1);
                mensaje.setText(resultado);
                }
            }
        }

        public void Salir(View view){

            finish();

        }
    }

