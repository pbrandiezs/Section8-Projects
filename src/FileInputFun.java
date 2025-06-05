import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;
        int sum = 0;

        try {
            infile = new Scanner(new File("input.txt"));
            int input;

            while(infile.hasNext()) {
                input = infile.nextInt();
                System.out.println(input);
                sum += input;
            }
            infile.close();
            System.out.println("The sum is " + sum);
        }
        catch(FileNotFoundException ex){
            System.out.println("Can't find file!");
            System.out.println(ex.getMessage());
        }
        catch(InputMismatchException ex) {
            System.out.println("Error reading input!");
        }
    }
}
