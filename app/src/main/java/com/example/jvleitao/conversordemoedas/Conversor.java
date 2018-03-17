package com.example.jvleitao.conversordemoedas;

/**
 * Created by jvleitao on 16/03/2018.
 */

class Conversor {
    public double dollarParaReal(double dollar){
        double real = (dollar * 3.3);
        return real;
    }

    public double realParaDollar(double real){
        double dollar = (real * 0.33);
        return dollar;
    }

    public double realParaEuro(double real){
        double euro = (real * 0.25);
        return euro;
    }

    public double realParaPeso(double real){
        double euro = (real * 6.16);
        return euro;
    }

    public void fecharConexao(){

    }
}
