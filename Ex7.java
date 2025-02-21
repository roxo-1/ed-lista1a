//Carolina Lee
//10440304
import java.util.Scanner;

public class Ex7{
    public static String contarVogais(String str){
        int numeroDeCaracteres = str.length();
        int qtdvogais=0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < numeroDeCaracteres; i++){
            char c = Character.toUpperCase(charArray[i]);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
              qtdvogais ++;
            }
            
        }
        return "O número de vogais nesta frase: " + qtdvogais;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite uma frase: ");
        String str = scanner.nextLine();
        System.out.println(contarVogais(str));
        scanner.close();
    }
}