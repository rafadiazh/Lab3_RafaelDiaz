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
public class Medio extends Jugador{
    int creatividad, dominio;
    double promedioasist;

    public Medio() {
        super();
    }

    public Medio(int creatividad, int dominio, double promedioasist, String nombre, String apellido, String estado, String pais, String pie, String equipo, int edad, int numero, int precio) {
        super(nombre, apellido, estado, pais, pie, equipo, edad, numero, precio);
        this.creatividad = creatividad;
        this.dominio = dominio;
        this.promedioasist = promedioasist;
    }
    

    public int getCreatividad() {
        return creatividad;
    }

    public void setCreatividad(int creatividad) {
        this.creatividad = creatividad;
    }

    public int getDominio() {
        return dominio;
    }

    public void setDominio(int dominio) {
        this.dominio = dominio;
    }

    public double getPromedioasist() {
        return promedioasist;
    }

    public void setPromedioasist(double promedioasist) {
        this.promedioasist = promedioasist;
    }

    @Override
    public String toString() {
        return super.toString()+"Medio{" + "creatividad=" + creatividad + ", dominio=" + dominio + ", promedioasist=" + promedioasist + '}';
    }
    
}
