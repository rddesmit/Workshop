package com.workshop.main;

/**
 * Created by Rudie on 5-3-14.
 */
//maak een Score class, met een variable en een methode
public class Opdracht3 {
    //instance variable
    private int score;

    //setter (encapsulation)
    public void setScore(int score) {
        this.score = score;
    }

    //setter (encapsulation)
    public int getScore() {
        return score;
    }

    //print de score
    public void printScore() {
        System.out.print(score);
    }

}
