package Factory_Method;

public class FactorySMS extends FactoryNotificacoes {
    @Override
    public IntNotificacoes criarNotificacao() {
        return new EnvioSMS();
    }
}
