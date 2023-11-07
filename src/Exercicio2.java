import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //quilometragem inicial, quilometragem no posto, quantidade de litros
        double kmInicial, kmFinal, qtdlitros, consumo;
        System.out.println("Informe quantos quilômetros o marcador indica no início da viagem: ");
        kmInicial = leitor.nextDouble();
        System.out.println("Informe quantos quilômetros o marcador indicava na chegada ao posto: ");
        kmFinal = leitor.nextDouble();
        System.out.println("Informe quantos litros de combustível foram reabastecidos: ");
        qtdlitros = leitor.nextDouble();
        consumo = (kmFinal - kmInicial) / qtdlitros; //PD
        System.out.println("O consumo do veículo foi " + consumo + " k/l"); //SD


    }
}
