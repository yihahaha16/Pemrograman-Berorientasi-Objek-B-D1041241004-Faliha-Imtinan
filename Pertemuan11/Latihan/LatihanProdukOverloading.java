/*
NIM: D1041241004
Nama: Faliha Imtinan
LatihanMobilOverloading
*/

package Pertemuan11.Latihan;

class Produk{
    String namaProduk;
    int harga;
    int stok;

    public Produk(String namaProduk, int harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
        stok = 0;
    }

    public Produk(String namaProduk, int harga, int stok){
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo(){
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga      : Rp " + harga);
        System.out.println("Stok       : " + stok + "\n");
    }
}

public class LatihanProdukOverloading {
    public static void main(String[] args) {
        Produk produk1 = new Produk("Laptop Asus", 8500000);
        produk1.tampilkanInfo();
        Produk produk2 = new Produk("Mouse Logitech", 250000, 50);
        produk2.tampilkanInfo();
    }
}
