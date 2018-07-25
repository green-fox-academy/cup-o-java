public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        count(2);
        draw("diamond");
        greet("Cup-O-Java", 25);
        count();
        draw("diamonds", 5);
        greet("Cup-O-Java", 50);
        cheer();
        draw("diamond", 5);
        cheer("hi");
        future();
    }

    public static void count(int age) {
        System.out.println("I am " + age);
    }

    public static void draw(String shape, int number) {
        System.out.println("I am going to draw " + number + shape);
    }

    public static void cheer() {
        System.out.println("Cup O' Java");
    }
        public static void greet(String name, int number) {
            System.out.println("Hello " + name + "! Hope you will win " + number + " million dollars on the lottery!");
        }

    public static void cheer(String writeThis) {
        System.out.println(writeThis);
    }

    public static void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static void future()
    {
        System.out.println("Goat");
    }
}
