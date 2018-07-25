public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        count(2);
        draw("diamond");
        cheer();
        greet("Cup-O-Java");
        cheer("hi");
    }

    public static void count(int age) {
        System.out.println("I am " + age);
    }

    public static void draw(String shape) {
        System.out.println("I am going to draw a " + shape);
    }

    public static void cheer() {
        System.out.println("Cup O' Java");
    }

    public static void cheer(String writeThis) {
        System.out.println(writeThis);
    }

    public static void greet(String name) {
        System.out.println("Hello " + name);
    }
}
