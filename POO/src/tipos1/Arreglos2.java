/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos1;

/**
 *
 * @author DELL
 */
public class Arreglos2 {
 
    public static void main(String[] args) {
        int x;
        int x2[]=new int[2];
        
        //System.out.println(x2[0]);
        
        String hola[]={"ya", "casi", "nos", "vamos"};
        for (int i = 0; i <hola.length; i++) {
            System.out.println(hola[i]);
        }
        
        //CICLO FOR MEJORADO, ES RECOMENDADO USARLO 
        
        for(String y:hola){
            
            System.out.println(y);
        }
        
        
    }
}
