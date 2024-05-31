package bancoDigital.clientes;

public class Cliente {
    private String nome;
    private long cpf;
    private int idade;


    public Cliente(String nome, long cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean verificarIdade() {
        boolean idadePermitida;
        if (idade >= 18)
            return idadePermitida = true;
        else {
            return idadePermitida = false;
        }
    }
}
