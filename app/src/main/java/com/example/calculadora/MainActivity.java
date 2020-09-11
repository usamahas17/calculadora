package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultado;
    private EditText barra1;
    private EditText barra2;
    private Button suma;
    private Button resta;
    private Button multiplicacion;
    private Button division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado =  findViewById(R.id.salida);
        barra1 =  findViewById(R.id.entrada1);
        barra2 = findViewById(R.id.entrada2);
        suma  =  findViewById(R.id.butsuma);
        resta = findViewById(R.id.butresta);
        multiplicacion = findViewById(R.id.butmultiplicacion);
        division = findViewById(R.id.butdivision);

    }
    public void sumar (View v){
        int f, d;
        int a = Integer.parseInt(barra1.getText().toString());
        f = Integer.parseInt(barra2.getText().toString());
        d = a + f;
        resultado.setText(d+"");


    }
    public void restar(View V){
        int a ,b,c;
        a = Integer.parseInt(barra1.getText().toString());
        b =  Integer.parseInt(barra2.getText().toString());
        c = a - b;
        resultado.setText(c+"");
    }
    public void multiplicar(View V){
        int a ,b,c;
        a = Integer.parseInt(barra1.getText().toString());
        b =  Integer.parseInt(barra2.getText().toString());
        c = a * b;
        resultado.setText(c+"");
    }
    public void dividir(View V){
        int a ,b;
        double c;
        a = Integer.parseInt(barra1.getText().toString());
        b =  Integer.parseInt(barra2.getText().toString());
        c = a / b;
        resultado.setText(c+"");
    }
}