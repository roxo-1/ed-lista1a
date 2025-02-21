import java.util.Scanner;

public class Ex2{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);
        letra = Character.toUpperCase(letra);//.toUppercase(letra);
        if (letra == 'A' | letra == 'E' | letra == 'I' | letra == 'O' | letra == 'U'){
            System.out.println("A letra é uma vogal!");
        } else{
            System.out.println("A letra é uma consoante!");
        }
        scanner.close();
    }
}