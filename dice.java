import java.util.Scanner;
import java.util.Random;
class dice{
    public static void main(String[] args){
<<<<<<< HEAD
    System.out.println("Rolling the dice...");
    Random r = new Random();
    int num1 = r.nextInt(6)+1;
    int num2 = r.nextInt(6)+1;
    System.out.println("Die 1: "+num1);
    System.out.println("Die 2: "+num2);
    System.out.print(a+" ");
    if(num1+num2>7){System.out.println("won!");}
    else{ System.out.println("lost!");}
=======
	System.out.println("What is your name?");
	Scanner sc = new Scanner(System.in);
	String a = sc.next();
	System.out.println("Hello, "+a);
	System.out.println("Rolling the dice...");
	Random r = new Random();
	int num1 = r.nextInt(6)+1;
	int num2 = r.nextInt(6)+1;
	System.out.println("Die 1: "+num1);
	System.out.println("Die 2: "+num2);
>>>>>>> experimental
    }
}
