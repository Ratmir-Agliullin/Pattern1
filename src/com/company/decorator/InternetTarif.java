package com.company.decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class InternetTarif extends TarifDecorator {
    public InternetTarif(CountTarifInterface tarifDecorator) {
        super(tarifDecorator);
    }

    @Override
    public void processTarif() {
        System.out.println("You have an internet");
        super.processTarif();
    }
}
