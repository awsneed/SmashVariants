package com.sneedaw.smashvariants;

public interface Fighter {
    String getName();

    int getLives();

    void setLives(int lives);

    Player getPlayer();

    void registerPlayer(Player player);
}
