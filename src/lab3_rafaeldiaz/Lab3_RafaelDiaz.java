/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_rafaeldiaz;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Lab3_RafaelDiaz {
static Scanner sc = new Scanner(System.in);
static int opcion;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        
                        break;
                    default:
                        System.out.println("No es una opcion");
                        break;
                }
                
                
                
                break;
            case 2:
                
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
