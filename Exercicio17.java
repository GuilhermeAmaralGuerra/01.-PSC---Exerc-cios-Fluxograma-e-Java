import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int canetas;
        System.out.println("Digite o número de canetas que você comprou: ");
        canetas = input.nextInt();

        float preco;
        System.out.println("Digite o preço que você pagou: ");
        preco = input.nextFloat();

        float troco;
        System.out.println("Digite o troco que você recebeu: ");
        troco = input.nextFloat();

        float precoCaneta;
        precoCaneta = (preco - troco)/ canetas;

        System.out.println("O preço de cada caneta é:" + precoCaneta + "\n" + "O troco da sua compra foi: " + troco);
        input.close();
    }
}
