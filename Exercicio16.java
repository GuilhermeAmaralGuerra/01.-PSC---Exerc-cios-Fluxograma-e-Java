import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float KM;
        System.out.println("Digite aqui a distância total percorrida pelo seu automóvel em KM: ");
        KM = input.nextFloat();

        float quantidade;
        System.out.println("Digite aqui a quantida total de gasolina gasta pelo seu automóvel: ");
        quantidade = input.nextFloat();

        float consMedio;
        consMedio = KM / quantidade;

        System.out.println("O consumo médio de combústivel é de: " + consMedio + " KM por litro");
        
        input.close();
    }
}
