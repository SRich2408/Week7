/* Name: Sebastian Richardson
Project: GCD 
Date: 3/21/2024 */

import java.util.Scanner; 

public class exercise10 {
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a non negative integer: ");
        int num1 = userInput.nextInt();
        System.out.println("Enter a second non negative integer: ");
        int num2 = userInput.nextInt();
        userInput.close();
        while (num2 > 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("The GCD is: " + num1);


        
        

    }
}
