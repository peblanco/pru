/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

/**
 *
 * @author Pedro
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = new int[3]; 
        int[] a1 = new int[3];
        int[] a2;
        arreglo[0] = 5; 
        arreglo[1] = 8; 
        arreglo[2] = 6;    
        Arreglo.sumarLista(arreglo);  
        Arreglo.sumarLista(a1);         
        Arreglo.sumarListaA(arreglo);
        Arreglo.sumarListaA(a1);
        System.out.println("El mayor es: " + Arreglo.buscarMayor(arreglo)); 
        System.out.println("El mayor es: " + Arreglo.buscarMayor(a1)); 
        System.out.println("Cantidad de vocales: " + Arreglo.cuentaVocales("Esta es una cadena de Char")); 
        System.out.println("Cantidad de vocales: " + Arreglo.cuentaVocalesA("Esta es una cadena de Char")); 
        char letra='a'; 
        System.out.println("El caracter '" + letra + "' se repite: " + 
        Arreglo.cuentaCaracter("Esta es A A una cadena de Char", letra) + " veces") ;
        System.out.println("El caracter '" + letra + "' se repite: " + 
        Arreglo.cuentaCaracterA("Esta es A A una cadena de Char", letra) + " veces") ; 
        int[] a = new int[3]; 
        Arreglo.sumarLista(a);      
        System.out.println("El mayor es: " + Arreglo.buscarMayor(a)); 
        System.out.println("Cantidad de vocales: " + Arreglo.cuentaVocales("sfk kk k l")); 
        letra='m'; 
        System.out.println("El caracter '" + letra + "' se repite: " + 
        Arreglo.cuentaCaracter("Esta es una cadena de Char", letra) + " veces") ;        
    }
    
}
