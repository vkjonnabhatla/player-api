package com.player.api.playerapi.service.impl;

import com.player.api.playerapi.model.Player;
import com.player.api.playerapi.repository.PlayerRepository;
import com.player.api.playerapi.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Player updatePlayer(Player player) {
       player.setHeight(player.getHeight() + 1);
       Player updatedPlayer = playerRepository.save(player);
       return updatedPlayer;
    }
}
