import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class celiechisla {
   public static void main(String[] args) throws IOException {
       System.out.println("Please input two integers:");
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String num1 = reader.readLine();
       String num2 = reader.readLine();

       try{
           if (num1.toLowerCase().contains(".") || num2.toLowerCase().contains(".")){
               System.out.println("ERROR: Wrong number format.");
           }else{
               int anum1 = Integer.parseInt(num1);
               int anum2 = Integer.parseInt(num2);
               int a = anum1 + anum2;
               System.out.println("Sum of numbers is: " + a);
               }
           }catch(NumberFormatException e){}
   }

}
