import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int amountOfE = (text.length()-2)*2;
        String newText = "h";
        for(int i = 0; i < amountOfE; i++){
            newText+="e";
        }
        newText += "y";
        System.out.println(newText);
    }
}
