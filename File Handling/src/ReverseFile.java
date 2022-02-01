import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseFile {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        try(Scanner scan = new Scanner(Paths.get("talha.txt"))){

            while (scan.hasNext()) {
                String content = scan.next();
                strings.add(content);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nBefore reversing file: ");
        for (String current:strings){
            System.out.printf("%s ",current);
        }

        Collections.reverse(strings);

        try(PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter("talha.txt")))){

            for(String content:strings){
                write.printf("%s ",content);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n\nAfter reversing file: ");
        for (String current:strings){
            System.out.printf("%s ",current);
        }

    }

}




