/*
NIM: D1041241004
Nama: Faliha Imtinan
LatihanBulan
*/
package Pertemuan6;

public class LatihanBulan{
    public static void main (String args[]){
        short angkaBulan = 5;

        System.out.println("=== KONVERSI BULAN ===");
        System.out.println("Angka Bulan: " + angkaBulan);
        switch (angkaBulan){
            case 1:
                String bulan = "Januari";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 2:
                String bulan = "Februari";
                System.out.println("Nama Bulan: " + bulan);
                break;
             case 3:
                String bulan = "Maret";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 4:
                String bulan = "April";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 5:
                String bulan = "Mei";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 6:                
                String bulan = "Juni";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 7:
                String bulan = "Juli";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 8:
                String bulan = "Agustus";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 9:
                String bulan = "September";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 10:
                String bulan = "Oktober";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 11:
                String bulan = "November";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 12:
                String bulan = "Desember";
                System.out.println("Nama Bulan: " + bulan);
                break;
            default:
                System.out.println("Error: Angka bulan tidak valid (1-12)");
                break;
        }
    }
}