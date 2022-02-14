package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtNom,txtApellidos,txtEdad, txtCorreo;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNom = (EditText) findViewById(R.id.txtNom);
        txtApellidos = (EditText) findViewById(R.id.txtApellidos);
        txtEdad = (EditText) findViewById(R.id.txtEdad);
        txtCorreo = (EditText) findViewById(R.id.txtCorreo);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nombres = txtNom.getText().toString();
                String apellidos = txtApellidos.getText().toString();
                int edad = Integer.parseInt(txtEdad.getText().toString());
                String correo = txtCorreo.getText().toString();

                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("Dato1",nombres);
                intent.putExtra("Dato2",apellidos);
                intent.putExtra("Dato3",edad);
                intent.putExtra("Dato4",correo);
                startActivity(intent);
            }
        });

    }


}