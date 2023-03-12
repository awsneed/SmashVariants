package com.sneedaw;

import java.util.Set;

public interface Game {
    Set<Player> getPlayers();
    void registerPlayer(Player player);
}
