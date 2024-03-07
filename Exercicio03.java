import java.util.Scanner;

public class Exercicio03{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        String nome;
        System.out.println("Informe seu primeiro nome:");
        nome = input.nextLine();

        System.out.println("Bom dia " + nome + "!");
        
        input.close();
    }
}
