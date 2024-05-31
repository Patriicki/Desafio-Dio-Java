package bancoDigital.contas;

import bancoDigital.clientes.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupança ***");
        super.imprimirInfosComuns();
    }

    @Override
    public void fazerConta(int idade, int cpf) {
    }
}
