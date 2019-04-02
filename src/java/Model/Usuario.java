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
public class Usuario {
    private String Email;
    private String Perfil;
    private String Estatus;
    private String Ubicacion;
    private Personal Personales;
    private Obligatorios Realiza;
    
    public Usuario (String Email, double Realiza, String Perfil, String Estatus, String Ubicacion, String Nombre,String Paterno,String Materno,String CURP,String RFC,String NSS,/*String foto,*/String Telefono,
           String Calle, String No_Int, String No_Ext, String Colonia,String Delegacion, String CP, String Ciudad, String Estado,String Pais){
        this.Email = Email;
        this.Perfil = Perfil;
        this.Estatus = Estatus;
        this.Ubicacion = Ubicacion;
        this.Personales = new Personal(Nombre, Paterno, Materno, CURP, RFC, NSS,/* foto,*/ Telefono, Calle, No_Int, No_Ext, Colonia, Delegacion, CP, Ciudad, Estado, Pais);
        this.Realiza = new Obligatorios(Realiza);
    }
    public Usuario (String Email, double Realiza, String Perfil, String Estatus, String Ubicacion, Personal Personales){
        this.Email = Email;
        this.Perfil = Perfil;
        this.Estatus = Estatus;
        this.Ubicacion = Ubicacion;
        this.Personales = Personales;
        this.Realiza = new Obligatorios(Realiza);
    }
    public String Reg_Email(){
        return this.Email;
    }
    public String Reg_Perfil(){
        return this.Perfil;
    }
    public String Reg_Estatus(){
        return this.Estatus;
    }
    public String Reg_Ubicacion(){
        return this.Ubicacion;
    }
    public Personal Reg_Personales(){
        return this.Personales;
    }
    public Obligatorios Reg_Realiza(){
        return this.Realiza;
    }
}
