import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> lib = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            String key = scanner.next();
            if(key.equalsIgnoreCase("def")){
                String word = scanner.next();
                int index = Integer.parseInt(scanner.next());
                lib.put(word,index);
            }
            if(key.equalsIgnoreCase("calc")){
                String innerNext = scanner.next();
                ArrayList<String> values = new ArrayList<>();
                ArrayList<Character> operation = new ArrayList<>();
                String chars= "+-";
                String message = null;
                boolean isNull = false;

                if(lib.get(innerNext)!=null){
                    values.add(innerNext);
                }else if(chars.contains(innerNext) ){
                    operation.add(innerNext.charAt(0));
                }else if(innerNext.equals("=")){
                    operation.add(innerNext.charAt(0));

                    for(int i = 0; i <values.size(); i++){
                        message+=values.get(i)+ " " + operation.get(i) +" ";
                        System.out.println(message);
                    }
                    if(isNull){
                        message+= "unknown";
                    }else{
                        System.out.println(message);
                    }
                }else if(lib.get(innerNext) == null){
                    isNull = true;
                }
            }


        }
    }
}
