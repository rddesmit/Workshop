package com.workshop.main;

/**
 * Created by Rudie on 5-3-14.
 */
public class Opdracht4 {

    //maak een array van 10 lang
    private int[] ints = new int[10];

    //vul de array met een for-loop
    public void fillArray() {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }
    }

    //print hem uit
    public void printArray() {
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ", ");
        }
    }
}
