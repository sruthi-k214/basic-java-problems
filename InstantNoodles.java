# Instant Noodles Problem

A simple Java program to calculate the maximum number of customers
served based on number of stoves and cooking time.

Concepts used:
- Input handling
- Arithmetic operations
- Basic problem solving

  
import java.util.Scanner;

public class InstantNoodles {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
      
        int X = sc.nextInt(); 
      
        int Y = sc.nextInt(); 
      
        int maxCustomers = X * Y;
      
        System.out.println(maxCustomers);
    }
}
