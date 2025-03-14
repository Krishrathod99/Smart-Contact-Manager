package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    // Home page 
    // Sending data to view
    @RequestMapping("/home")
    public String home(Model model) {
         System.out.println("Home page Handler");
         model.addAttribute("name", "SubString Technologies");
         model.addAttribute("youtubeChanel", "This is youtube channel");
         model.addAttribute("githubRepo", "https://github.com/Krishrathod99");
        return "home";
    }

    // about page
    @RequestMapping("/about")
    public String aboutPage(Model model){
        System.out.println("About page loading");
        model.addAttribute("isLogin", false);
        return "about";
    }

    // services page
    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("services page loading");
        return "services";
    }




}
