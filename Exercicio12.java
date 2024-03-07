import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        System.out.println("Digite o número aqui: ");
        numero = input.nextInt();

        int sucessorNumero;
        sucessorNumero = numero + 1;

        int antecessorNumero;
        antecessorNumero = numero - 1;

        System.out.println("O sucessor do seu número e: "+ sucessorNumero + "\n" + "O seu antecessor é: " + antecessorNumero);
        
        input.close();
    }
}
