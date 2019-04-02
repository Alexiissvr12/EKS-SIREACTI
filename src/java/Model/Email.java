/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Alexis
 */
public class Email {
    
    public boolean enviarCorreo( String correo,String password){
    boolean enviado=false;
        try {
             String host = "smtp.gmail.com";
             String de = "3515110450@uth.edu.mx";
             String mensaje = "hola ";
             String pass = "CCNAalex11%";
             String asunto="Recuerar Contraseña";
            
                
                Properties prop = System.getProperties();
                
                prop.put("mail.smtp.starttls.enable","true");
                prop.put("mail.smtp.host", host);
                prop.put("mail.smtp.user",de);
                prop.put("mail.smtp.password",pass);
                prop.put("mail.smtp.port",587);
                prop.put("mail.smtp.auth","true");
                
                Session sesion = Session.getDefaultInstance(prop,null);
                
                MimeMessage message = new MimeMessage(sesion);
                
                message.setFrom(new InternetAddress(de));
                
                message.setRecipient(Message.RecipientType.TO, new InternetAddress(correo));
                
                message.setSubject(asunto);
                
                
               message.setText(mensaje+ " tu contraseña es: "+password);
                
                Transport transport = sesion.getTransport("smtp");
                
                transport.connect(host,de,pass);
                
                transport.sendMessage(message, message.getAllRecipients());
                
                transport.close();
                
                enviado = true;
                
        } catch (Exception e) {
             System.out.println("error: "+e);
        }
        return enviado;
    }
   /* public static void main(String[] args) {
        Email e=new Email();
      boolean Status =  e.enviarCorreo("luis.altamirano@eks-solutions.com", "ni idea","recuperar Contraseña");
      if(Status ==true){
          System.out.println("enviado");
      }else{
       System.out.println("no se envio ");

      }
    }*/
}
