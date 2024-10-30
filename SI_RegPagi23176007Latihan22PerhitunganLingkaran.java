/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg23176007.latihan22.perhitunganlingkaran;

/**
 *
 * @author 
 * Nama              : Akmaliyah
 * NIM               : 23176007
 * Kelas             : PBO12
 * Prodi             : Sistem Informasi
 * Deskripsi Program : Program ini berisi program untuk menampilkan perhitungan lingkaran
 */

import java.util.Scanner;

public class SI_RegPagi23176007Latihan22PerhitunganLingkaran {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double diameter = 0;
        boolean validInput = false;
        
        System.out.println("=====Perhitungan Lingkaran=====");
        
        // Loop untuk meminta input diameter yang valid
        while (!validInput) {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            String inputDiameter = input.nextLine();
            
            try {
                // Coba konversi input ke tipe double
                diameter = Double.parseDouble(inputDiameter);
                
                // Jika diameter valid (lebih besar dari 0)
                if (diameter > 0) {
                    validInput = true;
                } else {
                    System.out.println("Nilai Diameter Tidak Sesuai");
                }
                
            } catch (NumberFormatException e) {
                // Jika input bukan angka
                System.out.println("Nilai Diameter Tidak Sesuai");
            }
        }
        
        // Hitung jari-jari, luas, dan keliling lingkaran
        double jariJari = diameter / 2;
        double luas = Math.PI * Math.pow(jariJari, 2);
        double keliling = Math.PI * diameter;
        
        // Tampilkan hasil perhitungan
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.printf("Jari-jari Lingkaran = %.0f cm%n", jariJari);
        System.out.printf("Luas Lingkaran = %.2f cm%n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm%n", keliling);
    }
}
