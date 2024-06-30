import java.util.Scanner;

public class condicoes {
    private static GerenciadorDeEmpregados gerenciador =  new GerenciadorDeEmpregados();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int opcao = scanner.nextInt();
            scanner.nextInt();

            switch (opcao) {
                case 1:
                    Empregado empregado = coletarInformacoesDoEmpregado();
                    gerenciador.adicionarEmpregado(empregado);
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
                    System.out.println("Opção inválida.");

            }
        }
    }

    private static Empregado coletarInformacoesDoEmpregado() {
    
        throw new UnsupportedOperationException("Unimplemented method 'coletarInformacoesDoEmpregado'");
    }

    private static void mostrarMenu() {
    
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMenu'");
    }
}
private static void mostrarMenu() {
    System.out.println("\n--- Menu ---");
    System.out.println("1. Adicionar Empregado");
    System.out.println("2. Buscar Empregado por ID");
    System.out.println("3. Listar Todos os Empregados");
    System.out.println("4. Sair");
    System.out.print("Escolha uma opção: ");
}

private static Empregado coletarInformacoesDoEmpregado() {
    System.out.print("Digite o ID: ");
    Scanner scanner;
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
