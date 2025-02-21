import java.util.Scanner;

public class Ex8{
    public static boolean haColisaoEntreCirculos(double x1, double y1, double r1, double x2, double y2, double r2) {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia <= (r1 + r2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite as coordenadas e o raio do primeiro círculo (x1 y1 r1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();

        System.out.print("Digite as coordenadas e o raio do segundo círculo (x2 y2 r2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double r2 = scanner.nextDouble();

        boolean colisao = haColisaoEntreCirculos(x1, y1, r1, x2, y2, r2);
        
        if (colisao) {
            System.out.println("Os círculos colidem!");
        } else {
            System.out.println("Os círculos não colidem.");
        }
        scanner.close();
    }
}
