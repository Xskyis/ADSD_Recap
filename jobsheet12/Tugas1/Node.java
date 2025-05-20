package Tugas1;

public class Node {
    String nim;
    String nama;
    String prodi;
    Node next;
    Node prev;

    public Node(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.next = null;
        this.prev = null;
    }
}
