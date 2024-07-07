import java.util.Scanner;
import java.util.Random;


public class Password_Generator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the desired length of the password:");
		int length = sc.nextInt();
		
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()_+~`|}{[]:;?><,./-=";
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String allChars = characters + numbers + specialChars;
        
        char[] password = new char[length];
        Random random = new Random();
        
        for (int i = 0; i < length; i++) {
            password[i] = allChars.charAt(random.nextInt(allChars.length()));
        }

        System.out.println(new String(password));

	}

}
