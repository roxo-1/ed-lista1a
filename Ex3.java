import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; // Array para armazenar os números
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt(); // Armazena a entrada no array
        }

        int max = numeros[0];
        int min = numeros[0];
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        
        }
        System.out.println("O maior número é "+ max);
        System.out.println("O menor número é " + min);
        scanner.close(); // Fecha o Scanner para evitar vazamento de memória
    }
}