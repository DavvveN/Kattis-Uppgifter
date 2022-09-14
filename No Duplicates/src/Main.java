import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Scanner console = new Scanner(line);
        ArrayList<String> words = new ArrayList();

        int l = 0;
        task:
        while (console.hasNext()) {
            String word = console.next();

            words.add(word);
            for (int i = 0; i < words.size() - 1; i++) {
                if (words.get(i).equals(word)) {
                    System.out.println("no");
                    System.exit(0);
                }

            }

        }
        System.out.println("yes");
    }
}
