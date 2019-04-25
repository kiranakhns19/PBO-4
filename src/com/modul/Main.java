package com.modul;

public class Main {
    public static void main(String[] args) {
        AbstractShape L = new Lingkaran();
        AbstractShape P = new Persegi();

        System.out.println("Luas Lingkaran : " + L.getLuas());
        System.out.println("Keliling Lingkaran : " + L.getKeliling());

        System.out.println("Luas Persegi : " + P.getLuas());
        System.out.println("Keliling Persegi : " + P.getKeliling());
    }
}
