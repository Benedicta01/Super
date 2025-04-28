// Superclass
class Superclass {
    int number = 56; // variable in Superclass
}

// Child class (Subclass)
class Subclass extends Superclass {
    int number = 96; // variable in Subclass

    void printNumber() {
        System.out.println(number);       // prints Subclass's number
        System.out.println(super.number); // prints Superclass's number
    }
}

class main {
    public static void main(String[] args) {
        Subclass sub = new Subclass();
        sub.printNumber();
    }
}
