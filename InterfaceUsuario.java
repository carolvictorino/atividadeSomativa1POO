package financiamento.util;
import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner;

    public InterfaceUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public double pedirValorImovel() {
        double valorImovel;
        do {
            System.out.print("Digite o valor do imóvel (positivo): ");
            valorImovel = scanner.nextDouble();
            if (valorImovel <= 0) {
                System.out.println("Valor inválido. Por favor, digite um valor positivo.");
            }
        } while (valorImovel <= 0);
        return valorImovel;
    }

    public int pedirPrazoFinanciamento() {
        int prazoFinanciamento;
        do {
            System.out.print("Digite o prazo do financiamento em anos (positivo): ");
            prazoFinanciamento = scanner.nextInt();
            if (prazoFinanciamento <= 0) {
                System.out.println("Prazo inválido. Por favor, digite um valor positivo.");
            }
        } while (prazoFinanciamento <= 0);
        return prazoFinanciamento;
    }

    public double pedirTaxaJuros() {
        double taxaJuros;
        do {
            System.out.print("Digite a taxa de juros anual (positiva): ");
            taxaJuros = scanner.nextDouble();
            if (taxaJuros <= 0) {
                System.out.println("Taxa de juros inválida. Por favor, digite um valor positivo.");
            }
        } while (taxaJuros <= 0);
        return taxaJuros;
    }
}

