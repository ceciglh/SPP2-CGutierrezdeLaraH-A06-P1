/*//Cecilia Gutierrez de Lara Hernandez A01410404 IIS
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgutierrezdelarah.a06.p1;
import java.util.Scanner;

/**
 *
 * @author cecigutierrez
 */
public class SPP2CGutierrezdeLaraHA06P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0, suma=0;

        while (num >= 0) {
            num = solicitarDatos();
            suma = calcularSuma(num, suma);
        }
    }

    public static int solicitarDatos() {

        System.out.println(" Introduzca un número:");
        Scanner kb = new Scanner(System.in);
        int numero;
        try{
        numero = kb.nextInt();
        }catch(Exception ex){
            System.out.println(" No es un número entero");
            return -1;
        }
        return numero;
    }

    public static int calcularSuma(int num, int suma) {
        suma = suma + num;
        System.out.println(" Suma="+ suma);
        return suma;
    }
}
    

