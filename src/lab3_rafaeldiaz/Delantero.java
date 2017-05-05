/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_rafaeldiaz;

/**
 *
 * @author Rafael
 */
public class Delantero extends Jugador {
    int definicion, altura, velocidad;
    double promedio;

    public Delantero() {
        super();
    }

    public Delantero(int definicion, int altura, int velocidad, double promedio) {
        this.definicion = definicion;
        this.altura = altura;
        this.velocidad = velocidad;
        this.promedio = promedio;
    }

    public Delantero(int definicion, int altura, int velocidad, double promedio, String nombre, String apellido, String estado, String pais, String pie, String equipo, int edad, int numero, int precio) {
        super(nombre, apellido, estado, pais, pie, equipo, edad, numero, precio);
        this.definicion = definicion;
        this.altura = altura;
        this.velocidad = velocidad;
        this.promedio = promedio;
    }

    public int getDefinicion() {
        return definicion;
    }

    public void setDefinicion(int definicion) {
        this.definicion = definicion;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return super.toString()+"Delantero{" + "definicion=" + definicion + ", altura=" + altura + ", velocidad=" + velocidad + ", promedio=" + promedio + '}';
    }
    
}
