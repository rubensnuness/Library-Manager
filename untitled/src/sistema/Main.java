package sistema;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Biblioteca biblioteca = new Biblioteca();
    int opcao;
    do {
        System.out.println("\n----MENU----");
        System.out.println("\n1) Adicionar material!");
        System.out.println("2) Pesquisar material!");
        System.out.println("3) Excluir material!");
        System.out.println("4) Listar materiais!");
        System.out.println("5) Sair do sistema!");

        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("Título: ");
                String titulo = scanner.nextLine();
                System.out.print("Autor: ");
                String autor = scanner.nextLine();

                if (titulo.trim().isEmpty() || autor.trim().isEmpty()) {
                    System.out.println("Por favor, preencha todos os campos obrigatórios!");
                    break;
                }

                System.out.println("Tipo de material: 1 - Livro | 2 - Revista");
                int tipo = scanner.nextInt();
                scanner.nextLine();

                if (tipo != 1 && tipo != 2) {
                    System.out.println("Tipo inválido. Cadastro cancelado.");
                    break;
                }

                if (tipo == 1) {

                System.out.println("Gênero: ");
                System.out.println("\n1 - FICCAO");
                System.out.println("2 - ROMANCE");
                System.out.println("3 - TERROR");
                System.out.println("4 - AVENTURA");
                System.out.println("5 - BIOGRAFIA");
                System.out.println("6 - COMEDIA");

                int opGenero = scanner.nextInt();
                scanner.nextLine();
                Genero genero = null;

                    switch (opGenero) {
                        case 1: genero = Genero.FICCAO; break;
                        case 2: genero = Genero.ROMANCE; break;
                        case 3: genero = Genero.TERROR; break;
                        case 4: genero = Genero.AVENTURA; break;
                        case 5: genero = Genero.BIOGRAFIA; break;
                        case 6: genero = Genero.COMEDIA; break;
                        default:
                            System.out.println("Gênero inválido. Cadastro cancelado.");
                            break;
                    }
                    if (genero == null) {
                        break;
                    }
                Livro livro = new Livro(titulo, autor, genero);
                biblioteca.adicionarMaterial(livro);
                } else {
                    System.out.print("Número da edição: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    if (numero <= 0) {
                        System.out.println("Número da edição deve ser positivo.");
                        break;
                    }

                    Revista revista = new Revista(titulo, autor, numero);
                    biblioteca.adicionarMaterial(revista);
                }
                break;
            case 2:
                System.out.println("Digite o titulo para pesquisar: ");
                String busca = scanner.nextLine();

                if (busca.trim().isEmpty()) {
                    System.out.println("Por favor, preencha todos os campos obrigatórios!");
                    break;
                }

                Material encontrado = biblioteca.pesquisarPorTitulo(busca);
                if (encontrado != null) {
                    System.out.println("Material encontrado: " + encontrado);
                } else {
                    System.out.println("Material não encontrado!");
                }
                break;
            case 3:
                System.out.println("Digite o titulo do material a excluir: ");
                String excluirTitulo = scanner.nextLine();

                if (excluirTitulo.trim().isEmpty()) {
                    System.out.println("Por favor, preencha todos os campos obrigatórios!");
                    break;
                }

                biblioteca.excluirMaterial(excluirTitulo);
                break;
            case 4:
                biblioteca.listarMateriais();
                break;
            case 5:
                System.out.println("Saindo do sistema!");
                break;
            default:
                System.out.println("opção inválida!");
                break;
        }

    } while (opcao != 5);
    }
}