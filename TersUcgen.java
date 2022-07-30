/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tersucgen;

/**
 *
 * @author Samsung
 */
import java.awt.BorderLayout;
import java.util.Scanner;

public class TersUcgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("N Sayisini Giriniz:");
        int n=input.nextInt();
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            
            for(int k=1;k<=((2*n)-(2*i+1));k++){
                System.out.print("*");
            }
            
            System.out.println(" ");
                
        }
    }
    
}
