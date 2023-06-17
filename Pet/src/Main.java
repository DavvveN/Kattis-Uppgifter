import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] score = new int[5];
        int largestIndex = 0;
        for(int i = 0; i < 5; i++){
            for (int h = 0; h < 5; h++){
                score[i]+=scanner.nextInt();
            }
            System.out.println(score[i]);
            if(score[i]>=score[largestIndex]){
                largestIndex = i;
            }
        }
        System.out.println(largestIndex +" " + score[largestIndex]);


    }
}
