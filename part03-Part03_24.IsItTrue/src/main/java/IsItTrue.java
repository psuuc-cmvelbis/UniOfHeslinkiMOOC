
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a string: ");
        String s = scanner.nextLine();
        if(!(s.equals("true"))){
            System.out.println("Try Again!");
        }else{
            System.out.println("You got it right!");
        }
    }
}