/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imputoutput;
import java.io.*;
/**
 *
 * @author DELL
 */
public class Persistencia {
    
    
    public void guardar (String s)throws FileNotFoundException, IOException{
        File f= new File ("Archivaldo");
        FileOutputStream fos= new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream (fos);
        oos.writeObject(s);
        oos.close();
        fos.close();         
    }
    public String leer() throws FileNotFoundException, IOException, ClassNotFoundException{
        File f= new File ("Archivaldo");
        FileInputStream fos= new FileInputStream(f);
        ObjectInputStream oos=new ObjectInputStream (fos);
        String x = (String)oos.readObject();
        oos.close();
        fos.close(); 
        return x;
        
    }
    
}
