package Praktikum;
import java.util.Scanner;

public class DeretBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.println("======================");

        // Ambil 2 digit terakhir dari NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // Jika n kurang dari 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }

        // Output n
        System.out.println("n: " + n);

        // Cetak deretan bilangan
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
