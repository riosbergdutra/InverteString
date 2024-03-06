import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        scanner.close();

        String invertedString = inverterString(input);
        System.out.println("String invertida: " + invertedString);
    }

    public static String inverterString(String input) {
        char[] chars = input.toCharArray();
        int length = chars.length;
        char[] invertedChars = new char[length];

        for (int i = 0; i < length; i++) {
            invertedChars[length - i - 1] = chars[i];
        }

        return new String(invertedChars);
    }
}