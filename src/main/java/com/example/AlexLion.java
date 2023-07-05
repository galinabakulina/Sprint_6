package com.example;

import java.util.List;

public class AlexLion extends Lion {

    private final static String ALEX_LION_SEX = "Самец";

    public AlexLion(Feline feline) throws Exception {
        super(feline, ALEX_LION_SEX);
    }

    @Override
    public int getKittens(){ return 0; }

    public List<String> getFriends() { return List.of("Марти", "Глория", "Мелман"); }

    public String getPlaceOfLiving() { return "Нью-Йорк"; }

}
