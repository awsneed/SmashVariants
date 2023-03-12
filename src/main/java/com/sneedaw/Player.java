package com.sneedaw;

import java.util.Set;

public interface Player {
    String getName();
    int getScore();
    void setScore();
    Set<Fighter> getFighters();
    void registerFighter(Fighter fighter);
}
