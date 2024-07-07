import java.io.*;

public class FileEncryptDecrypt {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Choose operation (encrypt/decrypt): ");
            String operation = reader.readLine();

            System.out.println("Enter input file path: ");
            String inputFilePath = reader.readLine();

            System.out.println("Enter output file path: ");
            String outputFilePath = reader.readLine();

            switch (operation) {
                case "encrypt":
                    encryptFile(inputFilePath, outputFilePath);
                    break;
                case "decrypt":
                    decryptFile(inputFilePath, outputFilePath);
                    break;
                default:
                    System.out.println("Invalid operation. Please specify 'encrypt' or 'decrypt'.");
            }

        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }

    public static void encryptFile(String inputFilePath, String outputFilePath) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFilePath))) {

            int key = 3; // Example encryption key (shift by 3 positions)

            int ch;
            while ((ch = fileReader.read()) != -1) {
                char encryptedChar = (char) (ch + key);
                fileWriter.write(encryptedChar);
            }

            System.out.println("File encrypted successfully.");

        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        }
    }

    public static void decryptFile(String inputFilePath, String outputFilePath) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFilePath))) {

            int key = 3; // Example decryption key (shift by 3 positions)

            int ch;
            while ((ch = fileReader.read()) != -1) {
                char decryptedChar = (char) (ch - key);
                fileWriter.write(decryptedChar);
            }

            System.out.println("File decrypted successfully.");

        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        }
    }
}