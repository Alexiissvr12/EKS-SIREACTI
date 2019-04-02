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
public class Personal {
    private String Nombre;
    private String Ap_Paterno;
    private String Ap_Materno;
    private String CURP;
    private String RFC;
    private String NSS;
    //private Image Foto;
    private String Telefono;
    private String Calle;
    private String No_Int;
    private String No_Ext;
    private String Colonia;
    private String Delegacion;
    private String CP;
    private String Ciudad;
    private String Estado;
    private String Pais;
    
    public Personal(String Nombre,String Paterno,String Materno,String CURP,String RFC,String NSS,/*String foto,*/String Telefono,
           String Calle, String No_Int, String No_Ext, String Colonia,String Delegacion, String CP, String Ciudad, String Estado,String Pais){
        this.Nombre = Nombre;
        this.Ap_Paterno = Paterno;
        this.Ap_Materno = Materno;
        this.CURP = CURP;
        this.RFC = RFC;
        this.NSS = NSS;
        //this.foto = foto;
        this.Telefono = Telefono;
        this.Calle = Calle;
        this.No_Int = No_Int;
        this.No_Ext = No_Ext;
        this.Colonia = Colonia;
        this.Delegacion = Delegacion;
        this.CP = CP;
        this.Ciudad = Ciudad;
        this.Estado = Estado;
        this.Pais = Pais;
    }
    public String Reg_Nombre(){
        return this.Nombre;
    }
    public String Reg_Paterno(){
        return this.Ap_Paterno;
    }
    public String Reg_Materno(){
        return this.Ap_Materno;
    }
    public String Reg_CURP(){
        return this.CURP;
    }
    public String Reg_RFC(){
        return this.RFC;
    }
    public String Reg_NSS(){
        return this.NSS;
    }
    /*public String Reg_Foto(){
        return this.foto;
    }*/
    public String Reg_Telefono(){
        return this.Telefono;
    }
    public String Reg_Calle(){
        return this.Calle;
    }
    public String Reg_No_Int(){
        return this.No_Int;
    }
    public String Reg_No_Ext(){
        return this.No_Ext;
    }
    public String Reg_Colonia(){
        return this.Colonia;
    }
    public String Reg_Delegacion(){
        return this.Delegacion;
    }
    public String Reg_CP(){
        return this.CP;
    }
    public String Reg_Ciudad(){
        return this.Ciudad;
    }
    public String Reg_Estado(){
        return this.Estado;
    }
    public String Reg_Pais(){
        return this.Pais;
    }
}
