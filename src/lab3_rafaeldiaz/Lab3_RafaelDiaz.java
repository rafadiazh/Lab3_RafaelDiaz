/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_rafaeldiaz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Lab3_RafaelDiaz {
static Scanner sc = new Scanner(System.in);
static int opcion=0, edad=0, numero=0, precio=0;
static String nombre="", apellido="", estado="", pais="", pie="", equipo="";

static String nombreequipo, ciudad;
    static int palmares, presupuesto;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j = new Jugador();
        Equipo e = new Equipo();
        ArrayList<Jugador>comprados = new ArrayList();
        ArrayList<Jugador> freeagents = new ArrayList();
        ArrayList<Equipo> equipos = new ArrayList();
        do{
             System.out.println("*****MENU*****");
        System.out.println("1. Jugador\n2. Equipo\n3. Salir");
        opcion = sc.nextInt();
        switch(opcion){
            case 1:
                System.out.println("1. Agregar\n2. Modificar\n3. Listar\n4. Eliminar\n5. Comprar");
                int resp=sc.nextInt();
                switch(resp){
                    case 1:
                        j = new Jugador();
                        System.out.println("Nombre de Jugador");
                        nombre=sc.next();
                        j.setNombre(nombre);
                        System.out.println("Apellido de Jugador");
                        apellido = sc.next();
                        j.setApellido(apellido);
                        System.out.println("Ingrese edad");
                        edad = sc.nextInt();
                        j.setEdad(edad);
                        estado = "libre";
                        j.setEstado(estado);
                        System.out.println("Pais de nacimiento");
                        pais = sc.next();
                        j.setPais(pais);
                        System.out.println("Pie preferido(izquierdo o derecho)");
                        pie = sc.next();
                        j.setPie(pie);
                        numero =0;
                        j.setNumero(numero);
                        System.out.println("Precio de Jugador");
                        precio= sc.nextInt();
                        j.setPrecio(precio);
                        equipo="";
                        j.setEquipo(equipo);
                        System.out.println("Posicion de Jugador\n1. Delantero\n2. Medio\n3. Defensa\n4. Portero");
                        int pos=sc.nextInt();
                        switch(pos){
                            case 1:
                                System.out.println("Nivel de definicion");
                                int definicion = sc.nextInt();
                                System.out.println("Altura");
                                int altura=sc.nextInt();
                                System.out.println("Velocidad");
                                int velocidad = sc.nextInt();
                                System.out.println("Promedio de goles por partido");
                                double promedio = sc.nextDouble();
                                freeagents.add(new Delantero(definicion, altura,velocidad, promedio,  nombre,apellido,  estado,pais,  pie,  equipo, edad, numero, precio));
                                break;
                            case 2:
                                System.out.println("Nivel de creatividad");
                                int creatividad=sc.nextInt();
                                System.out.println("nivel de dominio");
                                int dominio= sc.nextInt();
                                System.out.println("Promedio de asistencias");
                                double promedioasist = sc.nextDouble();
                                freeagents.add(new Medio(creatividad, dominio, promedioasist, nombre, apellido,  estado, pais,  pie, equipo,edad,numero,precio));
                                break;
                            case 3:
                                System.out.println("Nivel de Agresividad");
                                int agresividad=sc.nextInt();
                                System.out.println("Altura");
                                altura = sc.nextInt();
                                System.out.println("Peso");
                                int peso = sc.nextInt();
                                System.out.println("Velocidad");
                                velocidad = sc.nextInt();
                                freeagents.add(new Defensa(agresividad, altura,peso,velocidad,nombre,apellido, estado, pais, pie,  equipo, edad, numero, precio));
                                break;
                            case 4:
                                System.out.println("Nivel de juego aereo");
                                int aereo = sc.nextInt();
                                System.out.println("Nivel de juego con los pies");
                                int juegopies = sc.nextInt();
                                freeagents.add(new Portero(aereo,juegopies, nombre, apellido,  estado, pais, pie,  equipo,  edad, numero,  precio));
                                break;
                            default:
                                System.out.println("Esa no es una opcion");
                                break; 
                        }      
                        break;
                    case 2:
                        for (int i = 0; i < freeagents.size(); i++) {
                    System.out.println(i+" "+freeagents.get(i));
                }
                System.out.println("Que jugador desea modificar? 0,1,2");
                int posmod = sc.nextInt();
                        System.out.println("Nombre de Jugador");
                        nombre=sc.next();
                        j.setNombre(nombre);
                        System.out.println("Apellido de Jugador");
                        apellido = sc.next();
                        j.setApellido(apellido);
                        System.out.println("Ingrese edad");
                        edad = sc.nextInt();
                        j.setEdad(edad);
                        estado = "libre";
                        j.setEstado(estado);
                        System.out.println("Pais de nacimiento");
                        pais = sc.next();
                        j.setPais(pais);
                        System.out.println("Pie preferido(izquierdo o derecho)");
                        pie = sc.next();
                        j.setPie(pie);
                        numero =0;
                        j.setNumero(numero);
                        System.out.println("Precio de Jugador");
                        precio= sc.nextInt();
                        j.setPrecio(precio);
                        equipo="";
                        j.setEquipo(equipo);
                        System.out.println("Posicion de Jugador\n1. Delantero\n2. Medio\n3. Defensa\n4. Portero");
                        pos=sc.nextInt();
                        switch(pos){
                            case 1:
                                System.out.println("Nivel de definicion");
                                int definicion = sc.nextInt();
                                System.out.println("Altura");
                                int altura=sc.nextInt();
                                System.out.println("Velocidad");
                                int velocidad = sc.nextInt();
                                System.out.println("Promedio de goles por partido");
                                double promedio = sc.nextDouble();
                                freeagents.set(posmod, new Delantero(definicion, altura,velocidad, promedio,  nombre,apellido,  estado,pais,  pie,  equipo, edad, numero, precio));
                                break;
                            case 2:
                                System.out.println("Nivel de creatividad");
                                int creatividad=sc.nextInt();
                                System.out.println("nivel de dominio");
                                int dominio= sc.nextInt();
                                System.out.println("Promedio de asistencias");
                                double promedioasist = sc.nextDouble();
                                freeagents.set(posmod, new Medio(creatividad, dominio, promedioasist, nombre, apellido,  estado, pais,  pie, equipo,edad,numero,precio));
                                break;
                            case 3:
                                System.out.println("Nivel de Agresividad");
                                int agresividad=sc.nextInt();
                                System.out.println("Altura");
                                altura = sc.nextInt();
                                System.out.println("Peso");
                                int peso = sc.nextInt();
                                System.out.println("Velocidad");
                                velocidad = sc.nextInt();
                                freeagents.set(posmod,new Defensa(agresividad, altura,peso,velocidad,nombre,apellido, estado, pais, pie,  equipo, edad, numero, precio));
                                break;
                            case 4:
                                System.out.println("Nivel de juego aereo");
                                int aereo = sc.nextInt();
                                System.out.println("Nivel de juego con los pies");
                                int juegopies = sc.nextInt();
                                freeagents.set(posmod, new Portero(aereo,juegopies, nombre, apellido,  estado, pais, pie,  equipo,  edad, numero,  precio));
                                break;
                            default:
                                System.out.println("Esa no es una opcion");
                                break; 
                        }      
                        
                        
                        break;
                    case 3:
                        for (int i = 0; i < freeagents.size(); i++) {
                            System.out.println(i+" "+freeagents.get(i));
                        }
                        for (int i = 0; i < comprados.size(); i++) {
                            System.out.println(i+" "+comprados.get(i));
                        }
                        break;
                    case 4:
                        System.out.println("Que jugador desea eliminar? 0,1,2...");
                        int poseliminar = sc.nextInt();
                        freeagents.remove(poseliminar);
                        break;
                    case 5:
                        for (int i = 0; i < equipos.size(); i++) {
                            System.out.println(i+" "+equipos.get(i));
                        }
                        System.out.println("Que equipo desea realizar la compra? 0,1,2...");
                        int equip = sc.nextInt();
                        for (int i = 0; i < freeagents.size(); i++) {
                            System.out.println(i+" "+freeagents.get(i));
                        }
                        System.out.println("Que jugador desea comprar? 0,1,2...");
                        int poscomprar = sc.nextInt();
                        
                        
                        equipos.set(equip,new Equipo(nombreequipo,ciudad,palmares, presupuesto-freeagents.get(poscomprar).getPrecio()));
                        freeagents.set(poscomprar, new Jugador(nombre,apellido,"comprado",pais,  pie,  equipos.get(equip).getNombreequipo(), edad, numero, precio));
                        e.getJugadores().add(freeagents.get(poscomprar));
                        comprados.add(freeagents.get(poscomprar));
                        freeagents.remove(poscomprar);
                        
                        break;
                    default:
                        System.out.println("No es una opcion");
                        break;
                }
                
                
                
                break;
            case 2:
                System.out.println("1. Agregar\n2. Listar\n3. Modificar\n4. Eliminar");
                int opcionequipo= sc.nextInt();
                switch(opcionequipo){
                    case 1:
                        sc = new Scanner(System.in);
                        System.out.println("Nombre de equipo");
                        nombreequipo = sc.nextLine();
                        sc = new Scanner(System.in);
                        System.out.println("Cantidad de Palmares");
                        palmares = sc.nextInt();
                        sc = new Scanner(System.in);
                        System.out.println("Ciudad");
                        ciudad = sc.nextLine();
                        sc = new Scanner(System.in);
                        System.out.println("Presupuesto");
                        presupuesto = sc.nextInt();
                        e = new Equipo(nombreequipo,ciudad,palmares, presupuesto);
                        equipos.add(e);
                        break;
                    case 2:
                        for (int i = 0; i < equipos.size(); i++) {
                            System.out.println(i+" "+equipos.get(i));
                            for (int k = 0; k < equipos.get(i).getJugadores().size(); k++) {
                                System.out.println(i+" "+equipos.get(i).getJugadores());
                                
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Que equipo desea modificar? 0,1,2...");
                        int posmode= sc.nextInt();
                        sc = new Scanner(System.in);
                        System.out.println("Nombre de equipo");
                        nombreequipo = sc.nextLine();
                        sc = new Scanner(System.in);
                        System.out.println("Cantidad de Palmares");
                        palmares = sc.nextInt();
                        sc = new Scanner(System.in);
                        System.out.println("Ciudad");
                        ciudad = sc.nextLine();
                        sc = new Scanner(System.in);
                        System.out.println("Presupuesto");
                        presupuesto = sc.nextInt();
                        e = new Equipo(nombreequipo,ciudad,palmares, presupuesto);
                        equipos.set(posmode, e);
                        break;
                    case 4:
                        System.out.println("Que equipo desea eliminar? 0,1,2...");
                        int eliminare = sc.nextInt();
                        equipos.remove(eliminare);
                        break;
                    default:
                        System.out.println("No es una opcion");
                        break;
                }
                        
                break;
            case 3:
                
                break;
            default:
                System.out.println("No es una opcion");
                break;
                    
        }
        
        }while(opcion!=3);
       
        
    }
    
}
