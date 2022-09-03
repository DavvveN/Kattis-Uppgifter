import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int occurences = scanner.nextInt();


        for(int i = 0; i< occurences; i++){
            String text1 = scanner.next();
            String text2 = scanner.next();
            String diff = "";
            System.out.println(i);

            for(int l = 0; l < text1.length(); l++){
                if(text1.charAt(l) == text2.charAt(l)){
                    diff+=".";
                }else{
                    diff+="*";
                }
            }
            System.out.println(text1);
            System.out.println(text2);
            System.out.println(diff);
        }
    }
}
