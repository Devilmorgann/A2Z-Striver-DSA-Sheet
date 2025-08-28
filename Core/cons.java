public class cons {
    String brand;
    int length;
    int cc;

    // Default constructor
    cons() {
        brand = "unknown";
        length = 4140;
        cc = 0;
    }

    // Parameterized constructor
    cons(String brand, int length, int cc) {
        this.brand = brand;
        this.length = length;
        this.cc = cc;
    }

    // Corrected display method
    void display() {
        System.out.println("Brand: " + brand + ", Length: " + length + ", CC: " + cc);
    }
}

class Main {
    public static void main(String[] args) {
        cons c1 = new cons();
        cons c2 = new cons("VW", 5463, 654);
        cons c3 = new cons("Maruti", 5463, 654);

        c1.display(); // Output: Brand: unknown, Length: 4140, CC: 0
        c2.display(); // Output: Brand: VW, Length: 5463, CC: 654
        c3.display();
    }
}