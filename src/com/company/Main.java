package com.company;

import com.company.observer.HR;
import com.company.observer.Worker;

public class Main {

    public static void main(String[] args) {
//        MainTarif mainTarif = new MainTarif();
//        SMSTarif smsTarif = new SMSTarif(mainTarif);
//        RoumingTarif roumingTarif = new RoumingTarif(smsTarif);
//        InternetTarif internetTarif = new InternetTarif(roumingTarif);
//
//        internetTarif.processTarif();
        HR hr =  new HR();
        Worker worker1 = new Worker(1);
        Worker worker2 = new Worker(2);
        hr.registerObserver(worker1);
        hr.registerObserver(worker2);
        hr.notifyAllObserver();
    }
}
