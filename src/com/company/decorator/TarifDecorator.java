package com.company.decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class TarifDecorator implements CountTarifInterface {

   private CountTarifInterface tarifDecorator;

    public TarifDecorator(CountTarifInterface tarifDecorator) {
        this.tarifDecorator = tarifDecorator;
    }

    @Override
    public void processTarif() {
        tarifDecorator.processTarif();
    }
}
