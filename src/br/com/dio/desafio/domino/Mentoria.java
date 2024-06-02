package br.com.dio.desafio.domino;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public String toString() {
        return "Mentoria {" +
                "Título:" + getTitulo() +
                ", descricao: " + getDescricao() +
                ", data: " + data +
                "}";
    }
}
