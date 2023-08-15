package com.example.test.Controller;

import com.example.test.Repo.PlayerRepo;
import com.example.test.Service.PlayerService;
import com.example.test.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/myapi")
//http://localhost:8088/api
public class PlayerController {

    @Autowired
    PlayerRepo playerRepo;
    @Autowired
    PlayerService playerService;

    @GetMapping("/add")
    public String save(@RequestBody Player p){
        System.out.println(p.toString());
        playerRepo.save(p);
        return "Success added";
    }

    @GetMapping("/getPlayer")
    public Player get(@RequestParam("id") long id){
        return playerRepo.findById(id).get();
    }
    @GetMapping("/deletePlayer")
    public String delete(@RequestParam ("id") long id){
        playerRepo.deleteById(id);
        return "Success deleted";
    }
    @GetMapping("/updatPlayer")
    public Player updatePlayer(@RequestParam("id")long id , @RequestParam ("name")String newname) {
        Player p = playerRepo.findById(id).get();
        p.setName(newname);
        return playerRepo.save(p);
    }
    @GetMapping("/edit")
    public Player edit(@RequestParam("id")long id){
        return playerRepo.findById(id).get();

    }
//    http://localhost:8088/players
    @GetMapping("/mygetall")
    public List<Player>getplayers(){
        return playerRepo.findAll();
    }

    @GetMapping("/grats")
    public Player getplayer(@RequestParam String name){
        return playerRepo.findByName(name);
    }

}
