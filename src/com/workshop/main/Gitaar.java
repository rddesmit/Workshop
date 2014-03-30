package com.workshop.main;

import java.lang.*;

/**
 * Created by Rudie on 20-3-14.
 */
public class Gitaar extends Instrument implements MIDI {

    @Override
    public void speel() {
        System.out.println("tingletongle");
    }

    @Override
    public void speelMIDI() {

    }

    public void test(String getal) throws NumberFormatException, RudieException {
        try {
            int i = java.lang.Integer.parseInt(getal);
        } catch (NumberFormatException e) {
            throw new RudieException();
        }
    }
}
