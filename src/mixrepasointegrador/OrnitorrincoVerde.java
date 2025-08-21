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
public class OrnitorrincoVerde extends Castor implements Pato {

    public OrnitorrincoVerde() {
    }

  @Override
  public void tocarOrgano(){
      System.out.println("Do,Re,MI");
      Scanner teclado=new Scanner(System.in);
      String espacio= teclado.nextLine();
      System.out.println("Fa,Sol,La,Si");
  }
  
  @Override 
  public void tocarGuitarra(){
      
  }
  public void tocarGuitorgano(){
      this.tocarOrgano();
      System.out.println("CUACK   CUACK");
  }
}
