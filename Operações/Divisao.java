import java.util.Scanner;
public class Divisao {

public static void main(String args[]){
Scanner div = new Scanner(System.in);
int num1,num2;
System.out.println("Valores");
num1=div.nextInt();
num2=div.nextInt();
System.out.println("A operação é "+(num1/num2));
div.close();
}
}
