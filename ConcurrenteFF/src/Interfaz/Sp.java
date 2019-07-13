/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author frano
 */
public class Sp {
    
    String Nombre,apellido,sexo,email,contraseña, id, edad;

    public Sp(String Nombre, String apellido, String sexo, String email, String contraseña, String id, String edad) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.email = email;
        this.contraseña = contraseña;
        this.id = id;
        this.edad = edad;
    }

    

    public Sp() {
    }
   
    

    @Override
    public String toString() {
        return "Suggar Parent{" + "Nombre=" + Nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", email=" + email + ", contrase\u00f1a=" + contraseña + ", id=" + id + ", edad=" + edad + '}';
    }
 
   

        
    
}
