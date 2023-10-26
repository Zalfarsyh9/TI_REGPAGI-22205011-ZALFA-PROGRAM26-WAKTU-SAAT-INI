/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi22205011.latihan26.zalfa.java;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
/**
 *
 * @author User
 */
public class TI_REGPAGI22205011Latihan26ZalfaJava {

    public static void main(String[] args) {
        // Dapatkan waktu saat ini 
        LocalDateTime waktuSaatIni = LocalDateTime.now();
        Locale locale = new Locale("id", "ID");
        
        //format waktu
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss", locale);
                
        //tampilkan waktu 
        System.out.println("Hari ini adalah hari : " + formatter.format(waktuSaatIni));
    }
}
