import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class April4{

    public static void main(String[] args) {
        //Design a program that can handle reading in multiple data types


        //Count the number of each data type in the file
        //Data types will be string, double, or integer
        int numDoubles = 0;
        int numStrings = 0;
        int numIntegers = 0;
        int tokens = 0;
        //String tok = "string";
        //int count = tok.length();
        //System.out.println(count);
        int numb = 0;
        try {

            //Create a Scanner and Read in each token
            Scanner scanner = new Scanner(new File("randoms.txt"));

            //Check if it's a double or integer; if neither, it's a string
            while (scanner.hasNext()) {
                String token = scanner.next();

                tokens++;

                if (isInteger(token)) {
                    numIntegers++;
                } else if (isDouble(token)) {
                    numDoubles++;
                } else {
                    numb += token.length();
                  //  System.out.println(numb);
                    numStrings++;
                }

            }

        } catch (FileNotFoundException exec) {
            System.out.println(exec.getMessage());

        }

        //based on result, increment that cummulative sum variable
        System.out.printf("Doubles: %d, Strings: %d, Integers: %d \n", numDoubles, numStrings, numIntegers);
        System.out.println(tokens);
        System.out.println(numb);

    }

    public static boolean isDouble(String input){
        try{

            double result = Double.parseDouble(input);
            return true;
        }catch(NumberFormatException  exec){
            return false;
        }

    }

    public static boolean isInteger(String input){
        try{
            int result = Integer.parseInt(input);
            return true;
        }catch(NumberFormatException  exec){
            return false;
        }

    }

    public static boolean testInput(){
        try{
            System.out.println("Please enter an integer");
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            return true;
        }catch(InputMismatchException exec){
            System.out.println("Please follow directions! Try again \n");
            return false;
        }

    }

    public static void intException(){
        do{

        }while(!testInput());
    }

    public static void doubleException(){

    }

   /*public static void createFile(){

      try{
         File file = new File("out.txt");
         PrintStream output = new PrintStream(file);
         output.println("Hello, Professor!");

      }catch(FileNotFoundException exec){
         System.out.println(exec.getMessage());
      }

   }*/

}
