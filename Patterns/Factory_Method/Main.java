package Factory_Method;

public class Main {
    public static void enviarNotificacao(FactoryNotificacoes factory) {
        IntNotificacoes notificacao = factory.criarNotificacao();
        notificacao.enviar();
    }

    public static void main(String[] args) {
        enviarNotificacao(new FactoryEmail());
        enviarNotificacao(new FactorySMS());
    }
}
