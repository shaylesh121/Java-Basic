
package userregistration;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Serialization implements Serializable {
    int id;
    String name;
    String address;
    Serialization(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;

    }
}
class UserRegistration{
    public static void main(String[] args){
        String fileName="./student.txt";
        Serialization s=new Serialization(5,"Ram","Ktm");
        try{
            FileOutputStream fout=new FileOutputStream(fileName);
            ObjectOutputStream Oout=new ObjectOutputStream(fout);
            Oout.writeObject(s);
            Oout.close();
            fout.close();
            
            System.out.println("Serialization completed. Serialized object data:");
            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);
            System.out.println("Address: " + s.address);
            
            
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}