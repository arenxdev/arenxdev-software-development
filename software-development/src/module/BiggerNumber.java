package module;

import java.util.Scanner;

public class BiggerNumber {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number - " + (i + 1));
            numbers[i] = scanner.nextInt();
        }
        
        int bigger = numbers[0];
        for (int i = 1; i < 5; i++) {
            if (numbers[i] > bigger) {
                bigger = numbers[i];
            }
        }
        
        System.out.println(bigger);
    }
    
}
