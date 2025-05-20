package Tugas1;

public class DoubleLinkedList {
    Node head;
    Node tail;
    int size;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void tambahData(String nim, String nama, String prodi) {
        Node newNode = new Node(nim, nama, prodi);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    public Node hapusData(String nim) {
        if (isEmpty()) {
            return null;
        }

        Node current = head;

        while (current != null) {
            if (current.nim.equals(nim)) {
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                } else if (current == head) {
                    head = head.next;
                    head.prev = null;
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                size--;
                return current;
            }

            current = current.next;
        }

        return null;
    }

    public void tampilkanData() {
        if (isEmpty()) {
            System.out.println("Daftar kosong!");
            return;
        }

        System.out.println("==========================");
        System.out.println("Daftar Pengantri Vaksin");
        System.out.println("==========================");
        System.out.println("NIM\t|Nama\t|Prodi");
        System.out.println("==========================");

        Node current = head;
        while (current != null) {
            System.out.println(current.nim + "\t|" + current.nama + "\t|" + current.prodi);
            current = current.next;
        }

        System.out.println("Size Antrian: " + size);
    }
}
