package iphone;

import iphone.apps.ServicosIphone;
import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServicosIphone si = new ServicosIphone();
        int opcao, comandos;

        do {
            System.out.println("ESCOLHA QUAL APP QUE DESEJA ACESSAR: ");
            System.out.println("OPÇÃO 1: APARELHO TELEFÔNICO ");
            System.out.println("OPÇÃO 2: REPRODUTOR MUSICAL ");
            System.out.println("OPÇÃO 3: NAVEGADOR INTERNET");
            System.out.println("OPÇÃO 0: DESLIGAR");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 :{
                    si.comandosTelefonico();
                    comandos = sc.nextInt();
                    if (comandos == 1) {
                        si.ligar();
                    }
                    else if (comandos == 2) {
                        si.atender();
                    }
                    else if (comandos == 3) {
                        si.iniciarCorreioVoz();
                    }
                    else if (comandos == 4)
                        comandos = 4;
                    else
                        System.out.println("OPÇÃO INVALIDA. TENTE NOVAMENTE");
                    break;
                }
                case 2 :{
                    si.comandosMusica();
                    comandos = sc.nextInt();
                    if (comandos == 1) {
                        si.tocar();
                    }
                    else if (comandos == 2) {
                        si.pausar();
                    }
                    else if (comandos == 3) {
                        si.selecionarMusica();
                    }
                    else if (comandos == 4)
                        comandos = 4;
                    else
                        System.out.println("OPÇÃO INVALIDA. TENTE NOVAMENTE");
                    break;
                }
                case 3 :{
                    si.comandosNavgador();
                    comandos = sc.nextInt();
                    if (comandos == 1) {
                        si.exibirPagina();
                    }
                    else if (comandos == 2) {
                        si.atualizarAba();
                    }
                    else if (comandos == 3) {
                        si.adicionarNovaAba();
                    }
                    else if (comandos == 4)
                        comandos = 4;
                    else
                        System.out.println("OPÇÃO INVALIDA. TENTE NOVAMENTE");
                    break;
                }
                case 0 :{
                    System.out.println("DESLIGANDO...");
                    break;
                }
                default:
                    System.out.println("ERROR! ESCOLHA A OPÇÃO DE 1 A 3");
                    System.out.println("TENTE NOVAMENTE");
                    break;
            }
        }
        while (opcao != 0);
        sc.close();
    }
}
