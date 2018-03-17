package com.example.jvleitao.conversordemoedas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

/**
 * Created by jvleitao on 16/03/2018.
 */

public class ConversorActivity extends AppCompatActivity {

    private Button buttonConverter;
    private TextView textViewOrigem;
    private TextView textViewDestino;
    private EditText editTextDestino;
    private EditText editTextOrigem;

    private DecimalFormat formatador = new DecimalFormat("0.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewOrigem = (TextView) findViewById(R.id.textViewOrigemTemp);
        textViewDestino = (TextView) findViewById(R.id.textViewDestinoTemp);
        buttonConverter = (Button) findViewById(R.id.buttonConverterTemp);
        editTextOrigem = (EditText) findViewById(R.id.editTextOrigemTemp);
        editTextDestino = (EditText) findViewById(R.id.editTextDestinoTemp);


        buttonConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double valor = Double.valueOf(editTextOrigem.getText().toString());
                    double resultado;
                    if (textViewOrigem.getText().toString().equals("Real"))
                        resultado = (new Conversor()).realParaDollar(valor);
                    else
                        resultado = (new Conversor()).dollarParaReal(valor);
                    editTextDestino.setText(formatador.format(resultado));
                } catch (NumberFormatException ex) {
                    Toast.makeText(getApplicationContext(), "Campo vazio!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}
