/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg23176007.latihan26.waktusaatini;

/**
 *
 * @author 
 * Nama              : Akmaliyah
 * NIM               : 23176007
 * Kelas             : PBO12
 * Prodi             : Sistem Informasi
 * Deskripsi Program : Program ini berisi program untuk menampilkan waktu saat ini
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SI_RegPagi23176007Latihan26WaktuSaatIni {

    
    public static void main(String[] args) {
        
         // Membuat format tanggal sesuai dengan contoh
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", new Locale("id", "ID"));
        
        // Mendapatkan waktu saat ini
        Date date = new Date();
        
        // Menampilkan waktu saat ini dengan format yang diinginkan
        System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }
}
