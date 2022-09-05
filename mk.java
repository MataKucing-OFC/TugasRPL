/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mk;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class MK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int nilai;
String nama;

Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama anda : ");
        nama = input.nextLine();
        System.out.println("Masukkan Nilai Anda : ");
        nilai = input.nextInt();
        
if (nilai >=70){
            System.out.println("Selamat anda lulus dengan nilai "+nilai);
        } else {
            System.out.println("maaf anda tidak lulus");
        }
    }
    
}
