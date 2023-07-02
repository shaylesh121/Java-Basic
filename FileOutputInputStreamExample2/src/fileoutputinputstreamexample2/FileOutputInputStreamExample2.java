package fileoutputinputstreamexample2;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class FileOutputInputStreamExample2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout= new FileOutputStream("./hello.txt");
            String str="Let's do something;\n";
            byte[] inp= str.getBytes();
            fout.write(inp);
            String str1="No lets go hiking.";
            byte[] inp1= str1.getBytes();
            fout.write(inp1);
            fout.close();
            
        }catch(IOException e){
            System.out.println("Check File(hello.txt)"+e.getMessage());
        }
        
        try{
            FileInputStream fin= new FileInputStream("./hello.txt");
            int rv=0;
            while((rv=fin.read())!=-1){
                System.out.print((char)rv);
            }
            fin.close();
        }catch(IOException e){
            System.out.println("Check File(hello.txt)"+e.getMessage());
        }
    }
    
}
