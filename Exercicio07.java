import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salario;
        System.out.println("Qual o seu salário?");
        salario = input.nextFloat();

        float reajusteCalculo;
        reajusteCalculo = salario / 100;

        System.out.println("O reajuste do seu salario é: " + (salario + reajusteCalculo * 7));
        
        input.close();
    }
}
