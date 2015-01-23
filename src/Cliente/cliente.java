package Cliente;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import Numeros.numeros;

public class cliente implements Serializable {
    public static void main(String[] args) {
            int n1,n2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa numero 1");
            n1 = sc.nextInt();
            System.out.println("Ingresa numero 2");
            n2 = sc.nextInt();
            ArrayList <numeros> nums = new ArrayList();
            numeros numes = new numeros();
            numes.recibe(n1, n2); 
            nums.add(numes);
            System.out.println("Envio (" + n1 +") y (" + n2 + ")");
            
        try{
            Socket sc1 = new Socket("localhost",5051);
            OutputStream os = sc1.getOutputStream();
            ObjectOutput oo = new ObjectOutputStream(os);
            oo.writeObject((Object)nums);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}