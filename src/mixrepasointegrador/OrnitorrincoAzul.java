/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mixrepasointegrador;

import java.util.Scanner;

/**
 *
 * @author patri
 */
public class OrnitorrincoAzul extends Castor implements Pato {

    private int propulsion;

    public OrnitorrincoAzul() {
     
    }

    @Override
    public void nadar() {
        Scanner teclado = new Scanner(System.in);
        int numeroingresado;

        do {
            System.out.println("Ingrese la velocidad de propulsion de 5 a 10");
            numeroingresado = teclado.nextInt();
            teclado.nextLine();
            if (numeroingresado < 5 || numeroingresado > 10) {
                System.out.println("NUMERO INCORRECTO");
            }
        } while (numeroingresado < 5 || numeroingresado > 10);
        propulsion = numeroingresado;
         super.setVelocidad( super.getVelocidad() + propulsion);
        System.out.println("Nadando a  " + velocidad + " KM/h");
         
    }

    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return "OrnitorrincoAzul{" + '}'+ "Velocidad " +velocidad;
    }

    
  
    
    @Override
    public void tocarGuitarra(){
        super.tocarGuitarra();
    }
    public void tocarOrgano() {

    }
}
