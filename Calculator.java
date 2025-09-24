package Methods; // NOTE: VSCode made me add this

public class Calculator {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static String multiply(int a, String b) {
        String tower = "";

        // The for loop continually adds the string to the "tower," making it bigger and bigger as many times as the length "a" specifies.
        for (int i = 0; i < a; i++) {
            tower += b;
        }
        return tower;
    }
    
    public static void main(String[] args) {
        // Test all your overloaded methods
        System.out.println("Two ints: " + multiply(5, 3));
        System.out.println("Three ints: " + multiply(5, 3, 2));
        System.out.println("Two doubles: " + multiply(5.5, 3.2));
        System.out.println("Int and string: " + multiply(3, "Hi!"));
    }
}