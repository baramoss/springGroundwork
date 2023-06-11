package com.springGroundwork.oddsAndEnds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {

    @GetMapping("/jspIntro")
    public String jspIntro(Model model) {

        System.out.println("###############222");

        model.addAttribute("data", "jsp");
        return "jspIntro";
    }
}
