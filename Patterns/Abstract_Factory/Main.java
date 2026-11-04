package Abstract_Factory;

public class Main {
    public static void renderizar(Fabrica fabrica) {
        Botao botao = fabrica.criarBotao();
        Input input = fabrica.criarInput();

        botao.renderizarBotao();
        input.renderizarInput();
    }

    public static void main(String[] args) {
        renderizar(new FabricaAndroid());
        renderizar(new FabricaIOS());
    }
}
