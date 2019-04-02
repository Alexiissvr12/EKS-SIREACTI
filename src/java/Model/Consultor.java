/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author HP
 */
public class Consultor {
    private Usuario Usuario;
    private double Salario;
    private String Area;
    private String Jefe;
    
    public Consultor (double Salario, String Area, String Jefe,String Email, double Realiza, String Perfil, String Estatus, String Ubicacion, String Nombre,String Paterno,String Materno,String CURP,String RFC,String NSS,/*String foto,*/String Telefono,
           String Calle, String No_Int, String No_Ext, String Colonia,String Delegacion, String CP, String Ciudad, String Estado,String Pais){
        this.Usuario = new Usuario(Email, Realiza, Perfil, Estatus, Ubicacion, Nombre, Paterno, Materno, CURP, RFC, NSS,/* foto,*/ Telefono, Calle, No_Int, No_Ext, Colonia, Delegacion, CP, Ciudad, Estado, Pais);
        this.Salario = Salario;
        this.Area = Area;
        this.Jefe = Jefe;
    }
    public Consultor (double Salario, String Area, String Jefe,Usuario Usuario){
        this.Usuario = Usuario;
        this.Salario = Salario;
        this.Area = Area;
        this.Jefe = Jefe;
    }
    public Usuario Reg_Usuario(){
        return this.Usuario;
    }
    public double Reg_Salario(){
        return this.Salario;
    }
    public String Reg_Area(){
        return this.Area;
    }
    public String Reg_Jefe(){
        return this.Jefe;
    }
}
