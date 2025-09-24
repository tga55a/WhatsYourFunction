package Methods; // NOTE: VSCode made me add this

public class MathHelper {
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int findMin(int a, int b) {

        // if a is less than b, the a must be the minimum.
        // if b is less than a, then b must be the minimum.
        if (a < b) {
            return a;
        } else if (b < a) {
            return b;
        }

        return 0;
    }
    public static void printResult(int a) {
        System.out.println("The result is " + a);
    }
    
    public static void main(String[] args) {
        // Test your methods here
        int sum = calculateSum(15, 25);
        int min = findMin(10, 20);
        printResult(sum);
        printResult(min);
    }
}