/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas1;

import  java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author DELL
 */
public class Relojito1 extends Thread{

    @Override
    public void run(){
// System.out.println("Este thread no hace nada" +Thread.currentThread().getName());
  
// el tru es una constante que jamas va a cambiar  o terminar
     while(true){
        
         try {
               LocalTime hora = LocalTime.now();
                System.out.println(hora.toString());
                
             Thread.sleep(1000);
         } catch (InterruptedException ex) {
         }
     } 
        
    }
    
    
   
            
}
