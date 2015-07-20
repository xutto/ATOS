/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.mvc;

import com.google.gson.Gson;
import com.prueba.model.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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
        Gson gson = new Gson();
        Persona persona = new Persona();
        List listaPersonas = new ArrayList();

         
          persona.setNombre("polloman");
          persona.setApellido("lopez");
          persona.setAlias("elpolloloco");
          
          listaPersonas.add(persona);
    
        String elgson = gson.toJson(listaPersonas);

        System.out.println(elgson);

        mv.addObject("elgson", elgson);
        return mv;
    }

}
