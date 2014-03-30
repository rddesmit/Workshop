package com.workshop.main;

import java.lang.*;
import java.lang.Integer;

/**
 * Created by Rudie on 20-3-14.
 */
public class Opdracht9 {

    public int parseInt(String integer) {
        try {
            return Integer.parseInt(integer);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
