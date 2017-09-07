package com.example.simonanger.cardgame;

/**
 * Created by simonanger on 07/09/2017.
 */

public class Cards{
    private Suits suits;
    private Values values;

    public Cards(Suits suits, Values values) {
        this.suits = suits;
        this.values = values;
    }

    public Suits getSuits() {
        return suits;
    }

    public Values getValues() {
        return values;
    }

    public String toString(){
        return values + " of " + suits;
    }
}

