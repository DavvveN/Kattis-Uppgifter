
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(); 
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean isIncreasing = false;
        boolean isDecreasing = false;
        String [] name = new String[k];
        
        for(int i = 0; i <k; i++){
            name[i] = scanner.nextLine();
            if(i!= 0){
                if(alpha.indexOf(name[i]) <= alpha.indexOf(name[i-1])){
                    isIncreasing = true;
                }else if(alpha.indexOf(name[i]) >= alpha.indexOf(name[i-1])){
                    isDecreasing = true;
                }
            }
        }
        System.out.println(isDecreasing);
        System.out.println(isIncreasing);
        if(isDecreasing == isIncreasing){
            System.out.println("NEITHER");
        }else if(isIncreasing){
            System.out.println("INCREASING");
        }else if(isDecreasing){
            System.out.println("DECREASING");
        }
        
    }
    
    
}
