/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.draxel.mvnradio.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Draxl
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Hola(Model model){
        model.addAttribute("message", "Hello from spring");
        return "index";
    }
    
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }
    
    @RequestMapping(value = "/index2")
    public ModelAndView index2(HttpServletRequest request){
        ModelAndView vista = new ModelAndView();
        vista.setViewName("hello");
        return vista;
    }
}
