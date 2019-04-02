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

/**
 *
 * @author Alexis
 */
public class logindb extends conexion {
   
    login l = new login();
    ResultSet rst = null;
    PreparedStatement pst = null;

    public login login(String user, String password) {
        try {
            String Consulta = "select * from XXEKS_USUARIO where XXEKS_EMAIL = ? and XXEKS_PASSWORD = ?";
            pst = getConexion().prepareStatement(Consulta);
            pst.setString(1, user);
            pst.setString(2, password);
            rst = pst.executeQuery();
            rst.next();
            l.setEmail(rst.getString(3));
            l.setPassword(rst.getString(4));

            pst.close();
            rst.close();
            getConexion().close();

        } catch (SQLException e) {
            System.out.println(e);

        }
        return l;
    }

    public String validarEmail(String email) {
        String contraseña="";
       try{
            String Consulta = "select XXEKS_PASSWORD FROM XXEKS_USUARIO WHERE XXEKS_EMAIL= ?";
            pst = getConexion().prepareStatement(Consulta);
            pst.setString(1, email);
            rst = pst.executeQuery();
            while (rst.next()) {
                if (!"".equals(rst.getString("XXEKS_PASSWORD"))) {
                   contraseña =rst.getString("XXEKS_PASSWORD");
                }else{
                contraseña="";
                }
            }
            pst.close();
            rst.close();
            getConexion().close();
       }catch(Exception w){ System.out.println(w);}
          return contraseña;  
    }
 

/* public static void main(String[] args) throws SQLException {
        logincons l = new logincons();
        l.cmbiarpass("jajaja","nuhanwindgb@gmail.com");
    }*/

    public boolean ifcontraseña(String pass) {
        boolean si = false;
        try {
            String Consulta = "select count(XXEKS_PASSWORD) from XXEKS_USUARIO where XXEKS_PASSWORD = ?";
            pst = getConexion().prepareStatement(Consulta);
            pst.setString(1, pass);
            rst = pst.executeQuery();
            rst.next();
            if (!"0".equals(rst.getString(1))) {
                si = true;
            }
            pst.close();
            rst.close();
            getConexion().close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return si;
    }
    public void cmbiarpass(String nueva,String email){
        System.out.println(nueva + email);
        try {
            String Consulta = "update XXEKS_USUARIO set XXEKS_PASSWORD = ? where XXEKS_EMAIL= ? ";
            pst = getConexion().prepareStatement(Consulta);
            pst.setString(1, nueva);
            pst.setString(2, email);
            int n = pst.executeUpdate();
            System.out.println(n);
            if (n > 0) {
                System.out.println("actualizado");
            } else {
                System.out.println("algo salio mal");
            }
              getConexion().close();

        } catch (Exception e) {
            System.out.println("error " + e);
        }

    }
}
