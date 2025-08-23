/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mixrepasointegrador;

import java.util.Scanner;

public class OrnitorrincoAzul extends Castor implements Pato {

    private int propulsion;

    public OrnitorrincoAzul() {
    }

    @Override
    public void nadar() {
        Scanner teclado = new Scanner(System.in);
        int numeroingresado = -1; //Recordar que se recomienda inicializar las variables siempre, con un 0 o otro valor.
        boolean valido = false;
        int intentos = 0; //Inicializar el número de intentos en 0.
        final int MAX_INTENTOS = 3; //Definir el numero maximo de intentos.

        do {
            System.out.println("Ingrese la velocidad de propulsión (5 a 10). Intento " + (intentos + 1) + " de " + MAX_INTENTOS + ":");
            String linea = teclado.nextLine().trim();
            intentos++;

            try {
                numeroingresado = Integer.parseInt(linea);
                if (numeroingresado >= 5 && numeroingresado <= 10) {
                    valido = true;
                } else {
                    System.out.println("NUMERO INCORRECTO: fuera de rango.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Ingrese un número entero.");
            }
        } while (!valido && intentos < MAX_INTENTOS); //Repite mientras no tengamos una entrada valida y aun no hayamos alcanzado el maximo de intentos.

        if (valido) {
            propulsion = numeroingresado;
            super.setVelocidad(super.getVelocidad() + propulsion);
            System.out.println("Nadando a " + super.getVelocidad() + " KM/h");
        } else {
            System.out.println("Se agotaron los " + MAX_INTENTOS + " intentos. No se cambió la velocidad.");
            
        }

        
    }

    @Override
    public int getVelocidad() {
        return super.getVelocidad();
    }

    @Override
    public String toString() {
        return "OrnitorrincoAzul{Velocidad=" + super.getVelocidad() + "}";
    }

    @Override
    public void tocarGuitarra() {
        super.tocarGuitarra();
    }

    public void tocarOrgano() {
        // No hacer nada
    }
}

