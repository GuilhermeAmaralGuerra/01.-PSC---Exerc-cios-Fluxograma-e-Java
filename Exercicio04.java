import java.util.Scanner;

public class Exercicio04{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        String nome;
        System.out.println("Informe seu nome:");
        nome = input.nextLine();

        String endereco;
        System.out.println("Informe seu endereço: ");
        endereco = input.nextLine();

        int numero;
        System.out.println("Informe seu número de celular: ");
        numero = input.nextInt();

        System.out.println("Seu nome é:" + nome + "\n" + "Seu endereço é: " + endereco + "\n" + "Seu número é: " + numero);
        
        input.close();
    }
}