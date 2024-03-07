import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float A;
        System.out.println("Digite o valor do termo A: ");
        A = input.nextFloat();

        float B;
        System.out.println("Digite o valor do termo B: ");
        B = input.nextFloat();

        float C;
        System.out.println("Digite o valor do termo C: ");
        C = input.nextFloat();

        double delta;
        delta = Math.sqrt((B * B) - (4 * A * C));

        double raiz1;
        raiz1 = (-B + delta) / (2 * A);
        double raiz2;
        raiz2 = (-B - delta) / (2 * A);
        System.out.println("As raizez são:" + "\n" + "A raiz x1 é: " + raiz1 + "\n" + "A raiz x2 é: " + raiz2);
        input.close();
    }
}
