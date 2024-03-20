import java.util.Scanner;

public class numberSum {
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = userInput.nextInt();
        int startNum = 1;
        int sum = ((num * (num + 1)) / 2); 
        userInput.close();

        System.out.println(startNum);
        while(startNum < num) {
            startNum++; 
            System.out.println(startNum);
            
            if(startNum == num) {
                System.out.println("The sum is: " + sum);
                
            }
            
        }

        

    }
}
