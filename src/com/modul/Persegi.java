package com.modul;

public class Persegi extends AbstractShape {
    double sisi = 8;

    @Override
    void getLuas(){
        double Luas = sisi*sisi;
        System.out.println("Luas Persegi adalah : " + Luas);
    }

    @Override
    void getKeliling(){
        double Keliling = 4*sisi;
        System.out.println("Keliling Persegi adalah : " + Keliling);
    }
}
