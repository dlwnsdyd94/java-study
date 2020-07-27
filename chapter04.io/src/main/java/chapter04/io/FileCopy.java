
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileCopy {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Reader in = null;
      InputStream is = null;
      try {
         in = new FileReader("1234.txt");
         is = new 
         
         int count = 0;
         int data = -1;
         
         while((data = in.read()) != )
         
         System.out.println("");
         System.out.println("");
         
      } catch (FileNotFoundException e) {
         System.out.print("파일이 없습니다.");
      } finally {
         try {
            if (in != null) {
               in.close();
            }

         } catch (IOException e) {
            e.printStackTrace();
         }
      }

   }
}
