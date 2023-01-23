/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Area_Perimeter {
    public static void main(String args[]){
        Scanner radius = new Scanner(System.in);
        float radii = radius.nextFloat();
        Scanner no = new Scanner(System.in); 
        System.out.println("Area of circle"+"="+(3.14*radii*radii));
        System.out.println("Perimeter of circle"+"="+(2*3.14*radii));
        int size=3;
        int []n = new int[3];
        for(int i =0;i<size;i++){
            n[i]=no.nextInt();
           
        }
        System.out.print("{");
        for(int i =0;i<size;i++){
            System.out.print(n[i]);
            if(i!=size-1){
                System.out.print(","); 
            }
        }
        System.out.print("}");
    }
}
