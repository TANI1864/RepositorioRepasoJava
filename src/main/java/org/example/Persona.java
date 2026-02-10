package org.example;

public class Persona {
    // ATRIBUTOS

    private String nombres;
    private int edad;
    private String genero;

    //Contructores

    public Persona() {
    }

    public Persona(String nombres, int edad, String genero) {
        this.nombres = nombres;
        this.edad = edad;
        this.genero = genero;
    }

    // GET - SET


    public String getNombres() {
        return nombres;
        //Sin parametros pero con retorno
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
        //Con parametros pero sin retorno
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombres='" + nombres + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }

    //Metodos

    public int calcularPasos(){

        return 0;
    }

    public double CalcularSalrio(){
        return 0.0;
    }
}
