package com.workshop.main;

import twitter4j.Status;
import twitter4j.TwitterException;

import java.lang.*;
import java.lang.Integer;
import java.util.List;

public class Main {

    private Integer x = new Integer(10);

    public static void main(String[] args) {

        String[] strings = new String[2];
        strings[0] = "Rudie";

        try {
            strings[1].equals("rudie");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("fout");
        } catch (NullPointerException e) {
            strings[1] = "dummywaarde";
        }

        try {
            new Gitaar().test("a");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (RudieException e) {
            e.printStackTrace();
        }


//        try {
//            MyTwitter myTwitter = new MyTwitter();
//            List<Status> tweets = myTwitter.findTweets("Justin");
//            myTwitter.saveTweets(tweets);
//        } catch (TwitterException e) {
//            e.printStackTrace();
//        }

//        new Database().connect();
//        Main main = new Main();

//        //opdracht 1
//        System.out.println("\n\nOpdracht 1");
//        new Opdracht1().printVijf();
//
//        //opdracht 2
//        System.out.println("\n\nOpdracht 2");
//        Opdracht2 opdracht2 = new Opdracht2();
//        System.out.print(opdracht2.printPeercoach(3));
//
//        //opdracht 3
//        System.out.println("\n\nOpdracht 3");
//        Opdracht3 opdracht3 = new Opdracht3();
//        opdracht3.setScore(3);
//        opdracht3.printScore();
//
//        //opdarcht 4
//        System.out.println("\n\nOpdracht 4");
//        Opdracht4 opdracht4 = new Opdracht4();
//        opdracht4.fillArray();
//        opdracht4.printArray();
//
//        //opdracht 5
//        System.out.println("\n\nOpdracht 5");
//        Opdracht5 opdracht5 = new Opdracht5();
//        opdracht5.fillArrayList();
//        opdracht5.printArrayList();
//
//        //opdracht 6
//        System.out.println("\n\nOpdracht 6");
//        Gitaar gitaar = new Gitaar();
//        gitaar.speel();
//        Drumstel drumstel = new Drumstel();
//        drumstel.speel();
//
//        //opdracht 7
//        System.out.println("\n\nOpdracht 7");
//        //in les live interface implementeren
//
//        //opdracht 8
//        System.out.println("\n\nOpdracht 8");
//        Opdracht8 opdracht8 = new Opdracht8();
//        opdracht8.vulLijst();
//
//        //opdracht 9
//        System.out.println("\n\nOpdracht 9");
//        Opdracht9 opdracht9 = new Opdracht9();
//        int result1 = opdracht9.parseInt("2");
//        System.out.println(result1);
//        int result2 = opdracht9.parseInt("twee");
//        System.out.println(result2);
//
//
//        Student rudie = new Student();
//        rudie.setNaam("Rudie");
//        System.out.println(rudie.getNaam());
//
//        Student thomas = new Student();
//        thomas.setNaam("Thomas");
//        thomas.setStudentenNummer(8);
//        System.out.println(thomas.getStudentenNummer());

//        MijnArray mijnArray = new MijnArray();
//        mijnArray.printMijnArray();
//        mijnArray.fillMijnArray();
//        mijnArray.printMijnArray();

//        java.lang.Integer integer = new Integer(10);
//        int x = 10;
//
//        int[] cijfers = new int[]{1,2,3,4,5,6};
//        for(int cijfer : cijfers){
//            System.out.println(cijfer);
//        }
//
//        for(int y = 0; y<cijfers.length; y++){
//            System.out.println(cijfers[y]);
//        }


//        ArrayList<Object> namen = new ArrayList<Object>();
//        namen.add("Thomas dude");
//        namen.add("Rudie baas");
//        namen.add(2);
//        namen.add(true);
//
//        for(Object naam : namen){
//            System.out.println(naam.toString());
//        }

//        Instrument instrument = new Gitaar();
//        instrument.speel();

    }

}
