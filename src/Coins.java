
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Coins {
    public static void main(String[] args){
        int firsttims=0,firstrem=0, secondtims=0, secondrem = 0 ,thirdt = 0, thirdr = 0, fourt = 0 , fourr=0, fivet=0, fiver=0;
        Scanner s = new Scanner(System.in);
        int amt = s.nextInt();
        int m = amt/25;
        int m1= amt%25;
        int n = m1/10;
        int n1=m1%10;
        int p = n1/5;
        int p1 = n1%5;
        int q = p1/2;
        int q1 = p1%2;
        int r = q1/1;
        int r1 = q1%1;
        System.out.println("No. of 25 coins are:"+m + "" +"no of 10 coins are:"+n+"no of 5 coins are:" + p + "no of  coins 2 are: "+q+"no of 1 coins are:"+r);
    }
}
