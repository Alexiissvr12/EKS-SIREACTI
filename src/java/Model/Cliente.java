/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alexis
 */
public class Cliente {
   
  private  String nombre;
  private  String razon_social;
  private  String rfc;
  private  String correo;
  private  String telefono;
  private  String pais;
  private  String estado;
  private  String municipio;
  private  String localidad;
  private  String cp;
  private  String colonia;
  private  String calle;
  private  String nin;
  private  String nex;
  public Cliente(){}
    public Cliente(String nombre, String razon_social, String rfc, String correo, String telefono, String pais, String estado, String municipio, String localidad, String cp, String colonia, String calle, String nin, String nex) {
        this.nombre = nombre;
        this.razon_social = razon_social;
        this.rfc = rfc;
        this.correo = correo;
        this.telefono = telefono;
        this.pais = pais;
        this.estado = estado;
        this.municipio = municipio;
        this.localidad = localidad;
        this.cp = cp;
        this.colonia = colonia;
        this.calle = calle;
        this.nin = nin;
        this.nex = nex;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNin() {
        return nin;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }

    public String getNex() {
        return nex;
    }

    public void setNex(String nex) {
        this.nex = nex;
    }
    
}
