package com.sneedaw.smashvariants;

import java.util.Map;
import java.util.Set;

public interface Match {
    boolean registerPlayer(Player player, Fighter fighter);
    Fighter getFighterFromPlayer(Player player);
    Player getPlayerFromFighter(Fighter fighter);
    Integer getPlayerPlacing(Player player);
    boolean setPlayerPlacing(Player player, Integer place);
    Map<Player, Integer> getPlacings();
    Set<Player> getPlayers();
    Set<Fighter> getFighters();
}
