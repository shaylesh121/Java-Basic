package filewriterreaderexample;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class FileWriterReaderExample {
    public static void main(String[] args) {
        File file= new File("./newfile.txt");
        
        try{
            FileWriter fwr= new FileWriter(file);
            String name= "Ram Parsad Ghimire";
            fwr.write(name);
            System.out.println("Sucess...");
            fwr.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        //reading content from newfile.txt
        //charater-oriented streaming 
        
        try{
            FileReader fr= new FileReader(file);
            int ReadVariable=0;
            while((ReadVariable=fr.read())!=-1){
                System.out.print((char)ReadVariable);
            }
            fr.close();
        }catch(IOException e){
            System.out.print(e.getMessage());
    }
    }   
}
