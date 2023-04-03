/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
 */
package encuentro03_ej01;

import java.util.Scanner;

/**
 *
 * @author Pablo Barberis
 */
public class Encuentro03_ej01 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa el primer numero");
        int num1=leer.nextInt();
        System.out.println("ingresa el segundo numero");
        int num2=leer.nextInt();
        int resultado = num1 + num2;
        System.out.println("el resultado de la suma es: " + resultado);
        
    }
    
}
