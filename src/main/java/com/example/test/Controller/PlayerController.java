package com.example.test.Controller;

import com.example.test.Repo.PlayerRepo;
import com.example.test.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//http://localhost:8088/
@Controller
public class PlayerController {
    @Autowired
    PlayerRepo playerRepo;

    //http://localhost:8088/players

    @GetMapping("/players")
 public String getAllPlayer(Model model){
        model.addAttribute("Players",playerRepo.findAll());
        return "home";
    }


    //http://localhost:8088/player-form
    @GetMapping("player-form")
 public String playerForm(Model model){
        model.addAttribute("player", new Player());
        return "playerform";
 }
 @PostMapping("/savePlayer")
 public String savePlayer(@ModelAttribute("player") Player player){
playerRepo.save(player);
return "redirect:/players";
 }

}
