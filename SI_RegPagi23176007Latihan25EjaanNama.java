/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg23176007.latihan25.ejaannama;

/**
 *
 * @author 
 * Nama              : Akmaliyah
 * NIM               : 23176007
 * Kelas             : PBO12
 * Prodi             : Sistem Informasi
 * Deskripsi Program : Program ini berisi program untuk menampilkan ejaan nama
 */

import java.util.Scanner;

public class SI_RegPagi23176007Latihan25EjaanNama {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String nama = input.nextLine();

        // Menampilkan ejaan nama
        System.out.println("Ejaan untuk \"" + nama + "\" adalah :");
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }
        
        System.out.println("BUILD SUCCESSFUL");
    }
}
