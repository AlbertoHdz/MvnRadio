/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.draxel.mvnradio.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Draxl
 */
@Controller
@RequestMapping(value = "/portal")
public class PortalController {
    
    @RequestMapping(value = "/inicio", produces = "text/html; charset=utf-8")
    public ModelAndView inicio(HttpServletRequest request){
        ModelAndView vista = new ModelAndView();
        vista.setViewName("/portal/inicio");
        return vista;
    }
    
    @RequestMapping(value = "/solicitaCancion", produces = "text/html; charset=utf-8")
    public ModelAndView solicitarCancion(HttpServletRequest request){
        ModelAndView vista = new ModelAndView();
        vista.setViewName("/portal/solicitarCancion");
        return vista;
    }
    
}
