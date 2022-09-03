import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbs = new ArrayList<Integer>();
        for(int i = 0; i < 3; i++){
            numbs.add(scanner.nextInt());
        }

        scanner.nextLine();
        String order = scanner.nextLine();
        Collections.sort(numbs);

        int A,B,C;
        A = numbs.get(0);
        B = numbs.get(1);
        C = numbs.get(2);
        for(int i = 0; i<3;i++){
            if(order.charAt(i) == 'A'){
                System.out.print(A);
            }
            else if(order.charAt(i) == 'B'){
                System.out.print(B);
            }
            else if(order.charAt(i) == 'C'){
                System.out.print(C);
            }
            System.out.print(" ");
        }



    }
}
