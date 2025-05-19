import java.util.Scanner;

public class SLLMain03 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        SingleLinkedList03 sll = new SingleLinkedList03();
       
        Mahasiswa03 mhs0 = new Mahasiswa03("22212202", "Hawa", "3C", "3.5");
        Mahasiswa03 mhs1 = new Mahasiswa03("22212202", "Cintia", "3C", "3.5");
        Mahasiswa03 mhs2 = new Mahasiswa03("23212201", "Bimon", "2B", "3.8");
        Mahasiswa03 mhs3 = new Mahasiswa03("22212203", "Diana", "3A", "3.9");

        sll.addFirst(mhs0);
        sll.addLast(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);

        System.out.println("data index 1 :");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
        // int pilihan;
        // do {
        //     System.out.println("\n======= Menu Operasi Linked List =======");
        //     System.out.println("1. Tambah Data");
        //     System.out.println("2. Tampilkan Data");
        //     System.out.println("3. Keluar");
        //     System.out.print("Pilih menu (1-3): ");

        //     pilihan = sc.nextInt();
        //     sc.nextLine();

        //     switch (pilihan) {
        //         case 1:
        //             sll.inputData();
        //             break;
        //         case 2:
        //             sll.print();
        //             break;
        //         case 3:
        //             System.out.println("Terima kasih telah menggunakan program!");
        //             break;
        //         default:
        //             System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        //     }
        // } while (pilihan != 3);

        

    }
}
