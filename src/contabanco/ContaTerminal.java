package contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("SEJA BEM VINDO AO BANCO DIO");
        System.out.println("Por favor, me informe seu nome: ");
        String name = sc.nextLine();
        System.out.println("Informe o número da conta: (1234)");
        int account = sc.nextInt();
        System.out.println("Me diga o número de sua agencia: (123-4) ");
        String agency = sc.next();
        System.out.println("Informe seu saldo inicial: ");
        double balance = sc.nextDouble();

        System.out.print("Olá " + name + ", obrigado por criar uma conta em nosso banco,");
        System.out.println(" sua agência é " + agency + ", conta " + account + " e seu saldo R$" + balance + " e está disponível para saque");
        sc.close();

    }
}