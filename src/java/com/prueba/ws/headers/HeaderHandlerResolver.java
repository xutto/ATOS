/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.ws.headers;

import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.PortInfo;

/**
 *
 * @author XI319411
 */
public class HeaderHandlerResolver {
    
    public List<Handler> getHandlerChain(PortInfo portInfo) {
      List<Handler> handlerChain = new ArrayList<Handler>();
 
      HeaderHandler hh = new HeaderHandler();
 
      handlerChain.add(hh);
 
      return handlerChain;
   }
}

