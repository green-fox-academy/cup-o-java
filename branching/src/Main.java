public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        count();

        draw("diamond");
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
}
