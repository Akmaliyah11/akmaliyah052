/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg23176007.latihan21.programrataratanilai;

/**
 *
 * @author 
 * Nama              : Akmaliyah
 * NIM               : 23176007
 * Kelas             : PBO12
 * Prodi             : Sistem Informasi
 * Deskripsi Program : Program ini berisi program untuk menampilkan program rata - rata nilai
 */

import java.util.Scanner;

public class SI_RegPagi23176007Latihan21ProgramRataRataNilai {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        
        double totalNilai = 0;
        
        for (int i = 1; i <=jumlahMahasiswa; i++) {
        System.out.print("Nilai Mahasiswa ke-" + i + ":");
        
        double nilai = input.nextDouble();
        totalNilai += nilai;
        
        }
        double rataRata = totalNilai/
                jumlahMahasiswa;
        
        System.out.printf("Maka, Rata-rata Nilainya adalah %.1f%n", rataRata);
        System.out.println("Developed br : Rizki Adam Kurniawan");
        
                
        }
    }
