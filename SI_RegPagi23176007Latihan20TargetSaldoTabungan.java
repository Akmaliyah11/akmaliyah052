/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg23176007.latihan20.targetsaldotabungan;

/**
 *
 * @author 
 * Nama              : Akmaliyah
 * NIM               : 23176007
 * Kelas             : PBO12
 * Prodi             : Sistem Informasi
 * Deskripsi Program : Program ini berisi program untuk menampilkan target saldo tabungan
 */

public class SI_RegPagi23176007Latihan20TargetSaldoTabungan {

    public static void main(String[] args) {
        
         // Inisialisasi variabel
        double saldoAwal = 3500000;
        double bungaPerBulan = 8;
        double saldoTarget = 6000000;

        // Hitung saldo tabungan setiap bulan
        double saldoSaatIni = saldoAwal;
        int bulan = 1;
        while (saldoSaatIni < saldoTarget) {
            saldoSaatIni = saldoSaatIni * (1 + bungaPerBulan / 100);
            System.out.println("Saldo di bulan ke-" + bulan + ": Rp. " + saldoSaatIni);
            bulan++;
        }

        // Output hasil
        System.out.println("Untuk mencapai saldo target Rp. 6.000.000, dibutuhkan waktu " + bulan + " bulan.");
    }
}

