/*
NIM: D1041241004
Nama: Faliha Imtinan
ClassPersegi
*/
package Pertemuan9.Latihan;

class Persegi{
    int sisi;
    int luas;
    int keliling;

    public void hitungLuas(){
        luas = sisi*sisi;
    }

    public void hitungKeliling(){
        keliling = 4 * sisi;
    }

    public void tampilkanHasil(){
        System.out.println("=== PERSEGI  ===");
        System.out.println("Sisi    : " + sisi + " cm");
        System.out.println("Luas    : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
    }
}

public class ClassPersegi {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi();
        persegi1.sisi = 5;
        persegi1.hitungLuas();
        persegi1.hitungKeliling();
        persegi1.tampilkanHasil();
    }
}
