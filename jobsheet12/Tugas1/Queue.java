package Tugas1;

public class Queue {
    private DoubleLinkedList list;

    public Queue() {
        list = new DoubleLinkedList();
    }

    public void enqueue(String nim, String nama, String prodi) {
        list.tambahData(nim, nama, prodi);
    }

    public Node dequeue(String nim) {
        return list.hapusData(nim);
    }

    public void displayQueue() {
        list.tampilkanData();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size;
    }
}