/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterode5digitos;

import java.util.Scanner;
/**
 *
 * @author ESTUDIANTE
 */
public class Enterode5digitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner lector = new Scanner (System.in);
    
    int arreglo [] = new int [10];
    int limite,i,j,aux;
    
    System.out.println("Ingresa el limite ");
    limite=lector.nextInt();
    
    for (i=0;i<limite;i++){
        System.out.print("x["+(i+1)+"]= ");
        arreglo[i]=lector.nextInt();   
    }
    for (i=0;i<limite;i++){
        for (j=i+1;j<limite;j++){
            if(arreglo[i]<arreglo[j]){
                aux=arreglo[i];
                arreglo[j]=arreglo[i];
                arreglo[j]=aux;
            }
        }
    }
    System.out.print("Arreglo= [");
    for (i=0;i<limite;i++){
        System.out.println(arreglo[i]+", ");
    }
    System.out.print("]");
}
    