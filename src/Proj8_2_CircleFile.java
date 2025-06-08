import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();

        fillArrayList(circles);
        printCircles(circles);
    }

    private static void fillArrayList(ArrayList<Circle> circles) {
        Scanner inFile;
        double radius;
        try {
            inFile = new Scanner(new File("circle_data.txt"));

            while (inFile.hasNext()) {
                radius = inFile.nextDouble();

                Circle c1 = new Circle(radius);
                circles.add(c1);
            }
            inFile.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void printCircles(ArrayList<Circle> circles) {
        try {
            PrintWriter pw = new PrintWriter("circles_output.txt");


            System.out.println();
            pw.println();

            for (Circle c1 : circles) {
                System.out.println("Radius: " + c1.getRadius() + "\tArea: " + c1.area() + "\tCircumference: " + c1.circumference());
                pw.println("Radius: " + c1.getRadius() + "\tArea: " + c1.area() + "\tCircumference: " + c1.circumference());

            }
            pw.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Couldn't write to the file!");
        }
    }
}
