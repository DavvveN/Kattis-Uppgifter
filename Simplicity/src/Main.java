import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        int []amountLetters = new int[27];

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for(int i =0; i < text.length(); i++){
            amountLetters[alphabet.indexOf(text.charAt(i))]++;
        }
        Arrays.sort(amountLetters);
        int sum = 0;
        for(int j = 0; j < amountLetters.length-2; j++){
            sum+=amountLetters[j];
        }
        System.out.println(sum);

    }
}
