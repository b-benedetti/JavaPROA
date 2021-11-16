import java.util.Scanner;
public class Subtracao {

public static void main(String args[]){
Scanner ad = new Scanner(System.in);
int num1,num2;
System.out.println("Valores");
num1=ad.nextInt();
num2=ad.nextInt();
System.out.println("A operação é "+(num1-num2));
ad.close();
}
}
