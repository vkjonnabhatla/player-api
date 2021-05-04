package com.player.api.playerapi.service;

import com.player.api.playerapi.model.Player;
import org.springframework.stereotype.Service;

@Service
public interface PlayerService {

    Player updatePlayer(Player player);

}
