package com.example.jvleitao.conversordemoedas;

import android.widget.TextView;

/**
 * Created by jvleitao on 16/03/2018.
 */

public class TelaUtil {

    public static void switchText(TextView origem, TextView destino) {
        String nomeOrigem = origem.getText().toString();
        String nomeDestino = destino.getText().toString();

        origem.setText(nomeDestino);
        destino.setText(nomeOrigem);
    }
}