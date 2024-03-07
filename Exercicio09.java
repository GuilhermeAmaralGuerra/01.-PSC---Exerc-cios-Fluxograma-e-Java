import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float raio;
        System.out.println("Digite a medida do raio em metros5: ");
        raio = input.nextFloat();

        float calculo;
        float pi = (float) Math.PI;
        calculo = (raio * raio) * pi;

        System.out.println("A área do círculo é: " + calculo);
        
        input.close();
    }
}
