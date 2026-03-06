/*
NIM: D1041241004
Nama: Faliha Imtinan
LatihanMobilConstructor
*/
package Pertemuan10.Latihan;

class Mobil{
    String merk;
    String warna;
    int tahun;

    public Mobil(){
        merk = "Belum diisi";
        warna = "Belum diisi";
        tahun = 0;
    }

    public Mobil(String merk){
        warna = "Belum diisi";
        tahun = 0;
    }

    public Mobil(String merk, String warna, int tahun){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    public void tampilkanSpesifikasi(){
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun + "\n");
    }
}

public class LatihanMobilConstructor {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.tampilkanSpesifikasi();
        Mobil mobil2 = new Mobil("Toyota");
        mobil2.tampilkanSpesifikasi();
        Mobil mobil3 = new Mobil("Honda Civic","Merah",2023);
        mobil3.tampilkanSpesifikasi();
    }
}