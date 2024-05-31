package bancoDigital;

import bancoDigital.clientes.Cliente;
import bancoDigital.contas.Conta;
import bancoDigital.contas.ContaCorrente;
import bancoDigital.contas.ContaPoupanca;
import bancoDigital.entidade.Banco;

import java.util.Locale;
import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        int opcao;

        System.out.println("----= BANCO PK ZONE =----");
        System.out.println("Cadastro");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Cpf: ");
        long cpf = sc.nextLong();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        Cliente cliente = new Cliente(nome, cpf, idade);

        Banco operacoes = new Banco();
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        if (cliente.verificarIdade()) {
            do {
                operacoes.exibirOperacoes();
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1: {
                        System.out.print("Depositar na Conta Corrente ou Poupança (c/p): ");
                        char contaDeposito = sc.next().charAt(0);
                        if (contaDeposito == 'c') {
                            System.out.print("Depósito de R$: ");
                            double valor = sc.nextDouble();
                            cc.depositar(valor);
                        } else if (contaDeposito == 'p') {
                            System.out.print("Depósito de R$: ");
                            double valor = sc.nextDouble();
                            poupanca.depositar(valor);
                        }
                        break;
                    }
                    case 2: {
                        System.out.print("Sacar na Conta Corrente ou Poupança (c/p)");
                        char contaSacar = sc.next().charAt(0);
                        if (contaSacar == 'c') {
                            System.out.print("Depósito de R$: ");
                            double valor = sc.nextDouble();
                            cc.sacar(valor);
                        }
                        else if (contaSacar == 'p') {
                            System.out.print("Depósito de R$: ");
                            double valor = sc.nextDouble();
                            poupanca.sacar(valor);
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("No momento só é possível transferir para corrente ou para poupança");
                        System.out.print("Qual conta deseja transferir (c/p): ");
                        char contaTransferir = sc.next().charAt(0);
                        if (contaTransferir == 'c') {
                            System.out.print("Valor: R$");
                            double valor = sc.nextDouble();
                            poupanca.transferir(valor, cc);
                        }
                        else if (contaTransferir == 'p') {
                            System.out.print("Valor: ");
                            double valor = sc.nextDouble();
                            cc.transferir(valor, poupanca);
                        }
                        break;
                    }
                    case 4: {
                        System.out.print("Imprimir extrato da conta corrente ou da poupança (c/p)? ");
                        char contaExtrato = sc.next().charAt(0);
                        if (contaExtrato == 'c') {
                            cc.imprimirExtrato();
                        }
                        else if (contaExtrato == 'p') {
                            poupanca.imprimirExtrato();
                        }
                        break;
                    }
                    case 0 :{
                        System.out.println("Saindo...");
                        break;
                    }
                    default:
                        System.out.println("ERROR! Escolha a opção de 0 a 4");
                        System.out.println("TENTE NOVAMENTE");
                        break;
                }
            }
            while (opcao != 0) ;
        }

        else if (!cliente.verificarIdade()) {
            System.out.println("Idade não permitida");
            System.out.println("Apenas maiores de 18 anos pode ter acesso a uma conta!");
        }

        sc.close();
    }
}
