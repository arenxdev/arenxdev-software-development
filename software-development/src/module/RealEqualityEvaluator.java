package module;

import java.util.Scanner;

public class RealEqualityEvaluator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first real number:");
        double number1 = scanner.nextDouble();
        
        System.out.println("Enter the second real number:");
        double number2 = scanner.nextDouble();
        
        System.out.println("Enter the allowance:");
        double allowance = scanner.nextDouble();
        
        boolean isEquals = (Math.abs(number1 - number2) > allowance);
        System.out.println(isEquals ? "equals" : "not equals");
    }
    
}
