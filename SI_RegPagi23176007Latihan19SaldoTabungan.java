/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg23176007.latihan19.saldotabungan;

/**
 *
 * @author 
 * Nama              : Akmaliyah
 * NIM               : 23176007
 * Kelas             : PBO12
 * Prodi             : Sistem Informasi
 * Deskripsi Program : Program ini berisi program untuk menampilkan saldo tabungan
 */

public class SI_RegPagi23176007Latihan19SaldoTabungan {

    public static void main(String[] args) {

         // Deklarasi variabel
        double saldoAwal = 2500000; // Saldo awal Rp. 2.500.000
        double bunga = 0.15; // Bunga 15% per bulan
        int lama = 6; // Lama waktu dalam bulan

        // Proses perhitungan dan output
        for (int i = 1; i <= lama; i++) {
            saldoAwal += saldoAwal * bunga; // Menghitung saldo dengan bunga
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", i, saldoAwal);


    }
    }
    
}
