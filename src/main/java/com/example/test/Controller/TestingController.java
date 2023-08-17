package com.example.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// http://localhost:8088/api
@Controller
@RequestMapping("")
public class TestingController {
    // http://localhost:8088/profil

    @GetMapping("/profil")
public String test(Model model){
    model.addAttribute("name","mahmoud shoman ");
    return "home";
}
}
