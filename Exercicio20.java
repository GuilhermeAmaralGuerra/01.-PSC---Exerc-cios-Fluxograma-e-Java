import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double IPI;
        System.out.println("Digite a porcentagem do IPI: ");
        IPI = input.nextDouble();

        double IPIporcentagem;
        IPIporcentagem = IPI / 100;

        int codigo1;
        System.out.println("Digite o código da peça 1: ");
        codigo1 = input.nextInt();
        float preco1;
        System.out.println("Digite o valor unitário da peça 1: ");
        preco1 = input.nextFloat();
        int quantidade1;
        System.out.println("Digite a quantidade de peça 1: ");
        quantidade1 = input.nextInt();

        int codigo2;
        System.out.println("Digite o código da peça 2: ");
        codigo2 = input.nextInt();
        float preco2;
        System.out.println("Digite o valor unitário da peça 2: ");
        preco2 = input.nextFloat();
        int quantidade2;
        System.out.println("Digite a quantidade de peça 2: ");
        quantidade2 = input.nextInt();

        double ValorTotal;
        ValorTotal = ((preco1 * quantidade1) + (preco2 * quantidade2));

        double ValorTotalIPI;
        ValorTotalIPI = ValorTotal + (ValorTotal * IPIporcentagem);

        System.out.println("O valor total a ser pago é: " + ValorTotalIPI);

        input.close();
    }
}
