package Tugas2;

public class FilmMain {
    public static void main(String[] args) {
        FilmManager manager = new FilmManager();

        System.out.println("PROGRAM MANAJEMEN DATA FILM");
        System.out.println("===========================");

        Film film1 = new Film("F001", "Spider-Man: No Way Home", 8.7);
        Film film2 = new Film("F002", "Skyfall", 7.8);
        Film film3 = new Film("F003", "The Dark Knight Rises", 8.4);
        Film film4 = new Film("F004", "Death on The Nile", 6.8);
        Film film5 = new Film("F005", "Uncharted", 6.7);

        DoubleLinkedList demoList = new DoubleLinkedList();
        demoList.tambahDataAkhir(film1);
        demoList.tambahDataAkhir(film2);
        demoList.tambahDataAkhir(film3);
        demoList.tambahDataAkhir(film4);
        demoList.tambahDataAkhir(film5);

        System.out.println("Data Contoh Film:");
        demoList.cetak();

        manager.mulaiAplikasi();
    }
}
