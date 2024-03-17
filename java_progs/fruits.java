class Apple {
    void show() {
        System.out.println("Apple class show() method");
    }
}

class Banana extends Apple {
    @Override
    void show() {
        System.out.println("Banana class show() method");
    }
}

class Cherry extends Apple {
    @Override
    void show() {
        System.out.println("Cherry class show() method");
    }
}

public class fruits{
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Cherry cherry = new Cherry();

        // Dynamic method dispatch
        Apple[] fruits = { apple, banana, cherry };

        for (Apple fruit : fruits) {
            fruit.show(); // Calls the appropriate show() method based on the actual object type
        }
    }
}
