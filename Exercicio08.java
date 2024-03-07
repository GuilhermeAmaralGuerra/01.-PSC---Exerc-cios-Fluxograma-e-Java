import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float metros;
        System.out.println("Digite os metros aqui: ");
        metros = input.nextFloat();

        double centimetros;
        centimetros = metros * 100;

        System.out.println("Os centimetros são: " + centimetros);
        
        input.close();
    }
}
