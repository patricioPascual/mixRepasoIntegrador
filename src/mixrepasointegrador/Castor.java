/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mixrepasointegrador;

import java.util.Random;

/**
 *
 * @author patri
 */
public class Castor {
    protected int velocidad;
    private String Cola;

    public Castor() {
        this.velocidad=5;
        this.Cola="plana y ancha";
    }
   
    
   public void nadar (){
       System.out.println("nadando a  " +velocidad + "KM/h"); 
   }

    public int getVelocidad() {
        return velocidad;
    }
   
   public void tocarGuitarra(){
       Random random= new Random();
       System.out.println("toca cuerda " + (random.nextInt(6)+1));
       System.out.println("toca cuerda " + (random.nextInt(6)+1));
       System.out.println("toca cuerda " + (random.nextInt(6)+1));
      
       
   }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
