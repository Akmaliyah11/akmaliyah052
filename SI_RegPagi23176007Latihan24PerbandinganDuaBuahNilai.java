/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg23176007.latihan24.perbandinganduabuahnilai;

/**
 *
 * @author 
 * Nama              : Akmaliyah
 * NIM               : 23176007
 * Kelas             : PBO12
 * Prodi             : Sistem Informasi
 * Deskripsi Program : Program ini berisi program untuk menampilkan perbandingan dua buah nilai
 */

import java.util.Scanner;

public class SI_RegPagi23176007Latihan24PerbandinganDuaBuahNilai {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String ulang;
        
        do {
            System.out.println("=====Program Perbandingan Nilai=====");
            
            // Memasukkan nilai pertama
            System.out.print("Masukkan nilai pertama : ");
            int nilaiPertama = input.nextInt();
            
            // Memasukkan nilai kedua
            System.out.print("Masukkan nilai kedua : ");
            int nilaiKedua = input.nextInt();
            
            // Perbandingan nilai
            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil : " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil : " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil : " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }
            
            // Menanyakan apakah user ingin mengulang aktivitas
            System.out.print("Ulangi Aktivitas ? (Ya/Tidak) : ");
            input.nextLine(); // Membersihkan buffer
            ulang = input.nextLine();
            
        } while (ulang.equalsIgnoreCase("Ya"));
        
        System.out.println("Program selesai.");
    }
}

