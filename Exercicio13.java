import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horas;
        System.out.println("Digite suas horas de trabalho mensais: ");
        horas = input.nextInt();

        float valorHoras;
        System .out.println("Digite o valor que recebe por cada hora trabalhada: ");
        valorHoras = input.nextFloat();

        float INSS;
        System.out.println("Digite o valor do desconto do INSS: ");
        INSS = input.nextFloat();

        float salarioBruto;
        salarioBruto = horas * valorHoras;

        float salarioLiquido;
        salarioLiquido = salarioBruto - (INSS / 100 * salarioBruto);

        System.out.println("Seu salario liquido é: " + salarioLiquido);
        
        input.close();
        
    }
}
