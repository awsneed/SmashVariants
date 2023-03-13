package com.sneedaw.smashvariants;

import java.util.Set;

public class BasicGame implements Game {
    private Set<Player> players;

    @Override
    public Set<Player> getPlayers() {
        return players;
    }

    @Override
    public void registerPlayer(Player player) {
        players.add(player);
    }
}
