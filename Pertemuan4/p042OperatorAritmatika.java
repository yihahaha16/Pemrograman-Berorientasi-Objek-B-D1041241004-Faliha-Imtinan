/*
NIM: D1041241004
Nama: Faliha Imtinan
p022WorkingVariable
*/
package Pertemuan4;

public class p042OperatorAritmatika {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));

        //untuk mengubah hasil perhitungan menjadi double
        double hasil = (double) a/b;
        System.out.println("a / b (desimal) = " + hasil);
    }
}
