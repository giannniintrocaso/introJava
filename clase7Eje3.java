/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por 
teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros,
la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará 
un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package guia4;

import java.util.Scanner;

public class clase7Eje3 {

    public static void main(String[] args) {
        int euros,  opcion;
        String moneda;
       
        Scanner read = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese la cantidad de euros a convertir: ");
            euros = read.nextInt();
        
            System.out.println("MENU");
            System.out.println("1 - Dolar");
            System.out.println("2 - Yenes");
            System.out.println("3 - Libras");
            System.out.println("4 - Salir");
            System.out.println("");
            
        moneda = read.next();
        
        convercion(euros,moneda);
        }while(Integer. parseInt(moneda) != 4);
        
       
       
    }
    public static void convercion(int euros, String moneda){
        double cambio, fin;
        
         switch(moneda){
            case "1":
                cambio = 1.28611;
                fin = cambio * euros;
                
                System.out.println("Euros: " + euros + " || Dolar: " + fin);
                break;
            case "2":
                cambio = 129.852;
                fin = cambio * euros;
                System.out.println("Euros: " + euros + " || Yenes: " + fin);
                break;
            case "3":
                cambio = 0.86;
                fin = cambio * euros;
                System.out.println("Euros: " + euros + " || Libras: " + fin);
                break;
            case "4":
                System.out.println("chau");
                break;
            
            default:
                System.out.println("error");
        }
    }
    
}
