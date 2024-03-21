import java.util.Scanner;

public class prompter {
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int min = userInput.nextInt();
        System.out.println("Enter a greater value: ");
        int max = userInput.nextInt();
        System.out.println("Enter a value in between the past two: ");
        int inRange = userInput.nextInt();

        while(inRange <= min || inRange >= max) { 
            System.out.println("This number in not in range. Enter another number in between: ");
            inRange = userInput.nextInt();
        }
        if (inRange > min && inRange < max){
            userInput.close();
            System.out.println("This number is in range.");
        }

        
        

    }
}
