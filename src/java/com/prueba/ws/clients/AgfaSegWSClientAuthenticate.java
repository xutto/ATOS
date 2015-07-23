/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.ws.clients;

import com.prueba.ws.AgfaSegWS.ACFACSEGSecurityPortTypeHTTP;
import com.prueba.ws.AgfaSegWS.ACFACSEGSecurityService;
import com.prueba.ws.AgfaSegWS.AuthenticateComIsbAlFacsegSecurityExcEXDuplicatedUserFault;
import com.prueba.ws.AgfaSegWS.AuthenticateComIsbAlFacsegSecurityExcEXExpiredPasswordFault;
import com.prueba.ws.AgfaSegWS.AuthenticateComIsbAlFacsegSecurityExcEXFailedAuthenticationFault;
import com.prueba.ws.AgfaSegWS.AuthenticateComIsbAlFacsegSecurityExcEXFirstTimeFault;
import com.prueba.ws.AgfaSegWS.AuthenticateComIsbAlFacsegSecurityExcEXInvalidParametersFault;
import com.prueba.ws.AgfaSegWS.AuthenticateComIsbAlFacsegSecurityExcEXLockedUserFault;
import com.prueba.ws.AgfaSegWS.AuthenticateComIsbAlFacsegSecurityExcEXNoExistsRepositoryFault;
import com.prueba.ws.AgfaSegWS.AuthenticateComIsbAlFacsegSecurityExcEXNoExistsUserFault;
import com.prueba.ws.AgfaSegWS.AuthenticateComIsbAlFacsegSecurityExcEXNotActivePasswordFault;
import com.prueba.ws.AgfaSegWS.AuthenticateComIsbAlFacsegSecurityExcEXRevokedPasswordFault;
import com.prueba.ws.AgfaSegWS.AuthenticateComIsbAlFacsegSecurityExcEXTechnicalErrorFault;
import com.prueba.ws.AgfaSegWS.AuthenticateComIsbAlFacsegSecurityExcEXUserNotActiveFault;
import com.prueba.ws.AgfaSegWS.AuthenticateFault;
import com.prueba.ws.AgfaSegWS.AuthenticateResponse;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XI319411
 * 
 * @param String
 */
public class AgfaSegWSClientAuthenticate {
    
    
      /*    com.prueba.ws.AgfaSegWS.ACFACSEGSecurityService service = new com.prueba.ws.AgfaSegWS.ACFACSEGSecurityService();
        QName portQName = new QName("http://www.isban.es/webservices/TECHNICAL_FACADES/Security/F_facseg_security/internet/ACFACSEGSecurity/v1", "ACFACSEGSecurityPortHTTP");
        String req = "<authenticate  xmlns=\"http://www.isban.es/webservices/TECHNICAL_FACADES/Security/F_facseg_security/internet/ACFACSEGSecurity/v1\"><authenticateInputPart>"+param+"</authenticateInputPart></authenticate>";
        service.setHandlerResolver(null);
        // Call Web Service Operation
        Dispatch<Source> sourceDispatch = null;
        sourceDispatch = service.createDispatch(portQName, Source.class, Service.Mode.PAYLOAD);
        
        
        Source result = sourceDispatch.invoke(new StreamSource(new StringReader(req)));

            // TODO handle custom exceptions here
        return result.toString();
*/
    
    
//TODO -- NO PROBADO -- -- NO TERMINADO --
    private String authenticate(Object param) {//TODO objeto indefinido aun
        try{
            //Try to execute
        ACFACSEGSecurityService service = new ACFACSEGSecurityService();
        ACFACSEGSecurityPortTypeHTTP port = service.getACFACSEGSecurityPortHTTP();
        
        AuthenticateResponse result = port.authenticate(null /*TODO param */); //TODO Falta el objeto para poder probar
         return result.toString();
         
         //Error block
         //TODO falta saber si se retorna objeto o se traza en el logger 
        } catch (AuthenticateComIsbAlFacsegSecurityExcEXDuplicatedUserFault ex) {
            Logger.getLogger(AgfaSegWSClientAuthenticate.class.getName()).log(Level.SEVERE, null, ex);            
        } catch (AuthenticateComIsbAlFacsegSecurityExcEXExpiredPasswordFault ex) {
            Logger.getLogger(AgfaSegWSClientAuthenticate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AuthenticateComIsbAlFacsegSecurityExcEXFailedAuthenticationFault ex) {
            Logger.getLogger(AgfaSegWSClientAuthenticate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AuthenticateComIsbAlFacsegSecurityExcEXFirstTimeFault ex) {
            Logger.getLogger(AgfaSegWSClientAuthenticate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AuthenticateComIsbAlFacsegSecurityExcEXInvalidParametersFault ex) {
            Logger.getLogger(AgfaSegWSClientAuthenticate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AuthenticateComIsbAlFacsegSecurityExcEXLockedUserFault ex) {
            Logger.getLogger(AgfaSegWSClientAuthenticate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AuthenticateComIsbAlFacsegSecurityExcEXNoExistsRepositoryFault ex) {
            Logger.getLogger(AgfaSegWSClientAuthenticate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AuthenticateComIsbAlFacsegSecurityExcEXNoExistsUserFault ex) {
            Logger.getLogger(AgfaSegWSClientAuthenticate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AuthenticateComIsbAlFacsegSecurityExcEXNotActivePasswordFault ex) {
            Logger.getLogger(AgfaSegWSClientAuthenticate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AuthenticateComIsbAlFacsegSecurityExcEXRevokedPasswordFault ex) {
            Logger.getLogger(AgfaSegWSClientAuthenticate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AuthenticateComIsbAlFacsegSecurityExcEXTechnicalErrorFault ex) {
           Logger.getLogger(AgfaSegWSClientAuthenticate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AuthenticateComIsbAlFacsegSecurityExcEXUserNotActiveFault ex) {
            Logger.getLogger(AgfaSegWSClientAuthenticate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AuthenticateFault ex) {
            Logger.getLogger(AgfaSegWSClientAuthenticate.class.getName()).log(Level.SEVERE, null, ex);           
        }
        return null;
       
    }

    public String authenticateCallClient(String param) {
        String wsrespond = authenticate(param);
        return wsrespond;
    }   
   
}
