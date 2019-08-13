/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoboxingunboxing;

/**
 *
 * @author john hernandez
 */
public class AutoboxingUnboxing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Autoboxin( se convierten de tipos primitivos a tipos object
        Integer enteroObj = 10;
        Float flotanteObj= 15.2F;
        Double dobleObj =40.1;
        System.out.println("\n Autoboxing");
        System.out.println("Entero Obj : " + enteroObj.intValue());
        System.out.println("Flotante Obj " + flotanteObj.floatValue());
        System.out.println("Double Obj " + dobleObj.doubleValue() );
        
        System.out.println("\n");
        // AutoUnboxin( se convierten de objetos a tipos primitivos)
        int entero = enteroObj;
        float flotante = flotanteObj;
        double doble = dobleObj;
        System.out.println("Entero :" + entero);
        System.out.println("flotante :" + flotante);
        System.out.println("doble :" + doble);
    }
    
}
