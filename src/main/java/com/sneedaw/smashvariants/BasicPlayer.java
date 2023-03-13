package com.sneedaw.smashvariants;

import java.util.LinkedHashSet;
import java.util.Set;

public class BasicPlayer implements Player {
    private String name;
    private int score;
    private LinkedHashSet<Fighter> fighters;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public Set<Fighter> getFighters() {
        return fighters;
    }

    @Override
    public boolean registerFighter(Fighter fighter) {
        boolean successful = fighters.add(fighter);

        if (successful) {
            fighter.registerPlayer(this);
        }

        return successful;
    }
}
