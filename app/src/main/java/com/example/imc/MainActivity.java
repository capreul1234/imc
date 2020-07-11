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

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextInputLayout maltura, peso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maltura = findViewById(R.id.textInputLayoutAltura);
        peso = findViewById(R.id.textInputLayoutPeso);
        Button cal = findViewById(R.id.calcular);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double alturaa = Double.parseDouble(Objects.requireNonNull(maltura.getEditText()).getText().toString());
                double pesoo = Double.parseDouble(Objects.requireNonNull(peso.getEditText()).getText().toString());
                double imc = pesoo / (alturaa * alturaa);


                Intent intent = new Intent(getApplicationContext(), TeladoisActivity.class);
                intent.putExtra("IMC", imc);
                startActivity(intent);


            }
        });


    }
}