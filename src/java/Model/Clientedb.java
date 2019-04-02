/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alexis
 */
public class Clientedb extends conexion {
     ResultSet rst = null;
    PreparedStatement pst = null;
    
   public Clientedb(){}
       public void insertar(Cliente l){
       try {
            String Consulta = "Insert into XXEKS_EMPRESA values (SEQ_EMPRESA.NEXTVAL,?,?,?,?,?,2,?,?,?,?,?,?,?,?,?,null,null,null,null)";
            pst.getConnection().prepareStatement(Consulta);
           pst.setString(1,l.getNombre());
           pst.setString(2,l.getRazon_social());
           pst.setString(3,l.getRfc());
           pst.setString(4,l.getCorreo());
           pst.setString(5,l.getTelefono());
           pst.setString(6,l.getCalle());
           pst.setString(7,l.getNin());
           pst.setString(8,l.getNex());
           pst.setString(9,l.getColonia());
           pst.setString(10,l.getMunicipio());
           pst.setString(11,l.getCp());
           pst.setString(12,l.getLocalidad());
           pst.setString(13,l.getEstado());
           pst.setString(14,l.getPais());
            int n = pst.executeUpdate();
             if (n > 0) {
                System.out.println("actualizado");
            } else {
                System.out.println("algo salio mal");
             }
            pst.close();
            closeconn();

        } catch (SQLException e) {
            System.out.println(e);

        }
    }
       
       public static ArrayList<Cliente> viewcliente(){
           ArrayList<Cliente> list= new ArrayList<Cliente>();
           try {
               
           } catch (Exception e) {
           }
       return list;
       }
}
