package com.workshop.main;

/**
 * Created by Rudie on 5-3-14.
 */
public class Opdracht2 {

    //maak een lijst met peerchoaces
    private String peercoach1 = "Rudie";
    private String peercoach2 = "Thomas";
    private String peercoach3 = "Patrick";
    private String peercoach4 = "Paul";

    //maak een methode die de juiste peercoach uitprint
    public String printPeercoach(int peercoach) {
        switch (peercoach) {
            case 1:
                return peercoach1;
            case 2:
                return peercoach2;
            case 3:
                return peercoach3;
            case 4:
                return peercoach4;
            default:
                return "peercoach niet gevonden";
        }
    }
}
