
package boletin2_8;

import java.util.Scanner;

public class Boletin2_8 {

    public static void main(String[] args) {
    //entrada por teclado
    float centigrados, kelvin, fahren ;
    Scanner obx = new Scanner (System.in);
    System.out.println("Teclea centigrados :");
    centigrados = obx.nextFloat();
    kelvin = centigrados+273;
    fahren = 32 + 1.8f *centigrados;
    System.out.println("Grados Kelvin = "+ kelvin);
    System.out.println("Grados Fahren = " + fahren + " fahrenheit");
    }
    
}
