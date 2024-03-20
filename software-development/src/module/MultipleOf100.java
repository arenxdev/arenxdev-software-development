package module;

import java.util.Scanner;

public class MultipleOf100 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();
        
        System.out.println(number % 100 == 0 ? "multiple of 100" : "not multiple of 100");
    }
    
}
