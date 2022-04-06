/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21mml6;

import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class G4S21MML6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Fernando");     
        lista.add("monica");
        lista.add("Aracely");
        lista.add("Federico");
        lista.add("Armando");
        
        for (int i=0; i<lista.size();i++){
            System.out.println("valor en posicion ["+i+"] =" + lista.get(i));
                   
        }
        
        int a = 0;
        for (String cadena : lista){
            System.out.println("valor de la lista en posicion ["+ a + "] = " + cadena );
            a++;
        }
        
        a=0;
        lista.forEach(cadena ->{
            System.out.println("valor de la lista " + cadena);
        });
        
        lista.stream().forEach(cadena ->{
            System.out.println("valor de la lista por medio de stream " + cadena);
        });
        
        
    }
    
}
