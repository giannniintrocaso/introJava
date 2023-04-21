/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida
por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, 
la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará 
un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package guia4;

import java.util.Scanner;

public class nuevo3 {

    public static void main(String[] args) {
        String moneda;
        float euro;
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros: ");
        euro = read.nextFloat();
        
        System.out.println("Ingrese el tipo de moneda a convertir: GBP || USD || JPY");
        
        do{
            moneda = read.next().toUpperCase();
        }while(!moneda.equalsIgnoreCase("GBP") && !moneda.equalsIgnoreCase("USD") && !moneda.equalsIgnoreCase("JPY"));
       
        cambio(euro,moneda);
        
    }
    
    public static void cambio(float euro, String moneda){
        float n = 0;
        
        switch(moneda){
            case "GBP":
                n = 0.86F;
                break;
            case "USD":
                n = 1.28611F;
                break;
            case "JPY":
                n = 129.852F;
                break;    
        }
        System.out.println("Euro : " + euro + " || " + moneda + " " + (euro*n));
    }
    
}
