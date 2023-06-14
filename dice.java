import java.util.Scanner;
import java.util.Random;
class dice{
    public static void main(String[] args){
    System.out.println("Rolling the dice...");
    Random r = new Random();
    int num1 = r.nextInt(6)+1;
    int num2 = r.nextInt(6)+1;
    System.out.println("Die 1: "+num1);
    System.out.println("Die 2: "+num2);
    System.out.print("you"+" ");
    if(num1+num2>7){System.out.println("won!");}
    else{ System.out.println("lost!");}
    }
}
