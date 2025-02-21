import java.util.Scanner;

public class Ex5{
    public static int min(int a, int b) {
        if (a < b) return a;
        else return b;
    }

    public static int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = scanner.nextInt();

        System.out.println("Mínimo: " + min(num1, num2));
        System.out.println("Máximo: " + max(num1, num2));
    }
}