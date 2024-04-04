/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialbonacci;

/**
 *
 * @author prakasa putra
 */
public class FactorialBonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int akas = 10; // Jumlah angka dalam sekuen
        int aksa = 2;  // Jumlah angka sebelumnya untuk setiap iterasi

        // Panggil fungsi untuk menghasilkan dan mencetak sekuen Factorial Bonacci
        printFactorialSD(akas, aksa);
    }

    // Fungsi untuk menghitung dan mencetak sekuen Factorial Bonacci
    public static void printFactorialSD(int akas, int aksa) {
        long[] seq = new long[akas]; // Array untuk menyimpan sekuen
        long[] factorials = new long[aksa]; // Array untuk menyimpan faktorial

        // Inisialisasi nilai faktorial awal
        for (int i = 0; i < aksa; i++) {
            factorials[i] = factorial(i);
        }

        // Hitung dan simpan nilai untuk setiap iterasi
        for (int i = 0; i < akas; i++) {
            if (i < aksa) {
                seq[i] = factorials[i];
            } else {
                // Hitung nilai Factorial Bonacci menggunakan nilai sebelumnya
                long sum = 0;
                for (int j = 1; j <= aksa; j++) {
                    sum += seq[i - j];
                }
                seq[i] = sum;
            }
            System.out.print(seq[i] + " ");
        }
    }

    // Fungsi untuk menghitung faktorial
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
