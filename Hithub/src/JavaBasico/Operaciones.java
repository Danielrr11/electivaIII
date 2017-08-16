/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;

import java.util.Scanner;
/**
 *
 * @author ESTUDIANTE
 */
public class Operaciones {
    
    
public static void main(String[] args) {
        // TODO code application logic here
    
    int vInt;
    float vFloat;
    String vString;
    boolean b1,b2;
    
    Scanner vScan = new Scanner(System.in);
    
  
        vInt = 5+2;
        System.out.println("vInt= 5 + 2: "+ vInt);
        vInt = 5-2;
        System.out.println("vInt= 5 - 2: "+ vInt);
        vInt = 5*2;
        System.out.println("vInt= 5 * 2: "+ vInt);
        vInt = 5%2;
        System.out.println("vInt= 5 % 2: "+ vInt);
        vInt = (int) Math.pow (5, 2);
        System.out.println("vInt= 5 ^ 2: "+ vInt);
        
        vFloat = 5+2;
        System.out.println("vInt= 5 + 2: "+ vFloat);
        vFloat = 5-2;
        System.out.println("vInt= 5 - 2: "+ vFloat);
        vFloat = 5*2;
        System.out.println("vInt= 5 * 2: "+ vFloat);
        vFloat = 5%2;
        System.out.println("vInt= 5 % 2: "+ vFloat);
        vFloat = (int) Math.pow (5, 2);
        System.out.println("vInt= 5 ^ 2: "+ vFloat);
        
        vString = "Daniel";
        vString = vString + " Ramirez";
        System.out.println("Cadena: " + vString);
        
        b1 = true;
        b2 = false;
        
        System.out.println("b1 and b2 : " + (b1 && b2 ));
        System.out.println("b1 or b2 : " + (b1 || b2 ));
        System.out.println("not b1  : " + (!b1 ));
        System.out.println("not b2 : " + (!b2 ));
        
        //System.out.println("Introduzca ElTexto:" + vScan.nextLine());
        //System.out.println(vScan.nextLine());
        
        
        int i;
        
        
        i=5;
        i= ++i +2;
       System.out.println(i); 
       
       i=5;
        i= i++ +2;
       System.out.println(i); 
       
       int a = 33;
int b;
System.out.println(a);
b = a << 2;
System.out.println(b);
b = a >> b;
System.out.println(b);
b = a & 2;
System.out.println(b);
   
for (i=0; i<5; i++) {
            if (i==3)
            continue;
            System.out.println(i);
 //for (i=0; i<5; i++) {
            //System.out.println(i);
            //break;            
            
        }
        System.out.println(i);
        
        i=2;
        while(i<10){
            System.out.println(i);
            i+=2;
        }
        
        
    }       
}
