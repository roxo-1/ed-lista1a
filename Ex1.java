//Carolina Lee
//10440304
import java.util.Scanner;

public class Ex1{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        // leu o primeiro número
        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();
        // leu o segundo número
        System.out.print("Digite outro número: ");
        int num2 = scanner.nextInt();
        System.out.println("Número 1 antes da troca: " + num1);
        System.out.println("Número 2 antes da troca: " + num2);
        // troca
        int aux = num1;
        num1 = num2;
        num2 = aux;
        System.out.println("Número 1 depois da troca: " + num1);
        System.out.println("Número 2 depois da troca: " + num2);
        scanner.close();
    }
}