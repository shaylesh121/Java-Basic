package fileoutputinputstreamexample1;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class FileOutputInputStreamExample1 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout= new FileOutputStream("./hello.txt");
            fout.write(120);
            fout.write(121);
            fout.close();
            
        }catch(IOException e){
            System.out.println("Check File(hello.txt)"+e.getMessage());
        }
        
        try{
            FileInputStream fin= new FileInputStream("./hello.txt");
            int rv= fin.read();
            System.out.println((char)rv);
            rv= fin.read();
            System.out.println((char)rv);
            fin.close();
            
        }catch(IOException e){
            System.out.println("Check File(hello.txt)"+e.getMessage());
        }
    }
    
}
