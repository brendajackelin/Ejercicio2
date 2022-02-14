package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView Dato1,Dato2,Dato3,Dato4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recibirDatos();
    }

    public void recibirDatos(){
        Bundle extras = getIntent().getExtras();
        String d1 = extras.getString("Dato1");
        String d2 = extras.getString("Dato2");
        int d3 = extras.getInt("Dato3");
        String d4 = extras.getString("Dato4");

        Dato1 = (TextView) findViewById(R.id.Dato1);
        Dato2 = (TextView) findViewById(R.id.Dato2);
        Dato3 = (TextView) findViewById(R.id.Dato3);
        Dato4 = (TextView) findViewById(R.id.Dato4);

        Dato1.setText(d1);
        Dato2.setText(d2);
        Dato3.setText(""+d3);
        Dato4.setText(d4);
    }
}