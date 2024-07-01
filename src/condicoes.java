import Servico.GerenciadorDeEmpregados;
import Usuario.PainelUsuario;

public class condicao{
    public static void main(String[] args) {
        GerenciadorDeEmpregados gerenciador = new GerenciadorDeEmpregados();
        PainelUsuario Usuario = new PainelUsuario(gerenciador);
        Usuario.iniciar();
    }
}
