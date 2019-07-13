/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.util.ArrayList;

/**
 *
 * @author frano
 */
public class admin {

    static public ArrayList<Sp> listaUsSp = new ArrayList<>();
    static public ArrayList<Sb> listaUsSb = new ArrayList<>();
    //Quite los parametros de este metodo y el de agregarUsb porque no podia imprimirlo :p
    int cont = 0;
    int cont2 = 0;

    public void agregarU(Sp Sp) {

        //********* Aqui pone un scanner o algo asi para agrege los valores a los atributos y se quita los datos quemados que puse abajo jaja *********/
        listaUsSp.add(cont, Sp);
        cont++;
    }

    public void agregarUSb(Sb Sb) {

        //************ Igual aqui, se pone un scanner para quitar los datos quemados
        listaUsSb.add(cont2, Sb);
        cont++;

    }

    public void imprimirASb() {

        for (int i = 0; i < listaUsSb.size(); i++) {
            System.out.println(listaUsSb.get(i)); //****************Se usa este metodo para obtener los valores
        }

    }

// un metodo de imprimir y lo que hace es recorrer la lista 
    public void imprimirArray() {

        for (int i = 0; i < listaUsSp.size(); i++) {
            System.out.println(listaUsSp.get(i)); //**************Igual aqui
        }

    }

//    @Override
//    public String toString() {
//        return "admin{" + "listaUsuario=" + listaUsuario;
//    }
    public admin() {
    }

    public static void main(String[] args) {

    }
}
