/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author HP
 */
public class Obligatorios {
    private double Hecho_por;
    private Date Fecha_hecho;
    
    public Obligatorios(double Hecho_por){
        this.Hecho_por = Hecho_por;
        DateFormat Formato = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        Formato.format(this.Fecha_hecho);
    }
    public double Reg_H_Por(){
        return this.Hecho_por;
    }
    public Date Reg_Fecha(){
        return this.Fecha_hecho;
    }
}
