package com.modul;

public class Lingkaran extends AbstractShape {
    double r = 7;
    double phi = 3.14;

    @Override
    void getLuas(){
        double Luas = phi*r*r;
        System.out.println("Luas Lingkaran adalah : " + Luas);
    }
    @Override
    void getKeliling(){
        double Keliling = 2*phi*r;
        System.out.println("Keliling Lingkaran adalah : " + Keliling);

    }

}
