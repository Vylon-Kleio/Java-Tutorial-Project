//Membuat program perhitungan hari
package src.latihanIfStatement;

import java.util.*;

public class latihanSwitch {
    
    public static void main(String[] args) {

        //buat objek scanner
        Scanner userInput = new Scanner(System.in);
        
        //program menghitung hari dengan switch statemeent
        int selisihTanggal, tanggalAwal, tanggalAkhir;
        String hariIni;

        System.out.println("Hari ini Hari apa? ");
        hariIni = userInput.next();

        System.out.println("Berapa Hari yang ingin Anda Hitung? ");
        tanggalAkhir = userInput.nextInt();
        
        tanggalAwal = 0;

        //konversi hari ke nilai
        switch (hariIni) {
            case "Senin" :
                tanggalAwal = 1;
                break;
            case "Selasa" :
                tanggalAwal = 2;
                break;
            case "Rabu" :
                tanggalAwal = 3;
                break;
            case "Kamis" :
                tanggalAwal = 4;
                break;
            case "Jumat" :
                tanggalAwal = 5;
                break;
            case "Sabtu" :
                tanggalAwal = 6;
                break;
            case "Minggu" :
                tanggalAwal = 7;
                break;
        }

        //menentukan nilai tanggal
        selisihTanggal = ( tanggalAkhir + tanggalAwal ) % 7;
        
        //konversi nilai ke hari
        switch (selisihTanggal) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 0:
                System.out.println("Minggu");
                break;
        }
        
    }

}