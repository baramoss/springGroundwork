package com.springGroundwork.oddsAndEnds.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.Map;

@Controller
public class ThymeleafController {

    @GetMapping("/thymeleafIntro")
    public String thymeleafIntro(Model model) {


        System.out.println("%%%%%%%%%%%999999999999999999999");


        model.addAttribute("data", "thymeleaf");
        return "thymeleaf/thymeleafIntro";
    }

    @PostMapping("/giveAndTake/serialize/test/1")
    public String giveAndTakeSerializeTest1(@RequestParam Map<String, Object> params
                                            , ModelMap model
                                            , HttpServletRequest request
                                            , @RequestBody String abc) {

        System.out.println("params ==================111 " + params);
        System.out.println("params ==================111-111 " + params.get("selectedValue"));

        params.put("selectedValue", Arrays.asList(request.getParameterValues("selectedValue")));
        System.out.println(request.getParameterValues("selectedValue"));
        System.out.println("selectedValue ================== " + Arrays.asList(request.getParameterValues("selectedValue")));

        System.out.println("params ==================222 " + params);

        System.out.println("abc ==============111 " + abc);
        System.out.println("abc ==============222 " + abc);
        model.addAttribute("isSuccess", "true");

        System.out.println("%%%%%%%%%%%777");

        return "thymeleaf/thymeleafIntro";
    }
}
