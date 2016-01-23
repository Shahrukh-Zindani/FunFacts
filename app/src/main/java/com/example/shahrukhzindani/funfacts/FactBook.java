package com.example.shahrukhzindani.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by shahrukhzindani on 1/19/16.
 */
public class FactBook {


    String[] facts = {"Banging your head against a wall burns 150 calories an hour.",
            "Cherophobia is the fear of fun.",
            "Polar bears can eat as many as 86 penguins in a single sitting.",
            "An average person’s yearly fast food intake will contain 12 pubic hairs.",
            "During your lifetime, you will produce enough saliva to fill two swimming pools."};
    public String getFact() {

        Random randomGenerator = new Random();
        int randomNumber;
        randomNumber = randomGenerator.nextInt(facts.length);
        String fact = facts[randomNumber];
        return fact;

    }
}
