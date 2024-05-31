package bancoDigital.contas;

import bancoDigital.clientes.Cliente;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Corrente ***");
        super.imprimirInfosComuns();
    }

    @Override
    public void fazerConta(int idade, int cpf) {

    }

}
