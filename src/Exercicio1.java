import java.util.Scanner;

public class Exercicio1 {
    //Constante
    static final double COTACAO = 4.87;

    public static void main(String[] args) {
        /*ONG recebe doações em dólares e precisa converter o valor para reais.
        * Criar um programa que permita ao usuário digitar o valor da doação (ED - Entrada de dados)
        * converter esse valor (PD - Processamento de dados) e exibir o valor em reais (SD - Saída de dados).
        *
        * Variável => Um espaço na memória RAM para guardar uma informação.
        * */

        Scanner leitor = new Scanner(System.in);
        double valorDolar, valorReais;
        System.out.print("Informe o valor da sua doação: US$ ");
        valorDolar = leitor.nextDouble(); //Entrada
        valorReais = valorDolar * COTACAO; //Processamento
        //System.out.println("Sua doação em reais foi R$ " + valorReais); //Saída
        System.out.println("Sua doação em reais foi R$ " + String.format("%.2f",valorReais)); //Saída do valor formatado com duas casas decimais

    }
}
