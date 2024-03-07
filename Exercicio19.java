import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int zero;
        System.out.println("Digite seu primeiro número aqui: ");
        zero = input.nextInt();

        int um;
        System.out.println("Digite seu segundo número aqui: ");
        um = input.nextInt();

        int dois;
        System.out.println("Digite seu terceiro número aqui: ");
        dois = input.nextInt();

        int tres;
        System.out.println("Digite seu quarto número aqui: ");
        tres = input.nextInt();

        int quatro;
        System.out.println("Digite seu quinto número aqui: ");
        quatro = input.nextInt();

        int cinco;
        System.out.println("Digite seu sexto número aqui: ");
        cinco = input.nextInt();

        int seis;
        System.out.println("Digite seu sétimo número aqui: ");
        seis = input.nextInt();

        int sete;
        System.out.println("Digite seu oitavo número aqui: ");
        sete = input.nextInt();

        int oito;
        System.out.println("Digite seu nono número aqui: ");
        oito = input.nextInt();

        int nove;
        System.out.println("Digite seu décimo número aqui: ");
        nove = input.nextInt();

        int dez;
        System.out.println("Digite seu décimo primeiro número aqui: ");
        dez = input.nextInt();

        int quadradoZero;
        quadradoZero = zero * zero;

        int quadradoUm;
        quadradoUm = um * um;

        int quadradoDois;
        quadradoDois = dois * dois;

        int quadradoTres;
        quadradoTres = tres * tres;

        int quadradoQuatro;
        quadradoQuatro = quatro * quatro;

        int quadradoCinco;
        quadradoCinco = cinco * cinco;

        int quadradoSeis;
        quadradoSeis = seis * seis;

        int quadradoSete;
        quadradoSete = sete * sete;

        int quadradoOito;
        quadradoOito = oito * oito;

        int quadradoNove;
        quadradoNove = nove * nove;

        int quadradoDez;
        quadradoDez = dez * dez;

        int cuboZero;
        cuboZero = zero * zero * zero;

        int cuboUm;
        cuboUm = um * um;

        int cuboDois;
        cuboDois = dois * dois * dois;

        int cuboTres;
        cuboTres = tres * tres * tres;

        int cuboQuatro;
        cuboQuatro = quatro * quatro * quatro;

        int cuboCinco;
        cuboCinco = cinco * cinco * cinco;

        int cuboSeis;
        cuboSeis = seis * seis * seis;

        int cuboSete;
        cuboSete = sete * sete * sete;

        int cuboOito;
        cuboOito = oito * oito * oito;

        int cuboNove;
        cuboNove =(nove * nove * nove);

        int cuboDez;
        cuboDez = dez * dez * dez;

        System.out.println("A tabela com os números e seus quadrados e cubos: ");
        System.out.println("Número             Quadrados             Cubos");
        System.out.println(zero + "\t\t\t" + quadradoZero + "\t\t" + cuboZero);
        System.out.println(um + "\t\t\t" + quadradoUm + "\t\t" +  cuboUm);
        System.out.println(dois + "\t\t\t" +  quadradoDois + "\t\t" +  cuboDois);
        System.out.println(tres + "\t\t\t" + quadradoTres + "\t\t" + cuboTres);
        System.out.println(quatro + "\t\t\t" + quadradoQuatro + "\t\t" + cuboQuatro);
        System.out.println(cinco + "\t\t\t" + quadradoCinco + "\t\t" + cuboCinco);
        System.out.println(seis + "\t\t\t" + quadradoSeis + "\t\t" + cuboSeis);
        System.out.println(sete + "\t\t\t" + quadradoSete + "\t\t" + cuboSete);
        System.out.println(oito + "\t\t\t" + quadradoOito + "\t\t" + cuboOito);
        System.out.println(nove + "\t\t\t" + quadradoNove + "\t\t" + cuboNove);
        System.out.println(dez + "\t\t\t" + quadradoDez + "\t\t" + cuboDez);

        input.close();
    }
}
