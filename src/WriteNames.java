import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("alpha");
        nameList.add("bravo");
        nameList.add("charlie");
        nameList.add("delta");
        nameList.add("echo");

        try {
            PrintWriter pw = new PrintWriter("names.txt");

            for (String name : nameList) {
                pw.println(name);
            }
            pw.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Couldn't write to the file!");
        }
    }
}
