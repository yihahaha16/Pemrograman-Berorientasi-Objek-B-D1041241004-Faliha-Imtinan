/*
NIM: D1041241004
Nama: Faliha Imtinan
p022WorkingVariable
*/
package Pertemuan9;

class Mobil{
    //Atribut
    String merk;
    String warna;
    int tahun;
    int kecepatan;

    public void percepat(){
          
    }

    public void tampilkaninfo(){
      System.out.println("Merk: "+merk);
      System.out.println("Warna: "+warna);
      System.out.println("Tahun: "+tahun);
      System.out.println("kecepatan: "+kecepatan);
    }
}

public class ObjectDanClass {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota";
        mobil1.warna = "Silver";
        mobil1.tahun = 2019;
        mobil1.kecepatan = 150;

        mobil1.tampilkaninfo();
    }       

}
