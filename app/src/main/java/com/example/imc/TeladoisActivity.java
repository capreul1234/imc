package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TeladoisActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textViewimc, dica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teladois);
        double imc = getIntent().getDoubleExtra("IMC", 0D);

        if(imc < 18){
            imageView.setImageResource(R.drawable.vovo);
            textViewimc.setText("Ta precisando comer em meu filho");
            dica.setText("Come bastante verdura e se alimente bem");
        }else if (imc < 24 ){
            imageView.setImageResource(R.drawable.sorisso);
            textViewimc.setText("Comeu e ficou fortinho");
            dica.setText("continue assim,parabens");

        }
        else if (imc < 29 ){
            imageView.setImageResource(R.drawable.verdura);
            textViewimc.setText("Comeu e ficou fortinho demais");
            dica.setText("Come umas verduras e evite besteiras");

        }



    }
}