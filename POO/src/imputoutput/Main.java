/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imputoutput;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        try {
            // String s="hola mundo";
            // byte b[]=s.getBytes();
            // String otro= new String(b);
            // for(byte x:b)
            // {
            //    System.out.println(x);
            //}
            Persistencia p = new Persistencia();
            //p.guardar("Hola Mundo");
            //System.out.println("Mensaje Guaradado");
            System.out.println( p.leer());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
       
    }
}
}