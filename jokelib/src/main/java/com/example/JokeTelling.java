package com.example;

import java.util.Random;

public class JokeTelling {

    private String[] jokes;
    private Random random;

    public JokeTelling() {
        jokes = new String[3];


        jokes[0] = "It is very easy to defeat someone, but it is very hard to win someone";
        jokes[1] = "Dream, Dream Dream, Dreams transform into thoughts. And thoughts result in action";
        jokes[2] = "Excellence is a continuous process and not an accident";




                random = new Random();
    }

    public String[] getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

}
