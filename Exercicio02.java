import java.util.Scanner;

public class Exercicio02{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            float numero1;
            System.out.println("Digite seu primeiro número: ");
            numero1 = input.nextFloat();

            float numero2;
            System.out.println("Digite seu segundo número: ");
            numero2 = input.nextFloat();

            System.out.println("O resultado foi: " + (numero1 / numero2));
            
            input.close();
        }
}
