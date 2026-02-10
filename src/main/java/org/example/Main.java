package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //crear una persona desde el contructor vacio

        Persona p1 = new Persona();

        p1.setNombres("Santiago");
        p1.setEdad(24);
        p1.setGenero("Masculino");

        //crear una persona usando contructor con todos los parametros

        Persona p2 = new Persona("Tania", 22, "Femenino");

        //Mostrar Persona

        System.out.println(p1.toString());
        System.out.println(p2.toString());






    }
}