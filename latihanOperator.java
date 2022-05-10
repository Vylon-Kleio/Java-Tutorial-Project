package src.latihanOperatorLogika;

// import java library
import java.util.*;

public class LatihanOperator {

    public static void main(String[] args) {
        // buat objek untuk menerima user input
        Scanner userInput = new Scanner(System.in);

        // buat program mencari keliling dan luas segitiga sama sisi
        // buat variabel untuk input
        double sisiSegitiga, kelilingSegitiga, tinggiSegitiga, luasSegitiga;

        System.out.print("Masukkan panjang sisi segitiga : ");
        sisiSegitiga = userInput.nextDouble();

        // program mencari Keliling segitiga
        kelilingSegitiga = sisiSegitiga + sisiSegitiga + sisiSegitiga;
        System.out.println("Keliling segitiga = " + kelilingSegitiga);

        // program mencari tinggi
        tinggiSegitiga = 0.5 * sisiSegitiga * Math.sqrt(3);

        // program mencari luas segitiga
        luasSegitiga = 0.5 * sisiSegitiga * tinggiSegitiga;
        System.out.println("Luas segitiga = " + luasSegitiga);

        // buat program mencari keliling dan luas trapesium sama kaki
        // buat variabel input
        double sisiAtasTrapesium, sisiAlasTrapesium, sisiMiringTrapesium, kelilingTrapesium, alasTrapesium, tinggiTrapesium, luasTrapesium;
        System.out.print("Masukkan sisi atas trapesium : ");
        sisiAtasTrapesium = userInput.nextDouble();

        System.out.print("Maukkan sisi alas trapesium : ");
        sisiAlasTrapesium = userInput.nextDouble();

        System.out.print("Masukkan sisi miring trapesium : ");
        sisiMiringTrapesium = userInput.nextDouble();

        // program keliling trapesium
        kelilingTrapesium = (2 * sisiMiringTrapesium) + sisiAlasTrapesium + sisiAtasTrapesium;
        System.out.println("Keliling trapesium = " + kelilingTrapesium);

        //mencari tinggi trapesium
        alasTrapesium = (sisiAlasTrapesium - sisiAtasTrapesium) / 2;
        tinggiTrapesium = Math.sqrt((sisiMiringTrapesium * sisiMiringTrapesium) - (alasTrapesium * alasTrapesium));

        //program luas trapesium
        luasTrapesium = 0.5 * tinggiTrapesium * (sisiAlasTrapesium + sisiAtasTrapesium);
        System.out.println("Luas trapesium = " + luasTrapesium);

    }
}
