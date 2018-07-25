public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        count();

        draw("diamond");

        greet("Cup-O-Java", 25);
    }

    public static void count() {
        int age = 27;
        System.out.println(age);
    }



    public static void draw(String shape) {
        System.out.println("I am going to draw a " + shape);
    }

    public static void cheer() {
        System.out.println("Cup O' Java");

    }
        public static void greet(String name, int number){
            System.out.println("Hello " + name + "! Hope you will win " + number + " million dollars on the lottery!");
        }


}
