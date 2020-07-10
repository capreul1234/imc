package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.textservice.TextInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

   TextInputLayout maltura,peso;
    Button cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maltura = findViewById(R.id.altura);
        peso = findViewById(R.id.peso);
        cal = findViewById(R.id.calcular);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double alturaa =Double.parseDouble(maltura.getEditText().toString());
                double pesoo =Double.parseDouble(peso.getEditText().toString());
                double imc = pesoo /(alturaa * alturaa);


                Intent intent = new Intent(getApplicationContext(), TeladoisActivity.class);
                intent.putExtra("IMC",imc);



            }
        });


    }
}