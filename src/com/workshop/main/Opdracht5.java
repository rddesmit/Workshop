package com.workshop.main;

import java.lang.*;
import java.util.ArrayList;

/**
 * Created by Rudie on 5-3-14.
 */
public class Opdracht5 {

    //maak arraylist
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    //vul array
    public void fillArrayList() {
        arrayList.add(new Integer(6));
        arrayList.add(new Integer(7));
        arrayList.add(new Integer(3));
        arrayList.add(new Integer(5));
        arrayList.add(new Integer(8));
        arrayList.add(new Integer(4));
        arrayList.add(new Integer(9));
    }

    //print array met enhanced for loop
    public void printArrayList() {
        for (Integer integer : arrayList) {
            System.out.print(integer + ", ");
        }
    }
}
