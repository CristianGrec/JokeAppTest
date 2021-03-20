package com.joke.JokeApplication.controllers;

import com.joke.JokeApplication.services.JokeServiceImpl;
import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeServiceImpl jokeService;

    public JokeController(JokeServiceImpl jokeService){
        this.jokeService = jokeService;
    }


    @RequestMapping({"/",""})
    public String getChuckJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}

