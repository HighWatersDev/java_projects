import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class file_analyzer {

    public static void main(String[] args){

        int characters = 0;
        int words = 0;
        int lines = 0;

        try{

            Scanner scan_file = new Scanner(new File("FILE_LOCATION_GOES_HERE"));

            while(scan_file.hasNext()){
                String token = scan_file.next();
                words++;
                characters += token.length();
            }

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{

            Scanner scan_lines = new Scanner(new File("FILE_LOCATION_GOES_HERE"));
            while(scan_lines.hasNextLine()){
                String token = scan_lines.nextLine();
                lines++;
        }}catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println(lines + " lines");
        System.out.println(words + " words");
        System.out.println(characters + " characters");





            }
}
