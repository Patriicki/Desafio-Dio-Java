package bancoDigital.entidade;

import bancoDigital.contas.Conta;
import java.util.List;

public class Banco {
    private List<Conta> contasNoBanco;
    private String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirOperacoes() {
        System.out.println();
        System.out.println("O que dejesa fazer? ");
        System.out.println("Opção 1: Depositar ");
        System.out.println("Opção 2: Sacar ");
        System.out.println("Opção 3: Transferir ");
        System.out.println("Opção 4: Extrato Bancario ");
        System.out.println("Opção 0: Sair do aplicativo ");
    }

}
