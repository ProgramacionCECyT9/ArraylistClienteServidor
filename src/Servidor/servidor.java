import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class servidor implements Serializable{
    public static void main(String []xf){
Integer numeros;
ArrayList <numeros> nums = new ArrayList <numeros> ();
ServerSocket ss=null;
try{
ss=new ServerSocket(5051);
Socket s1=ss.accept();
InputStream is=s1.getInputStream();
ObjectInput dis=new ObjectInputStream(is);
numeros recibe = new numeros();
nums = (ArrayList <numeros>)dis.readObject();
recibe = nums.get(0);
System.out.println("si pase");
System.out.println("el numero recibido es:"+ recibe.reg1()); 
System.out.println("el numero recibido es:"+ recibe.reg2());
System.out.println("la suma es :"+ recibe.suma());
s1.close();
is.close();
dis.close(); 
}
catch(Exception e){}
}
}