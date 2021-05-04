package com.player.api.playerapi.controller;

import com.player.api.playerapi.dto.PlayerDTO;
import com.player.api.playerapi.model.Player;
import com.player.api.playerapi.repository.PlayerRepository;
import com.player.api.playerapi.service.PlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RequestMapping("/api")
@RestController
public class PlayerController {

    Logger logger = LoggerFactory.getLogger("");

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerService playerService;

    @GetMapping("/players/{playerID}")
    public ResponseEntity<Player> getPlayerInfo(@PathVariable("playerID") String playerID){
        if(Objects.isNull(playerID)){
            //PlayerDTO playerDTO Play
            return ResponseEntity.badRequest().body(null); // Error handling
        }

        Optional<Player> player = playerRepository.findById(playerID);
        if(player.isEmpty()){
            //throw error like now player is available with the given player Id
        }
        Player playerInfo = player.get();
        return ResponseEntity.ok().body(playerInfo);
    }

    @GetMapping("/players")
    public ResponseEntity<List<Player>> listPlayers(Pageable pageable){
        List<Player> players = playerRepository.findAll();
        // convert entity to dto
        return ResponseEntity.ok().body(players);
    }

    @PutMapping("/players/{playerID}/height")
    public ResponseEntity<Void> updatePlayerWeight(@PathVariable("playerID") String playerID){
       try {
           if (Objects.isNull(playerID)) {
               // Return error response like invalid player ID.
           }

           Optional<Player> player = playerRepository.findById(playerID);
           if (player.isEmpty()) {
               //Return error response like there is no Player associated with playerID
           }

           playerService.updatePlayer(player.get());
       }catch(Exception ex){
           logger.error("Error occured while updating the player: {}", ex);
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
       }
       return ResponseEntity.noContent().build();
    }


}
