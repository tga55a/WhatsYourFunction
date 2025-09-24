package Methods;

public class PasswordGenerator {
    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private static String digits = "0123456789";
    private static String symbols = "!@#$%^&*";

    public static String getRandomLower() {
        // Select a random letter from the alphabet string
        double index = Math.ceil(Math.random() * alphabet.length()); // Select a random index
        int i = (int)(index);
        return alphabet.substring(i - 1, i); // Convert that random index to a letter.
    }

    public static String getRandomUpper() {
        // We already created the method to randomize a letter, so we'll just call it and .toUpperCase it.
        String letter = getRandomLower(); 
        return letter.toUpperCase();
    }

    public static String getRandomDigit() {
        // Select a random letter from the digit string
        double index = Math.ceil(Math.random() * digits.length()); // Select a random index
        int i = (int)(index);
        return digits.substring(i - 1, i); // Convert that random index to a digit.
    }

    public static String getRandomSpecial() {
        // Select a random letter from the symbols string
        double index = Math.ceil(Math.random() * symbols.length()); // Select a random index
        int i = (int)(index);
        return symbols.substring(i - 1, i); // Convert that random index to a symbol or special character.
    }

    public static String generatePassword(int a) {
        String password = "";
        for (int i = 0; i < a; i++) {

            // randomize the type of character to randomize
            int typeCharIndex = (int)(Math.ceil(Math.random() * 4));

            if (typeCharIndex == 1) {
                password += getRandomLower();
            } else if (typeCharIndex == 2) {
                password += getRandomUpper();
            } else if (typeCharIndex == 3) {
                password += getRandomDigit();
            } else if (typeCharIndex == 4) {
                password += getRandomSpecial();
            }
        }
        return password;

    }

    public static void main(String[] args) {
        System.out.println("Random lowercase: " + getRandomLower());
        System.out.println("Random uppercase: " + getRandomUpper());
        System.out.println("Random digit: " + getRandomDigit());
        System.out.println("Random special: " + getRandomSpecial());
        System.out.println("8-character password: " + generatePassword(8));
    }

}

