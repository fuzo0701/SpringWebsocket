package com.jm.springwebsocket.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ChatController {

    @GetMapping("/")
    public String index(){
        return "error";
    }

    @GetMapping("/{id}")
    public String chatting(@PathVariable String id, HttpSession session, Model model){
        if(id.equals("guest")){
            model.addAttribute("name", "guest");
        } else if(id.equals("master")) {
            model.addAttribute("name", "master");
        } else if(id.equals("loose")) {
            model.addAttribute("name", "loose");
        } else {
            return "error";
        }
        return "chattingRoom";
    }
}
