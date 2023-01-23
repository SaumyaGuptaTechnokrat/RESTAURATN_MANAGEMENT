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
public class Coinsgetter {
    public static void main(String[] args){
        int firsttims=0,firstrem=0, secondtims=0, secondrem = 0 ,thirdt = 0, thirdr = 0, fourt = 0 , fourr=0, fivet=0, fiver=0;
        Scanner s = new Scanner(System.in);
        int amt = s.nextInt();
        if(amt>=25 && amt%25!=0){
            firsttims = amt/25;
            firstrem = amt%25;
            System.out.println("Total no of coins of 25 are:"+firsttims);
        }
        else if(amt>=25 && amt%25==0){
            firsttims = amt/25;
            firstrem = amt%25;
            System.out.println("Total no of coins of 25 are:"+firsttims);
        }
        else if(firstrem<25 && firstrem>=10 && firstrem%10!=0){
            secondtims=firstrem/10;
            secondrem = firstrem%10;
            System.out.println("Total no of coins of 10 are:"+secondtims);
        }
        else if( firstrem<25 && firstrem>=10 && firstrem%10==0){
            secondtims=firstrem/10;
            secondrem = firstrem%10;
            System.out.println("Total no of coins of 10 are:"+secondtims);
            System.out.println("Total amt left:"+secondrem);
        }
        else if( secondrem<25 && secondrem<10 && secondrem>=5  && secondrem%5!=0){
            thirdt=secondrem/5;
            thirdr = secondrem%5;
            System.out.println("Total no of coins of 5 are:"+thirdt);
            System.out.println("Total amt left:"+thirdr);
        }
        else if( secondrem<25 && secondrem<10 && secondrem>=5  && secondrem%5==0){
            thirdt=secondrem/5;
            thirdr = secondrem%5;
            System.out.println("Total no of coins of 5 are:"+thirdt);
            System.out.println("Total amt left:"+thirdr);
        }
        else if( thirdr<25 && thirdr<10 && thirdr<5 && thirdr>=2 && thirdr%2!=0){
            fourt=thirdr/2;
            fourr = thirdr%2;
            System.out.println("Total no of coins of 2 are:"+fourt);
            System.out.println("Total amt left:"+fourr);
        }
        else if( thirdr<25 && thirdr<10 && thirdr<5 && thirdr>=2 && thirdr%2==0){
            fourt=thirdr/2;
            fourr = thirdr%2;
            System.out.println("Total no of coins of 1 are:"+fourt);
            System.out.println("Total amt left:"+fourr);
        }
        else if( fourr<25 && fourr<10 && fourr<5 && fourr<2 && fourr>=1 && fourr%1!=0){
            fivet=fourr/1;
            fiver = fourr%1;
            System.out.println("Total no of coins of 1 are:"+fivet);
            System.out.println("Total amt left:"+fiver);
        }
        else if( fourr<25 && fourr<10 && fourr<5 && fourr<2 && fourr>=1 && fourr%1==0){
            fivet=fourr/1;
            fiver = fourr%1;
            System.out.println("Total no of coins of 1 are:"+fivet);
            System.out.println("Total amt left:"+fiver);
        }
    }
}
