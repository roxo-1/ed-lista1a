import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; 
        int[] inversa = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            inversa[i] = numeros[9 - i];
        }

        System.out.println("Números na ordem inversa:");
        for (int i = 0; i < 10; i++) {
            System.out.println(inversa[i]);
        }
        scanner.close();
    }
}