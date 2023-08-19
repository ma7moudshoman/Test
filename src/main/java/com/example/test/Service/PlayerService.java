package com.example.test.Service;

import com.example.test.Repo.PlayerRepo;
import com.example.test.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
@Autowired
    PlayerRepo playerRepo;
    public Player save(String name, long id ,int number ,String address,String phone){
        Player player=new Player();
        player.setName(name);
        player.setAddress(address);
        player.setId(id);
        player.setNumber(number);
        player.setPhone(phone);
        playerRepo.save(player);
        return playerRepo.save(player);

    }

}
