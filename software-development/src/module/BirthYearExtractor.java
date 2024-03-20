package module;

import java.util.Scanner;

public class BirthYearExtractor {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your 11-digit ID");
        long idNumber = scanner.nextLong();
        
        String numeroComoString = String.valueOf(idNumber);
        
        String birthYear = numeroComoString.substring(0, 2);
        
        System.out.println(birthYear);
    }
    
}
