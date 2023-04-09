import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//salário bruto.
//quanto pagou ao INSS.
//quanto pagou ao sindicato.
//o salário líquido.
//calcule os descontos e o salário líquido, conforme a tabela abaixo:
//+ Salário Bruto : R$
//- IR (11%) : R$
//- INSS (8%) : R$
//- Sindicato ( 5%) : R$
//= Salário Liquido : R$
//Obs.: Salário Bruto - Descontos = Salário Líquido.

        double salariobruto;
        double horastrabalhadas;
        double salariohora;
        double inss;
        double sindicato;
        double salarioliquido;
        double ir;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        salariohora = teclado.nextDouble();

        System.out.println("Quantas horas você trabalha?");
        horastrabalhadas = teclado.nextDouble();

        salariobruto = salariohora * horastrabalhadas;

        inss = (0.8 / 100) * salariobruto;

        sindicato = (0.5 / 100) * salariobruto;

        ir = (11.0 / 100) * salariobruto;

        salarioliquido = salariobruto - inss - sindicato - ir;

        System.out.println("Salário bruto é de: R$" + salariobruto);

        System.out.println("Contribuição ao INSS foi: R$" + inss);

        System.out.println("Contribuição ao sindicato foi: R$" + sindicato);

        System.out.println("Contribuição ao IR foi: R$" + ir);

        System.out.println("Salário liquido: R$" + salarioliquido);

    }

}