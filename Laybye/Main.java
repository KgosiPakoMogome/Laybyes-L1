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

        while (input.hasNextLine()){

          String line = input.nextLine();
          String[] parts = line.split(";");
          
          int customerId = Integer.parseInt(parts[1]);
          double totalLaybye = Double.parseDouble(parts[2]);
          double amountPaid = Double.parseDouble(parts[3]);
          Layby lcv = new Layby(parts[0],customerId,totalLaybye,amountPaid);
        }
    }
}