package com.example.jvleitao.conversordemoedas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jvleitao on 16/03/2018.
 */


public class ConversorTest {

    private Conversor conversor;

    @Before
    public void setUp() throws Exception {
        conversor = new Conversor();
    }

    @After
    public void tearDown() throws Exception {
        conversor.fecharConexao();
    }

    @Test
    public void dollarParaReal() throws Exception {
        double input = 2;
        double output;
        double expected = 6.6;
        double delta = 0.1;

        output = conversor.dollarParaReal(input);
        assertEquals(expected, output, delta);

        input = 2;
        output = 0;
        expected = 6.6;

        output = conversor.dollarParaReal(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void realParaDollar() throws Exception {
        double input = 5;
        double output;
        double expected = 1.65;
        double delta = 0.1;

        output = conversor.realParaDollar(input);
        assertEquals(expected, output, delta);

        input = 5;
        output = 0;
        expected = 1.65;

        output = conversor.realParaDollar(input);
        assertEquals(expected, output, delta);
    }

    @Test
    public void realParaEuro() throws Exception {
        double input = 7;
        double output;
        double expected = 1.68;
        double delta = 0.1;

        output = conversor.realParaEuro(input);
        assertEquals(expected, output, delta);

        input = 5;
        output = 0;
        expected = 1.65;

        output = conversor.realParaDollar(input);
        assertEquals(expected, output, delta);
    }


    @Test
    public void realParaPeso() throws Exception {
        double input = 3;
        double output;
        double expected = 18.48;
        double delta = 0.1;

        output = conversor.realParaPeso(input);
        assertEquals(expected, output, delta);

        input = 3;
        output = 0;
        expected = 18.48;

        output = conversor.realParaDollar(input);
        assertEquals(expected, output, delta);
    }
}