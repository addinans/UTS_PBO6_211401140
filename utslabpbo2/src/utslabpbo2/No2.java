/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utslabpbo2;

public class No2 {
// menghitung permutasi dan kombinasi dengan rekursif

    private int Faktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * Faktorial(n - 1);
        }
    }
    
    public int Permutasi(int n, int r) {
        if (n == 0 || r == 0 || n < r) {
            return 0;
        } else if (n == r) {
            return 1;
        } else {
            return Faktorial(n)/Faktorial(n - r);
        }
    }
    
    public int Kombinasi(int n, int r) {
        if (n == 0 || r == 0 || n < r) {
            return 0;
        } else if (n == r) {
            return 1;
        } else {
            return Faktorial(n)/(Faktorial(r) * Faktorial(n - r));
        }
    }
    
    public static void main(String[] args) {
        No2 permutasiKombinasi = new No2();
        int hasilPermutasi = permutasiKombinasi.Permutasi(5, 2);
        int hasilKombinasi = permutasiKombinasi.Kombinasi(5, 2);
        System.out.println("Hasil permutasi = " + hasilPermutasi);
        System.out.println("Hasil kombinasi = " + hasilKombinasi);
    }
    
}
