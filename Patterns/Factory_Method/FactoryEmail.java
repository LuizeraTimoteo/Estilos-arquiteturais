package Factory_Method;

public class FactoryEmail extends FactoryNotificacoes {
    @Override
    public IntNotificacoes criarNotificacao() {
        return new EnvioEmail();
    }
}
