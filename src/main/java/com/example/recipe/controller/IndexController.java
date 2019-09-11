package com.example.recipe.controller;

import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.recipe.model.Reciepe;
import com.example.recipe.service.ReciepeService;

@Controller
public class IndexController {

    private ReciepeService reciepeService;

    public IndexController(ReciepeService reciepeService) {
        this.reciepeService = reciepeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndex(Model model) {
        Set<Reciepe> reciepeSet =  reciepeService.getReciepes();
        model.addAttribute("recipes", reciepeSet);
        return "index";
    }
}
