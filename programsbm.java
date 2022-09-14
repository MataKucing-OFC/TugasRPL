/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mk;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class sw {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
 Scanner in = new Scanner(System.in);
        String r,g;
        System.out.println("Masukkan pilihan jalur :");
        r= in.next();
        if (r.equalsIgnoreCase("SBMPTN")){
            System.out.println("Pilih golongan pendaftaran : ");
            g = in.next();
            if (g.equalsIgnoreCase("A")){
                System.out.println("DSP = 5 juta \n SPP 500 Ribu");
                System.out.println("SPP = 500 ribu");
            }
            else if (g.equalsIgnoreCase("B")){
                System.out.println("DSP = 15 juta \n SPP = 1 juta ");
            }
            else if (g.equalsIgnoreCase("C")){
                System.out.println("DSP = 30 juta \nSPP = 2 Juta");
            }

            
        }else if (r.equalsIgnoreCase("SNMPTN")){
            System.out.println("Pilih golongan pendaftaran : ");
            g = in.next();
            if (g.equalsIgnoreCase("A")){
                System.out.println("DSP = 7 juta \nSPP = 500 RIbu");
            }
            else if (g.equalsIgnoreCase("B")){
                System.out.println("DSP = 17 juta \nSPP = 1 Juta");
            }
            else if (g.equalsIgnoreCase("C")){
                System.out.println("DSP = 35 juta \nSPP = 2 Juta");
            }
       }
        else if (r.equalsIgnoreCase("Mandiri")){
           System.out.println("Pilih golongan pendaftaran : ");
            g = in.next();
            if (g.equalsIgnoreCase("A")){
                System.out.println("DSP = 10 juta \nSPP = 1 Juta");
                }
            else if (g.equalsIgnoreCase("B")){
                System.out.println("DSP = 25 juta \n SPP = 2 Juta");
                }
            else if (g.equalsIgnoreCase("C")){
                System.out.println("DSP = 50 juta \n SPP = 3 Juta");
                        }
          
        }
       }
    
}
       
