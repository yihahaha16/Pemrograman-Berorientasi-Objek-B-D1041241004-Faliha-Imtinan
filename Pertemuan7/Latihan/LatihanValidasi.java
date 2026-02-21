/*
NIM: D1041241004
Nama: Faliha Imtinan
LatihanValidasi
*/
package Pertemuan7.Latihan;

import java.util.Scanner;
public class LatihanValidasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isTrue = true;
        do { 
            System.out.println("=== VALIDASI NILAI UJIAN ===");
            System.out.println("Percobaan input: ");
            int nilai = input.nextInt();
            if(nilai >= 0 && nilai <= 100){
                System.out.println("[OK] Nilai valid: "+nilai);
                isTrue = false;
            }else{
                System.out.println("Error: Nilai harus antara 0-100!");
            }
        } while (isTrue);
    }
}
