import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;
        System.out.println("Digite sua idade em anos aqui: ");
        idade = input.nextInt();

        int meses;
        System.out.println("Digite aqui quantos meses se passaram desde o seu último aniversário: ");
        meses = input.nextInt();

        int diasAnos;
        diasAnos = 365;

        int diasMeses;
        diasMeses = 30;

        System.out.println("Sua idade em dias é: " + (idade * diasAnos + meses * diasMeses));
        
        input.close();
    }
}
