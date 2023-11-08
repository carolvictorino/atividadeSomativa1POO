package financiamento.main;
import financiamento.modelo.Financiamento;
import financiamento.util.InterfaceUsuario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //instânciando a classe para lidar com as interações do usuário
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        // pedir ao usuário os dados necessários para criar até 4 financiamentos
        for (int i = 0; i < 4; i++) {
            double valorImovel = interfaceUsuario.pedirValorImovel();
            int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
            double taxaJuros = interfaceUsuario.pedirTaxaJuros();

            Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJuros);
            financiamentos.add(financiamento);
        }

        //variáveis para armazenar os valores totais
        double totalValorImoveis = 0;
        double totalValorFinanciamentos = 0;

        for (Financiamento financiamento : financiamentos) {
            totalValorImoveis += financiamento.getValorImovel();
            totalValorFinanciamentos += financiamento.calcularTotalPagamento();
        }

        //percorre os financiamentos e imprime os valores do imóvel e do financiamento para cada um
        for (int i = 0; i < financiamentos.size(); i++) {
            System.out.println("Financiamento " + (i+1) + " – valor do imóvel: R$ " + financiamentos.get(i).getValorImovel() +
                    ", valor do financiamento: R$ " + financiamentos.get(i).calcularTotalPagamento());
        }

        //imprimir valor total
        System.out.println("\nTotal de todos os imóveis: R$ " + totalValorImoveis);
        System.out.println("Total de todos os financiamentos: R$ " + totalValorFinanciamentos);
    }
}

