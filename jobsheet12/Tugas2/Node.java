package Tugas2;

public class Node {
    Film data;
    Node next;
    Node prev;

    public Node(Film data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
