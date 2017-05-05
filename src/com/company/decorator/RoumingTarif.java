package com.company.decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class RoumingTarif extends TarifDecorator {
    public RoumingTarif(CountTarifInterface tarifDecorator) {
        super(tarifDecorator);
    }

    @Override
    public void processTarif() {
        System.out.println("You have roaming");
        super.processTarif();
    }
}
