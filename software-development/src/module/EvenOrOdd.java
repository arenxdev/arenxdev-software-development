package module;

import java.util.Scanner;

public class EvenOrOdd {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();
        
        System.out.println(number % 2 == 0 ? "even" : "odd");
    }
    
}
