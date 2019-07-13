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
public class Sb extends Sp{
    
    String precio;

    public Sb(String precio, String Nombre, String apellido, String sexo, String email, String contraseña, String id, String edad) {
        super(Nombre, apellido, sexo, email, contraseña, id, edad);
        this.precio = precio;
    }

    public Sb() {
    }

    
    
    
    @Override
    public String toString() {
       return "Suggar Baby{" + "Nombre=" + Nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", email=" + email + ", contrase\u00f1a=" + contraseña + ", id=" + id + ", edad=" + edad + " precio= " + precio + '}';
    }

   
    
}

