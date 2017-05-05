package com.company.decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class SMSTarif extends TarifDecorator {
    public SMSTarif(CountTarifInterface tarifDecorator) {
        super(tarifDecorator);
    }

    @Override
    public void processTarif() {
        System.out.println("You have 100 sms");
        super.processTarif();
    }
}
