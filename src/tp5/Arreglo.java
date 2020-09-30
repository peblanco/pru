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
public class Arreglo {
    public static void sumarLista(int [] lista){
        int suma=0; 
        for(int i = 0; i<lista.length; i++) { 
            suma += lista[i]; 
        } 
        System.out.println("La suma es: " + suma +" y el promedio es: " + suma / lista.length);
    }
    public static int buscarMayor(int [] a){
        int mayor = 0; 
         mayor = a[0];
        for (int i=0; i<a.length; i++) { 
            if (a[i] > mayor) 
                mayor = a[i]; 
        }     
        return mayor;         
    }
    public static int cuentaVocales(String cadena){
        char[] arregloChar = cadena.toCharArray(); 
        int cantidadVocales=0; 
        for (int i=0; i<arregloChar.length; i++) { 
            if (arregloChar[i] == 'a' || arregloChar[i] == 'e' || arregloChar[i] == 'i' || arregloChar[i] == 'o' || arregloChar[i] == 'u') 
            cantidadVocales++; 
        } 
        return cantidadVocales;         
    }
    public static int cuentaCaracter(String cadena, char caracter){
        char[] arregloChar = cadena.toCharArray(); 
        int cantidadRepetidos = 0; 
        for (int i=0; i<arregloChar.length; i++) { 
            if (arregloChar[i] == caracter) 
                cantidadRepetidos++; 
        } 
        return cantidadRepetidos; 
    }
    
    static void sumarListaA (int x[]){ 
         int suma =0; 
         int cont =0; 
         float pro =0;         
         for(int i: x){ 
           suma += i; 
           cont++; 
                    } 
         System.out.println("La suma de los enteros es: "+ suma); 
         pro = suma/cont; 
         System.out.println("El promedio de la suma es: "+ pro); 
    } 
     static int cuentaVocalesA(String y){ 
     int cont=0; 
    
        for(int i=0; i<y.length();i++){ 
         if(y.charAt(i)=='a' || y.charAt(i)=='e' || y.charAt(i)=='i' || y.charAt(i)=='o' || y.charAt(i)=='u' ){
           cont++;          
         } 
        } 
       return cont;  
   } 
      
    static int cuentaCaracterA(String y, char a ){ 
        int cont= 0; 
          
       for(int i=0; i<y.length();i++){ 
         if(y.charAt(i)== a ){ 
           cont++;          
         } 
        } 
        return cont; 
    } 
}
