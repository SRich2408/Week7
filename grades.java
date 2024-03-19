import java.util.Scanner;

public class grades {
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What was your grade on your last test? ");
        int userGrade = userInput.nextInt();
        userInput.close();

        if(userGrade >= 90) {
            System.out.println("You got an A. Great job!! ");
        } else if (userGrade >= 80 && userGrade < 90) {
            System.out.println("You got an B. Nice job! ");
        } else if (userGrade >= 70 && userGrade < 80) {
            System.out.println("You got an C. Good job, but you could do better. ");
        } else if (userGrade >= 65 && userGrade < 70) {
            System.out.println("You got an D. Need to STUDY MORE. ");
        } else  {
            System.out.println("You got an F. NEED TO COME TO OFFICE HOURS. ");
        }

        

    }
}