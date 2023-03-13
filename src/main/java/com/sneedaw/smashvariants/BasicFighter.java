package com.sneedaw.smashvariants;

public class BasicFighter implements Fighter {
    private String name;
    private int lives;
    private Player player;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLives() {
        return lives;
    }

    @Override
    public void setLives(int lives) {
        this.lives = lives;
    }

    @Override
    public Player getPlayer() {
        return player;
    }

    @Override
    public void registerPlayer(Player player) {
        this.player = player;
    }
}
