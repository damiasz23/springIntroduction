package com.sda.springjavapoz4.controller;

import com.sda.springjavapoz4.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private SomeService someService;
    @Autowired
    private SomeService myService;

    public HomeController() {
//        this.someService = new SomeService();
    }

    @GetMapping("/")
    public ModelAndView home(){

//        SomeService someService = new SomeService();
        someService.someAction();
        return new ModelAndView("home");
    }
    @GetMapping("/about")
    public ModelAndView about(){
//        SomeService someService = new SomeService();
        myService.someAction();
        return new ModelAndView("home");
    }

}