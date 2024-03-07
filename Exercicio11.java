import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float nota1;
        System.out.println("Digite a sua primeira nota: ");
        nota1 = input.nextFloat();

        float nota2;
        System.out.println("Digite a sua segunda nota: ");
        nota2 = input.nextFloat();

        float nota3;
        System.out.println("Digite a sua terceira nota nota: ");
        nota3 = input.nextFloat();

        float media;
        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("O média das suas notas são: " + media);
        
        input.close();
    }
}
