import java.util.Scanner;

public class PasswordStrength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Password Strength Checker");
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        int length = password.length();
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        
        for (int i = 0; i < length; i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }

        
        boolean isStrong = length >= 8 && hasUppercase && hasLowercase && hasDigit && hasSpecialChar;

        
        System.out.println("Password Analysis:");
        System.out.println("Length: " + length);
        System.out.println("Has Uppercase Letter: " + hasUppercase);
        System.out.println("Has Lowercase Letter: " + hasLowercase);
        System.out.println("Has Digit: " + hasDigit);
        System.out.println("Has Special Character: " + hasSpecialChar);

        if (isStrong) {
            System.out.println("Password strength: Strong");
        } else {
            System.out.println("Password strength: Weak");
        }

      
    }
}

