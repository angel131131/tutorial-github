/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institutvidreres.proyecto_entorns;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author ANGEL DIAZ
 */
public class protecto_conjunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<String>();
        
        for(int i = 0; i<10; i++){
            lista.add(String.valueOf(i));
        }
        
        Iterator<String> it = lista.iterator();
        while(it.hasNext()){
            String valor = it.next();
            System.out.print(valor+" ");
        }
    }
}
