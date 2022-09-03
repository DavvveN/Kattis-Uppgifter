import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int lines = scanner.nextInt();
	    scanner.nextLine();
	    for(int i = 0; i < lines; i++){
            String word = scanner.nextLine();
            if(i%2 == 0){
                System.out.println(word);
            }
        }

    }
}
