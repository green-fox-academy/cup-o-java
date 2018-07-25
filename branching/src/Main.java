public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        count();

        draw("diamond");

        greet("Adél");
    }

    public static void count() {
        int age = 27;
        System.out.println(age);
    }


    public static void draw(String shape) {
        System.out.println("I am going to draw a " + shape);
    }

    public static void cheer(String writeThis) {
        System.out.println(writeThis);

    }
        public static void greet(String name){
            System.out.println("Hello " + name);
        }


}
