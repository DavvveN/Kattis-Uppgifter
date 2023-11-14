import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        scr.nextLine();
        String b = scr.nextLine();
        int min = a + 1;
        int k = -1;

        for(int i = 0; i < a; i++){
            if(b.charAt(i) == '.'){
                if(k == -1){
                    k = i;
                }else{
                    min = Math.min(min,i-k-1);
                    k = i;
                }
            }
        }

        System.out.println(min);
    }
}
