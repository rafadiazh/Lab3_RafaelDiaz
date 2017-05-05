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
public class Jugador {
    String nombre, apellido, estado, pais, pie, equipo;
    int edad, numero, precio;

    public Jugador(String nombre, String apellido, String estado, String pais, String pie, String equipo, int edad, int numero, int precio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
        this.pais = pais;
        this.pie = pie;
        this.equipo = equipo;
        this.edad = edad;
        this.numero = numero;
        this.precio = precio;
    }

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPie() {
        return pie;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", estado=" + estado + ", pais=" + pais + ", pie=" + pie + ", equipo=" + equipo + ", edad=" + edad + ", numero=" + numero + ", precio=" + precio + '}';
    }
    
}
