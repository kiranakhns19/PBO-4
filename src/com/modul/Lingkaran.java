package com.modul;

public class Lingkaran extends AbstractShape {
    double r = 7;
    double phi = 3.14;

    @Override
    public double getLuas(){
        return phi*r*r;
    }
    @Override
    public double getKeliling(){
        return 2*phi*r;
    }
}
