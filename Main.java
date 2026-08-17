import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner pk = new Scanner(System.in);
        
        System.out.println("Enter file name");
        String fileName = pk.nextLine();

      //  String path = System.getProperty("user.home") + "\\Desktop\\" + fileName;
        Scanner input = new Scanner(new File(fileName));
    }
}