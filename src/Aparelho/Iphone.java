package Aparelho;

import Funções.AparelhoTelefonico;
import Funções.Navegador;
import Funções.ReprodutorMusical;

public class Iphone implements Navegador, AparelhoTelefonico, ReprodutorMusical {
    @Override
    public String ligar() {
        return "Ligando para o contato";
    }

    @Override
    public String atender() {
        return "Atendendo chamada";
    }

    @Override
    public String iniciarCorreioVoz() {
        return "Gravando correiro de voz";
    }

    @Override
    public String desligar() {
        return "Desligando chamada";
    }

    @Override
    public String exibirPagina() {
        return "Exibindo uma pagina na web";
    }

    @Override
    public String adicionarNovaAba() {
        return "Abrindo nova pagina";
    }

    @Override
    public String pesquisarPagina(String pagina) {
        return "Pesquisando pagina" + pagina;
    }

    @Override
    public String atualizarPagina() {
        return "Atualizando pagina";
    }

    @Override
    public String fecharUmaAba() {
        return "Fechando pagina";
    }

    @Override
    public String fecharNavegador() {
        return "Fechando navegador";
    }

    @Override
    public String tocarMusica(String musica) {
        return "Tocando agora " + musica;
    }

    @Override
    public String pausarMusica() {
        return "Musica pausada";
    }

    @Override
    public String selecionarMusica(String musica) {
        return "Musica " + musica + " selecionada";
    }

    @Override
    public String fecharReprodutor() {
        return "Fechando reprodutor musical";
    }
}
