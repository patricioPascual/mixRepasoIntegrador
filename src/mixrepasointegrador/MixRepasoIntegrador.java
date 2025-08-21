/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mixrepasointegrador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author patri
 */
public class MixRepasoIntegrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OrnitorrincoAzul blue= new OrnitorrincoAzul();
        OrnitorrincoAzul blui=new OrnitorrincoAzul();
        OrnitorrincoVerde patricio= new OrnitorrincoVerde();
        
        blue.nadar();
        blue.tocarGuitarra();
        blui.nadar();
        blui.tocarGuitarra();
        
        patricio.tocarGuitorgano();
        patricio.tocarGuitarra();
        
        try{
        Castor[] hermanos={blue,patricio,blui};
        
        
        ArrayList<OrnitorrincoAzul> nadadores= new ArrayList<OrnitorrincoAzul>();
        
        for(Castor aux: hermanos){
        if(aux instanceof OrnitorrincoAzul)
        nadadores.add((OrnitorrincoAzul) aux);
        }
        
        nadadores.sort(comparaNado);
       Iterator<OrnitorrincoAzul> iterador= nadadores.iterator();
       while(iterador.hasNext()){
            OrnitorrincoAzul OrnitorrincoActual=iterador.next();
           System.out.println(OrnitorrincoActual.toString()); 
       }
            
        
        
        
        
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Exede el limite del arreglo");            
        }finally{
            System.out.println("los ornitohermanos juntos al fin…");
        }
    
     
}
      private static final  Comparator<OrnitorrincoAzul> comparaNado = new Comparator<OrnitorrincoAzul>(){
           @Override 
           public int compare(OrnitorrincoAzul a1, OrnitorrincoAzul a2){
               return Integer.compare(a1.getVelocidad(), a2.getVelocidad());
           }
       };
}