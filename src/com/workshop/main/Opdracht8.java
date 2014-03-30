package com.workshop.main;

import java.lang.*;
import java.util.ArrayList;

/**
 * Created by Rudie on 20-3-14.
 */
public class Opdracht8 {

    private ArrayList<Object> arrayList;

    public Opdracht8() {
        arrayList = new ArrayList<Object>(150);
    }

    public void vulLijst() {
        for (int i = 1900; i < 2015; i++) {
            arrayList.add(new Integer(i));
        }
    }
}
