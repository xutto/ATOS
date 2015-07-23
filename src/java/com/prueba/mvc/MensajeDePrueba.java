/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.mvc;

import com.google.gson.Gson;
import com.prueba.model.Persona;
import com.prueba.ws.clients.*;
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

        List listaPersonas = new ArrayList();

        for (int i = 0; i < 10; i++) {

            Persona persona = new Persona();
            persona.setNombre("nombre_persona_" + i);
            persona.setApellido("apellido_persona_" + i);
            persona.setAlias("alias_persona_" + i);
            listaPersonas.add(persona);
        }
        
        try{
        AgfaSegWSClientAuthenticate agfaSegWSClientAuthenticate = new AgfaSegWSClientAuthenticate();
        String WSclientResult = agfaSegWSClientAuthenticate.authenticateCallClient(null);
        System.out.println(WSclientResult);
        }
        catch(Exception ex){
            System.out.println(ex);
        }

        String elgson = gson.toJson(listaPersonas);

        System.out.println(elgson);
        

        mv.addObject("elgson", elgson);
        return mv;
    }

}
