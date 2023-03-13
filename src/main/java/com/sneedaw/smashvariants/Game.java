package com.sneedaw.smashvariants;

import java.util.Set;

public interface Game {
    Set<Player> getPlayers();

    void registerPlayer(Player player);
}
