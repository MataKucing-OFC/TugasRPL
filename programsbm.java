/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sbmtn;

import java.util.Scanner;

/**
 *
 * @author MK1337
 */
public class SBMTN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
String jalur,ol;
        System.out.println("Masukkan jalur masuk : ");
        jalur = input.next();
        if(jalur.equalsIgnoreCase("SBMPTN")){
            System.out.println("Masukkan Pendapatan : ");
ol = input.next();
if(ol.equalsIgnoreCase("A")){
    System.out.println("DSP : 5 Juta \n SPP 500 Ribu");
}else if(ol.equalsIgnoreCase("B")){
    System.out.println("DSP : 15 Juta \n SPP : 1 Juta");
}else if (ol.equalsIgnoreCase("C")){
    System.out.println("DSP : 30 Juta \n SPP : 2 Juta");
} if(jalur.equalsIgnoreCase("SNMPTN")){
            System.out.println("Masukkan Pendapatan : ");
ol = input.next();
if(ol.equalsIgnoreCase("A")){
    System.out.println("DSP : 7 Juta \n SPP 500 Ribu");
}else if(ol.equalsIgnoreCase("B")){
    System.out.println("DSP : 17 Juta \n SPP : 1 Juta");
}else if (ol.equalsIgnoreCase("C")){
    System.out.println("DSP : 35 Juta \n SPP : 2 Juta");
} if(jalur.equalsIgnoreCase("Mandiri")){
            System.out.println("Masukkan Pendapatan : ");
ol = input.next();
if(ol.equalsIgnoreCase("A")){
    System.out.println("DSP : 10 Juta \n SPP 1 Juta");
}else if(ol.equalsIgnoreCase("B")){
    System.out.println("DSP : 25 Juta \n SPP : 2 Juta");
}else if (ol.equalsIgnoreCase("C")){
    System.out.println("DSP : 50 Juta \n SPP : 3 Juta");
}
        }
    }
        }
    }
        }
    
    

