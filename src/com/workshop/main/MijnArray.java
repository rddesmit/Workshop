package com.workshop.main;

/**
 * Created by Rudie on 21-3-14.
 */
public class MijnArray {

    private int[] mijnArray = new int[10];

    public void fillMijnArray() {
        for (int x = 0; x < 10; x++) {
            mijnArray[x] = x;
        }
    }

    public void printMijnArray() {
        for (int x = 0; x < 10; x++) {
            System.out.println(mijnArray[x]);
        }
    }
}
