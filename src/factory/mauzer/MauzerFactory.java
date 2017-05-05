package factory.mauzer;

import factory.*;

/**
 * Created by admin on 03.05.2017.
 */
public class MauzerFactory implements WeaponFactory
{
    @Override
    public Revolver createRevolver() {
        return new MauzerRevolver();
    }

    @Override
    public Rifle createRifle() {
        return new MauzerRifle();
    }

    @Override
    public Gun createGun() {
        return new MauzerGun();
    }

    @Override
    public BFG createBFG() {
        return new MauzerBFG();
    }
}
