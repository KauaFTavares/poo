package Usuario;

import Modelo.Empregado;
import Servico.GerenciadorDeEmpregados;
import java.util.Scanner;

public class PainelUsuario {
    private GerenciadorDeEmpregados gerenciador;
    private Scanner scanner;

    public void UserInterface(GerenciadorDeEmpregados gerenciador){
        this.gerenciador = gerenciador;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar(){
        while (true) {
            mostrarMenu();
            int opcao = scanner.nextInt();
            scanner.nextInt();

            switch (opcao) {
                case 1:
                try{
                    Empregado empregado = coletarInformacoesDoEmpregado();
                    gerenciador.adicionarEmpregado(empregado);
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                break;
            case 2:
                System.out.print("Digite o ID do empregado: ");
                int id = scanner.nextInt();
                Empregado emp = gerenciador.buscarEmpregadoPorId(id);
                if (emp != null) {
                    System.out.println(emp);
                } else {
                    System.out.println("Empregado não encontrado.");
                }
                break;
            case 3:
                gerenciador.listarEmpregados();
                break;
            case 4:
                System.out.println("Saindo...");
                return;
            default:
                System.out.println("Opção inválida.");//
        }
    }
}
private void mostrarMenu(){
    System.out.println("\n--- Menu ---");
    System.out.println("1. Adicionar Empregado");
    System.out.println("2. Buscar Empregado por ID");
    System.out.println("3. Listar Todos os Empregados");
    System.out.println("4. Sair");
    System.out.print("Escolha uma opção: ");
}
private Empregado coletarInformacoesDoEmpregado() {
    System.out.print("Digite o ID: ");
    int id = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Digite o nome: ");
    String nome = scanner.nextLine();

    System.out.print("Digite o email: ");
    String email = scanner.nextLine();

    System.out.print("Digite o telefone: ");
    String telefone = scanner.nextLine();

    System.out.print("Digite as alergias: ");
    String alergias = scanner.nextLine();

    System.out.print("Digite os problemas médicos: ");
    String problemasMedicos = scanner.nextLine();

    return new Empregado(id, nome, email, telefone, alergias, problemasMedicos);
}
    public PainelUsuario(GerenciadorDeEmpregados gerenciador2) {
}
}
