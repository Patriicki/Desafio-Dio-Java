package br.com.dio.desafio;

import br.com.dio.desafio.domino.*;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Curso javaBasico = new Curso();
        javaBasico.setTitulo("Curso Java");
        javaBasico.setDescricao("Java básico");
        javaBasico.setCargaHoraria(8);

        Curso poo = new Curso();
        poo.setTitulo("Curso Java Orientado a objeto");
        poo.setDescricao("Aprenda os pilares de Programação Orientada a Objeto com Java");
        poo.setCargaHoraria(10);

        Curso bancoDados = new Curso();
        bancoDados.setTitulo("Banco de dados com SQL E NOSQL");
        bancoDados.setDescricao("Trabalhando com banco de dados");
        bancoDados.setCargaHoraria(8);

        Curso spring = new Curso();
        spring.setTitulo("Java com Spring");
        spring.setDescricao("Tranalhando com java e spring");
        spring.setCargaHoraria(15);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Desmistificando a linguagem Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Back end com Java");
        bootcamp.setDescricao("Seja um desenvolvedor back end em java");
        bootcamp.getConteudos().add(javaBasico);
        bootcamp.getConteudos().add(poo);
        bootcamp.getConteudos().add(bancoDados);
        bootcamp.getConteudos().add(spring);
        bootcamp.getConteudos().add(mentoria);


        System.out.println("------------------=            =------------------");
        Dev dev = new Dev();
        System.out.println("Inscrição aberta para o Bootcamp Back End em Java!");
        System.out.print("Deseja se inscrever (s/n)? ");
        char inscricao = sc.next().charAt(0);
        if (inscricao == 's') {
            dev.inscreverBootcamp(bootcamp);
            System.out.print("Nome: ");
            sc.next();
            String nome = sc.nextLine();
            System.out.print("Cpf: ");
            String cpf = sc.next();
            Dev dados = new Dev(nome, cpf);
            System.out.println("Conteudos do Bootcamp " + dev.getConteudoInscrito());
            System.out.println("INSCRIÇÃO REALIZADA COM SUCESSO!!!");
            System.out.println();
            while (!dev.getConteudoInscrito().isEmpty()) {
                System.out.print("Progudiu em um curso (s/n)? ");
                char progressao = sc.next().charAt(0);
                if (progressao == 's') {
                    dev.progredir();
                    System.out.println("XP: " + dev.calcularTotalXp());
                    System.out.println("Conteudos Concluído(s): " + dev.getConteudoConcluido());
                    if (dev.getConteudoInscrito().isEmpty()) {
                        System.out.println("PARABENSS!!! VOCÊ CONCLUIU O BOOTCAMP!");
                    }
                } else {
                    System.out.println("Volte a estudar rapazinho(a)!");
                }
            }
        }
        else {
            System.out.println("Você não está matriculado no bootcamp!");
        }
        sc.close();
    }
}
