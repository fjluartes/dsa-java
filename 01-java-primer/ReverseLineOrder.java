// P1.26 Reverse Line Order
import java.util.Scanner;

public class ReverseLineOrder {
    public static void main(String[] args) {
        String str = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of string: "); 
        while(!input.hasNextInt()) {
            String newStr = "";
            char c;
            String temp = input.nextLine();
            for (int i = 0; i < temp.length(); i++) {
                c = temp.charAt(i);
                newStr = c + newStr;
            }
            str += newStr + "\n";
        }
        System.out.println(str);
    }
}
