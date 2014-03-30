package com.workshop.main;

/**
 * Created by Rudie on 21-3-14.
 */
public class Student {
    private int studentenNummer;
    private String naam;

    public void setStudentenNummer(int nummer) {
        this.studentenNummer = nummer;
    }

    public int getStudentenNummer() {
        return this.studentenNummer;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return this.naam;
    }
}
