package com.modul;

public class Persegi extends AbstractShape {
    double sisi = 8;

    @Override
    public double getLuas(){
        return sisi*sisi;
    }

    @Override
    public double getKeliling(){
        return 4*sisi;
    }
}
