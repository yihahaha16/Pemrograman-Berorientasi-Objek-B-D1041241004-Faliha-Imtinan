package Pertemuan6.Latihan;

public class LatihanBulan {
    public static void main (String[] args){
        int angkaBulan = 5;
        String bulan;
        System.out.println("=== KONVERSI BULAN ===");
        System.out.println("Angka Bulan: " + angkaBulan);
        switch (angkaBulan){
            case 1:
                bulan = "Januari";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 2:
                bulan = "Februari";
                System.out.println("Nama Bulan: " + bulan);
                break;
             case 3:
                bulan = "Maret";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 4:
                bulan = "April";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 5:
                bulan = "Mei";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 6:                
                bulan = "Juni";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 7:
                bulan = "Juli";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 8:
                bulan = "Agustus";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 9:
                bulan = "September";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 10:
                bulan = "Oktober";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 11:
                bulan = "November";
                System.out.println("Nama Bulan: " + bulan);
                break;
            case 12:
                bulan = "Desember";
                System.out.println("Nama Bulan: " + bulan);
                break;
            default:
                System.out.println("Error: Angka bulan tidak valid (1-12)");
                break;
        }
    }   
}
