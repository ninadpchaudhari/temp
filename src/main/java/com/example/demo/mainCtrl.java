package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mainCtrl{

    @GetMapping("/")
    public ModelAndView renderIndex(){
        ModelAndView m = new ModelAndView();
        m.setViewName("index");
        m.addObject("name", "Ninad");
        return m;
    }

    @PostMapping("/save")
    public ModelAndView saveStuff(@RequestParam String xyz){
        System.out.println(xyz);
        ModelAndView aa = new ModelAndView("saved");
        aa.addObject("someName", xyz);
        return aa;
    }
}