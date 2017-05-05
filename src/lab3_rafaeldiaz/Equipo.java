/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_rafaeldiaz;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Equipo {
    String nombreequipo, ciudad;
    int palmares, presupuesto;
    ArrayList<Jugador> jugadores = new ArrayList();

    public Equipo(String nombreequipo, String ciudad, int palmares, int presupuesto) {
        this.nombreequipo = nombreequipo;
        this.ciudad = ciudad;
        this.palmares = palmares;
        this.presupuesto = presupuesto;
    }

    public Equipo() {
    }

    public String getNombreequipo() {
        return nombreequipo;
    }

    public void setNombreequipo(String nombreequipo) {
        this.nombreequipo = nombreequipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getPalmares() {
        return palmares;
    }

    public void setPalmares(int palmares) {
        this.palmares = palmares;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombreequipo=" + nombreequipo + ", ciudad=" + ciudad + ", palmares=" + palmares + ", presupuesto=" + presupuesto + ", jugadores=" + jugadores + '}';
    }
    
}
