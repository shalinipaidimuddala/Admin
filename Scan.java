


import java.util.InputMismatchException;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter space-separated integers:");
            String input = scanner.nextLine();
            
            try {
                String[] numbers = input.split(" ");
                int sum = 0;
                
                for (String number : numbers) {
                    int num = Integer.parseInt(number);
                    
                    if (num % 2 == 0) {
                        continue;
                    }
                    
                    sum += num;
                    
                    if (sum > 100) {
                        System.out.println("Limit exceeded! Sum: " + sum);
                        break;
                    }
                }
                
                if (sum <= 100) {
                    System.out.println("Sum within limit. Sum: " + sum);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter only integers.");
            }
        }
    }
}


