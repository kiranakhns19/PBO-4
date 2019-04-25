package com.modul;

public class Main {

    public static void main(String[] args) {
    AbstractShape L = new Lingkaran();
	    System.out.println("Lingkaran : ");
	    ((Lingkaran) L).getLuas();
	    ((Lingkaran) L).getKeliling();

	AbstractShape P = new Persegi();
        System.out.println("Persegi : ");
        ((Persegi) P).getLuas();
        ((Persegi) P).getKeliling();

    }
}
