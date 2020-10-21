/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

    /**
     * 
     * @author ANGEL DIAZ
     * @version 1.0.0
     */
public class mensajito {

    /**
     * 
     * <b>nombre</b> nombre del mensaje
     * <b>curso</b> curso del nombre
     * <b>mensaje</b> metodo que imprime por pantalla <b>nombre, curso</b>
     */
     protected String nombre = "ANGEL";
     protected String curso = "DAM";
     
     
     public void mensaje(){
         System.out.println("Nombre: "+nombre+" curso: "+curso);
     }
}
