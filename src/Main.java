import Aparelho.Iphone;

public class Main {
    public static void main(String[] args) {

        var iphone = new Iphone();

        //aparelho telefonico
        System.out.println(iphone.ligar());

        System.out.println(iphone.desligar());

        System.out.println(iphone.iniciarCorreioVoz());

        System.out.println(iphone.atender());

        //navegador
        System.out.println(iphone.exibirPagina());

        System.out.println(iphone.adicionarNovaAba());

        System.out.println(iphone.pesquisarPagina("Dio.me"));

        System.out.println(iphone.atualizarPagina());

        System.out.println(iphone.fecharUmaAba());

        System.out.println(iphone.fecharNavegador());

        //reprodutor musical
        System.out.println(iphone.tocarMusica("Let Me Love You"));

        System.out.println(iphone.pausarMusica());

        System.out.println(iphone.selecionarMusica("Black Pumas - Colors"));

        System.out.println(iphone.fecharReprodutor());


    }
}