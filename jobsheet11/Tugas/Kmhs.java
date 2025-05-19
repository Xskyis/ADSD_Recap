package Tugas;

public class Kmhs {
    public String nim;
    public String name;
    public String serviceType;
    
    public Kmhs(String nim, String name, String serviceType) {
        this.nim = nim;
        this.name = name;
        this.serviceType = serviceType;
    }
    
    public String toString() {
        return "NIM: " + nim + ", Name: " + name + ", Service Type: " + serviceType;
    }

}
