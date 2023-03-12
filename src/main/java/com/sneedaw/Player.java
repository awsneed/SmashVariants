package com.sneedaw;

import java.util.Set;

public interface Player {
    String getName();
    int getScore();
    void setScore(int score);
    Set<Fighter> getFighters();
    boolean registerFighter(Fighter fighter);
}
