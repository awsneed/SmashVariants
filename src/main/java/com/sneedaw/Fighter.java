package com.sneedaw;

public interface Fighter {
    String getName();
    int getLives();
    void setLives(int lives);
    Player getPlayer();
    void registerPlayer(Player player);
}
