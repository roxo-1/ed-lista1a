//Carolina Lee
//10440304
import java.util.Scanner;

public class Ex6{
    public static  Double mulComAdicao(Double a, int b){
        Double resultado = 0.00;
        for (Double i = 0.00; i < b; i++){
            resultado += a;
            // System.out.println("Calculando:" + resultado);
        }
        return resultado;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite um número: ");
        Double num1 = scanner.nextDouble();
        System.out.print("Digite outro número: ");
        int num2 = scanner.nextInt();

        System.out.println("O resultado da multicação desses dois números é: " + mulComAdicao(num1, num2));
        scanner.close();
    }
}