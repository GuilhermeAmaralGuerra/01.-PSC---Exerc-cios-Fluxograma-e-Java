import java.util.Scanner;

public class Exercicio05{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            float numero1;
            System.out.println("Digite o quanto de dinheiro que você tem em dólar: ");
            numero1 = input.nextFloat();

            float numero2 = 4.95f;

            System.out.println("Seu valor em reais é: " + (numero1 * numero2));
            
            input.close();
        }
}

