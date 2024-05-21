package iphone.apps;

public class ServicosIphone implements Ipod, Navegador, Telefone{

    // operacoes que podem ser feita dentro do telefone
    public void comandosTelefonico() {
        System.out.println("VOCÊ ABRIU O APARELHO TELEFÔNICO, O QUE DESEJA FAZER? ");
        System.out.println("OPÇÃO 1: LIGAR ");
        System.out.println("OPÇÃO 2: ATENDER");
        System.out.println("OPÇÃO 3: INICIAR CORREIO DE VOZ");
        System.out.println("OPÇÃO 4: VOLTAR AO INICIO");
    }
    public void ligar() {
        System.out.println("LIGANDO...");
    }

    public void atender() {
        System.out.println("ATENDENDO...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    // operacoes que podem ser feita dentro do ipod
    public void comandosIpod() {
        System.out.println("VOCÊ ABRIU O IPAD, O QUE DESEJA FAZER? ");
        System.out.println("OPÇÃO 1: TOCAR MÚSICA");
        System.out.println("OPÇÃO 2: PAUSAR MÚSICA");
        System.out.println("OPÇÃO 3: SELECIONAR MÚSICA");
        System.out.println("OPÇÃO 4: VOLTAR AO INICIO");
    }
    public void tocar() {
        System.out.println("TOCANDO MÚSICA...");
    }
    public void pausar() {
        System.out.println("MÚSICA PAUSADA.");
    }
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA...");
    }

    // operacoes que podem ser feita dentro do navegador
    public void comandosNavgador() {
        System.out.println("VOCÊ ABRIU O NAVEGADOR, O QUE DESEJA FAZER? ");
        System.out.println("OPÇÃO 1: EXIBIR PÁGINA ");
        System.out.println("OPÇÃO 2: ATUALIZAR ABA");
        System.out.println("OPÇÃO 3: ADICIONAR NOVA ABA");
        System.out.println("OPÇÃO 4: VOLTAR AO INICIO");
    }
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA.");
    }

    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO UMA NOVA ABA.");
    }

    public void atualizarAba() {
        System.out.println("ATUALIZANDO PÁGINA...");
    }
}
