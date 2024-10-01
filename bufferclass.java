import java.io.*;
// import java.io.BufferedInputStream;
// import java.io.FileInputStream;
// //import java.io.InputStream;
public class bufferclass {
  public static void main(String[] args) throws Exception
  {
    
    FileInputStream fis = new FileInputStream("N:/notes.txt");
    BufferedInputStream bis = new BufferedInputStream(fis);

    
    int x;
    while((x=bis.read()) !=-1)
    {
      System.out.print((char)x);
    }
    bis.close();
  }  
}