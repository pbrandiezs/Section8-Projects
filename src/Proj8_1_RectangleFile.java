import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {

        ArrayList<Rectangle> rectangles = new ArrayList<>();

        fillArrayList(rectangles);
        printRectangles(rectangles);
    }

    public static void fillArrayList(ArrayList<Rectangle> rectangles){
        Scanner inFile;
        double length;
        double width;
        try {
            inFile = new Scanner(new File("rectangle_data.txt"));

            while(inFile.hasNext()){
                length = inFile.nextDouble();
                width = inFile.nextDouble();

                Rectangle r1 = new Rectangle(length,width);
                rectangles.add(r1);
            }
            inFile.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void printRectangles(ArrayList<Rectangle> rectangles){
        System.out.println();
        for (Rectangle r1 : rectangles){
            System.out.println("Length: " + r1.getLength() + "\tWidth: " + r1.getWidth() + "\tArea: " + r1.area() +
                    "\tPerimeter: " + r1.perimeter());
        }
    }
}
