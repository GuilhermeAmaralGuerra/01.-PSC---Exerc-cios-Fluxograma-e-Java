import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float fahrenheit;
        System.out.println("Digite a temperatura em Farenheit: ");
        fahrenheit = input.nextFloat();

        Float celcius;
        celcius = ((fahrenheit - 32) / 9) * 5;

        System.out.println("O valor em celcius é: " + celcius);
        
        input.close();
    }
}
