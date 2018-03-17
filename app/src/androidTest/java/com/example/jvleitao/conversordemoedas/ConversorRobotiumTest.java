package com.example.jvleitao.conversordemoedas;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

/**
 * Created by jvleitao on 16/03/2018.
 */

public class ConversorRobotiumTest extends ActivityInstrumentationTestCase2<ConversorActivity> {

    private Solo solo;

    public ConversorRobotiumTest() {
        super(ConversorActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testConverterRealParaDollar() throws Exception {
        solo.enterText(0, "5");
        solo.clickOnButton("Converter");

        String resultado = solo.getEditText(1).getText().toString();

        boolean isRight = resultado.equals("1.65");
        assertTrue("Valor não confere: ", isRight);
    }

    public void testConvertDollarParaReal() throws Exception {
        solo.enterText(0, "2");
        solo.clickOnButton("Converter");

        String resultado = solo.getEditText(1).getText().toString();

        boolean isRight = resultado.equals("6.6");
        assertTrue("Valor não confere: ", isRight);
    }
}