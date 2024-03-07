import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float degrauAltura;
        System.out.println("Digite a altura do degrau em metros: ");
        degrauAltura = input.nextFloat();

        float escadaAltura;
        System.out.println("Digite a altura total da escada em metros: ");
        escadaAltura = input.nextFloat();

        float quantidadeDegrau;
        quantidadeDegrau = (int) (escadaAltura / degrauAltura);

        System.out.println("A quantidade de degraus para subir a escada é: " + quantidadeDegrau);

        input.close();
    }
}
