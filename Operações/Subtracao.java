import java.util.Scanner;
public class Subtracao {

public static void main(String args[]){
Scanner sub = new Scanner(System.in);
int num1,num2;
System.out.println("Valores");
num1=sub.nextInt();
num2=sub.nextInt();
System.out.println("A operação é "+(num1-num2));
sub.close();
}
}
