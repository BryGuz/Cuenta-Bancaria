/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;
import static java.lang.System.console;
import java.io.*;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Bryan M
 */
public class Informacion {
    java.util.Scanner read = new java.util.Scanner(System.in);
    private Cuenta joselito;;
    
    public Informacion(){
        
        this.joselito = new Cuenta(); 
    }
  
    
        
        int número;
        int clave;
        String dueño;
        double saldo;
        
     
    
    public void consignar(){
        
         System.out.println("ingrese el numero de cuenta: ");
        double n1 = read.nextDouble();
        if(n1 == número){
            System.out.println("ingrese el valor de la consignacion: ");
            double c1 = read.nextDouble();
            saldo = saldo + c1;
            System.out.println("el valor a consignar es " + saldo);
        }else{
            System.out.println("No existe el numero de cuenta");
        }
        
        }
    public void retirar(){
        
        System.out.println("Introduzca su clave");
        Scanner n = new Scanner(System.in);
        int t = n.nextInt();
        
        if(clave==t)
        {
            System.out.println(dueño + " Su saldo es de: " + saldo + " Introduzca el valor a retirar"); 
            Scanner capt = new Scanner(System.in);
            double x = capt.nextInt();
            saldo=saldo-x;
            System.out.println("Su nuevo saldo es de: " + saldo);   
        }
        else
        {
          System.out.println("la clave introducida es incorrecta");  
        }
        
       
       
    }
    
    public void Cclave(){
        
        System.out.println("Introduzca su clave actual para cambiarla");
        Scanner capt = new Scanner(System.in);
        int i = capt.nextInt();
        
        if(clave==i)
        {
            
        System.out.println("Introduzca su nueva clave");
        Scanner cv = new Scanner(System.in);
        int c = cv.nextInt();  
        System.out.println("Su nueva clave es: " + c);
        clave = c;
        }
        else
        {
         System.out.println("la clave introducida es incorrecta");
                 
        }
        
        
        
    }
    
    public void csaldo(){
        
       System.out.println("Introduzca su clave para ver el saldo");  
        Scanner cv = new Scanner(System.in);
        int i = cv.nextInt(); 
        
        if(i==clave)
        {
          System.out.println("Su saldo es de: " + saldo);
            
        }
        else
        {
          System.out.println("la clave introducida es incorrecta");  
        }
        
    }
           
    
}
