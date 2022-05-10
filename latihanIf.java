package src.latihanIfStatement;

import java.util.*;

public class latihanIf {

    public static void main(String[] args) {

        //buat objek scanner
        Scanner userInput = new Scanner(System.in);

        // buat variabel input
        int nilai;
        nilai = userInput.nextInt();

        //program nilai dengan if statement
        if ( nilai >= 80 ) {
            System.out.println("Nilai Anda : A");
        } else if ( nilai >=60 ) {
            System.out.println("Nilai Anda : B");
        } else if ( nilai >= 40 ) {
            System.out.println("Nilai Anda : C");
        } else if ( nilai >= 20 ) {
            System.out.println("Nilai Anda : D");
        } else if ( nilai >= 0 ) {
            System.out.println("Nilai Anda : E");

        }

    }
    
}
