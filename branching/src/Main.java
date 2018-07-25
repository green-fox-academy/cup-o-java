public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        count();

        draw("diamond");
        cheer();
        greet("Cup-O-Java");
        cheer("hi");
    }

    public static void count() {
        int age = 27;
        System.out.println(age);
    }

    public static void draw(String shape) {
        System.out.println("I am going to draw a " + shape);
    }

    public static void cheer() {
    	String cheer = "Cup O' Java";
        System.out.println(cheer);
    }



    public void future() {
		String zodiac = "Scorpio";
    	System.out.println("My zodiac is " + zodiac);
	}

    public static void cheer(String writeThis) {
        System.out.println(writeThis);
    }

    public static void greet(String name) {
        System.out.println("Hello " + name);
    }
}
