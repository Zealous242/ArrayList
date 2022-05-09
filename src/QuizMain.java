import java.util.ArrayList;
import java.util.Scanner;

public class QuizMain {
    public static void main(String[] args) {
        boolean answer1Correct = false;
        boolean answer2Correct = false;
        boolean answer3Correct = false;
        String answer1 = new String();
        String answer2 = new String();
        String answer3 = new String();

        ArrayList<String> Mark = new ArrayList<String>();

        Scanner myObj = new Scanner(System.in);

        System.out.println("1. What is the only element for which the Schrodinger equation can be solved exactly and " +
                "doesn't require the use of numerical methods?\n");

        System.out.println("Choose from the following:\n");
        System.out.println("a) Hydrogen\n");
        System.out.println("b) Lithium\n");
        System.out.println("c) Helium\n");
        System.out.println("d) Sodium\n");

        System.out.println("Enter a, b, c or d\n");

        while(answer1.equals("a")==false && answer1.equals("b")==false && answer1.equals("c")==false && answer1.equals("d")==false){

            myObj = new Scanner(System.in);

            answer1 = myObj.nextLine();

            if(answer1.equals("a")==false && answer1.equals("b")==false && answer1.equals("c")==false && answer1.equals("d")==false){
                System.out.println("Invalid response! Must Type a, b, c or d!");
            }
        }

        if(answer1.equals("a") == true){
            answer1Correct = true;
            Mark.add("1. Correct");
        }
        else{
            answer1Correct = false;
            Mark.add("1. Wrong");
        }

        System.out.println("2. What geometry is our universe believed to have?\n");

        System.out.println("Choose from the following:\n");
        System.out.println("a) Open\n");
        System.out.println("b) Closed\n");
        System.out.println("c) Flat\n");
        System.out.println("d) None of the above\n");

        System.out.println("Enter a, b, c or d\n");

        while(answer2.equals("a")==false && answer2.equals("b")==false && answer2.equals("c")==false && answer2.equals("d")==false){

            myObj = new Scanner(System.in);

            answer2 = myObj.nextLine();

            if(answer2.equals("a")==false && answer2.equals("b")==false && answer2.equals("c")==false && answer2.equals("d")==false){
                System.out.println("Invalid response! Must Type a, b, c or d!");
            }
        }
        if(answer2.equals("c") == true){
            answer2Correct = true;
            Mark.add("2. Correct");
        }
        else{
            answer2Correct = false;
            Mark.add("2. Wrong");
        }

        System.out.println("3. What is the value of the speed of light in a vacuum in metres per second (m/s)?");

        System.out.println("Choose from the following:\n");
        System.out.println("a) 310,000,000\n");
        System.out.println("b) 432,253,766\n");
        System.out.println("c) 289,763,491\n");
        System.out.println("d) 299,792,458\n");

        System.out.println("Enter a, b, c or d\n");

        while(answer3.equals("a")==false && answer3.equals("b")==false && answer3.equals("c")==false && answer3.equals("d")==false){

            myObj = new Scanner(System.in);

            answer3 = myObj.nextLine();

            if(answer3.equals("a")==false && answer3.equals("b")==false && answer3.equals("c")==false && answer3.equals("d")==false){
                System.out.println("Invalid response! Must Type a, b, c or d!");
            }
        }
        if(answer3.equals("d") == true){
            answer3Correct = true;
            Mark.add("3. Correct");
        }
        else{
            answer3Correct = false;
            Mark.add("3. Wrong");
        }

        System.out.println("Test Results:");

        for(int i = 0; i < Mark.size();i++){
            System.out.println(Mark.get(i));
        }
    }
}
