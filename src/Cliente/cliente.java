package Cliente;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
public class cliente implements Serializable {
    public static void main(String[] args) {
        try{
int n1,n2;
Socket sc1=new Socket("localhost",5051);
OutputStream os = sc1.getOutputStream();
ObjectOutput oo = new ObjectOutputStream(os);
ArrayList <numeros> nums = new ArrayList <numeros> ();
numeros numes = new numeros();
numes.recibe(1,2); 
nums.add(numes);
System.out.println("le envio los numeros 1 y 2");
oo.writeObject(nums);
os.close();
oo.close();
sc1.close();
}
catch(IOException e){
    System.out.println("Error: no se encontro el servidor");
    }
    }
}