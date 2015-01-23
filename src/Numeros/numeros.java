/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numeros;

import java.io.Serializable;

/**
 *
 * @author alan
 */
public class numeros implements Serializable{
    int num1, num2;
    public numeros(){
        num1 = 0;
        num2 = 0;
    }
    public void recibe(int n1, int n2){
        num1 = n1;
        num2 = n2;
    }
    public int reg1(){
        return num1;
    }
    public int reg2(){
        return num2;
    }
    public int suma(){
        return num1 + num2;
    }
}
