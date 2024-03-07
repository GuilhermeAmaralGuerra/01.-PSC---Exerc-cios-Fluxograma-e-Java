import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String A;
        System.out.println("Digite o valor A:");
        A = input.nextLine();

        String B;
        System.out.println("Digite o valor B: ");
        B = input.nextLine();

        String AviraB;
        AviraB = B;

        String BviraA;
        BviraA = A;

        System.out.println("O valor trocado de A é: " + AviraB + "\n" + "O valor trocado de B é: " + BviraA);
        
        input.close();
    }
}
