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
public class Portero extends Jugador{
    int aereo, juegopies;

    public Portero() {
        super();
    }

    public Portero(int aereo, int juegopies, String nombre, String apellido, String estado, String pais, String pie, String equipo, int edad, int numero, int precio) {
        super(nombre, apellido, estado, pais, pie, equipo, edad, numero, precio);
        this.aereo = aereo;
        this.juegopies = juegopies;
    }

    public int getAereo() {
        return aereo;
    }

    public void setAereo(int aereo) {
        this.aereo = aereo;
    }

    public int getJuegopies() {
        return juegopies;
    }

    public void setJuegopies(int juegopies) {
        this.juegopies = juegopies;
    }

    @Override
    public String toString() {
        return super.toString()+"Portero{" + "aereo=" + aereo + ", juegopies=" + juegopies + '}';
    }
    
}
