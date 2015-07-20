/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.mvc;

import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author XI319411
 */
//com.adm.spn.servlet.SFiltroSesion.doFilter
@Controller
@RequestMapping("/mensaje1.htm")
public class MensajeDePrueba {


    @RequestMapping
    public ModelAndView pruebaDeMensaje(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {

        ModelAndView mv = new ModelAndView("mensaje1");

        mv.addObject("men", "mensaje de prueba2");
        System.out.println("polloman");

        return mv;
    }

}
