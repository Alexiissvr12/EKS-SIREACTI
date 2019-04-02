/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validar() {

    var email;
    email = document.getElementById("email2").value;
    if (email === "") {
        alert("campo vacio");
        return false;
    }/*else{
     swal ( "¡Revisa tu buzon de correo! ");
     
     return false;
     
     }*/
}
function login() {
    var email;
    var pass;
    email = document.getElementById("mail").value;
    pass = document.getElementById("pass").value;

    if (email === "" || pass === "") {
        alert("Campos Vacios");
        return false;
    }
}
function iguales() {
    var pass;
    var nueva;
    var confirmar;
    var error;
    var btnstar;
    nueva = document.getElementById("nueva").value;
    confirmar = document.getElementById("confirmar").value;
    pass = document.getElementById("actual").value;
    error=document.getElementById("error");
    btnstar=document.getElementById("error");
    
    if (pass === "") {
        alert("ingrese su contraseña");
        return false;
    }else{
        if(nueva ===""){
            alert("ingrsa la nueva");
            return false;
        }else{
            if(confirmar ===""){
                alert("confirma la contraeña");
             return false;
            }else{
                if(nueva != confirmar){
                    alert("diferentes");
                }else{
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}


  


