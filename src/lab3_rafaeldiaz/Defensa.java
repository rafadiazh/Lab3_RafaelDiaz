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
public class Defensa extends Jugador{
    int agresividad, altura,peso, velocidad;

    public Defensa() {
        super();
    }

    

    public Defensa(int agresividad, int altura, int peso, int velocidad, String nombre, String apellido, String estado, String pais, String pie, String equipo, int edad, int numero, int precio) {
        super(nombre, apellido, estado, pais, pie, equipo, edad, numero, precio);
        this.agresividad = agresividad;
        this.altura = altura;
        this.peso = peso;
        this.velocidad = velocidad;
    }

    public int getAgresividad() {
        return agresividad;
    }

    public void setAgresividad(int agresividad) {
        this.agresividad = agresividad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString()+"Defensa{" + "agresividad=" + agresividad + ", altura=" + altura + ", peso=" + peso + ", velocidad=" + velocidad + '}';
    }
    
}
