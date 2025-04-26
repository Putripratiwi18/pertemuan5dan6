/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5602;

import java.util.Scanner;

/**
 *
 * @author LAB F
 */
public class Pertemuan5602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner insi = new Scanner(System.in);
        
      System.out.print("Nilai Sisi: ");
      int nsisi = insi.nextInt ();
      
        LuasPersegi LP = new LuasPersegi(nsisi);
       // LP.sisi = 5;
        
       System.out.println("Hitung Luas Persegi");
       System.out.printf("Luas = SISI X SISI\n");
       System.out.printf("     = %d X %d\n",nsisi,nsisi);
       System.out.printf("     = %d\n", LP.HL());
      
    }
    
}
