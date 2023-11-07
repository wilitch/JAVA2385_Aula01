import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {

        //Comentário de uma linha

        //*Saída => o programa precisar exibir informações para o usuário (eclipse => syso | intelliJ => sout)
        System.out.println("Boa noite!");
        System.out.println("Sejam bem-vindos");

        //camelCase | Snack_case
        //nomeDoAluno (camelCase) | nome_do_aluno (Snack_case)
        //Variável de memória: tipo nomeVariavel;
        int idade;
        byte idadeDoAluno;
        char letra;
        String nome; //String não é um tipo primitivo; ele é uma classe.
/*
        //Entrada de dados => Usuário precisar interagir com o sistema
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = entrada.next();
        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.println(nome + ", sua idade é " + idade + " anos.");
*/
        //entrada.nextDouble();     => leitura de um double
        //entrada.next();           => leitura de um texto
        //Processamento => atribuição / cálculos
        int x = 10;

        //Operadores aritméticos
        /*
        0 - ()
        1 - Divisão / (divisão inteira, divisão com casas decimais)
        1 - Multiplicação *
        1 - Resto da divisão %
        2 - Soma +
        2 - Subtração -
        * */

        int divisao = 5 / 2;
        System.out.println("Resultado = " + divisao);

        double resultado = 5.0 / 2;
        System.out.println("Resultado = " + resultado);

        int resto = 5 % 2;
        System.out.println("Resto da divisão = " + resto);

        x = 20;
        x = x + 3;
        x += 3; //igual a x = x + 3;
        // += -= /=
        // ++ --


        /*Comentário
        de várias linhas
        * */
    }
}
