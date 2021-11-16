import java.util.Scanner;
public class Multiplicacao {

public static void main(String args[]){
Scanner mult = new Scanner(System.in);
int num1,num2;
System.out.println("Valores");
num1=mult.nextInt();
num2=mult.nextInt();
System.out.println("A operação é "+(num1*num2));
mult.close();
}
}
