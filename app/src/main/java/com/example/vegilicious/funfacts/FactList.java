package com.example.vegilicious.funfacts;

import java.util.Random;

public class FactList {
    private String[] facts = {
            "Ants stretch when they wake up in the morning",
            "Ostriches can run faster than horses",
            "Olympic gold metals are actually 96% silver",
            "You are born with 300 bones, by adulthood you have 206",
            "It takes 8 minutes for sunlight to reach the earth",
            "Bamboo plants can grow 1 meter per day",
            "The state of Florida is bigger than England",
            "Some penguin species can leap 3 meters out of the water",
            "It takes 66 days on average to form a new habit",
            "Mammoths still walked the earth when the pyramids were being built"
    }; //member variable

    public String returnFact() {

        Random factIndexGenerator = new Random();
        int factIndex = factIndexGenerator.nextInt(facts.length);

        return facts[factIndex];
    } //member method
}
