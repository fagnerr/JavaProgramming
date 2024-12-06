package cadastropessoas;

import java.util.Scanner;

public class CadastroMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();

        System.out.println("Bem-vindo ao sistema de cadastro de pessoas!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("3. Pesquisar");
            System.out.println("4. Alterar");
            System.out.println("5. Excluir");
            System.out.println("6. Gravar");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    // Cadastrar
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Sobrenome: ");
                    String sobrenome = scanner.nextLine();
                    System.out.print("Gênero: ");
                    String genero = scanner.nextLine();
                    System.out.print("Data de nascimento (dd/mm/aaaa): ");
                    String dataNascimento = scanner.nextLine();
                    cadastro.cadastrarPessoa(nome, sobrenome, genero, dataNascimento);
                    System.out.println("Cadastro realizado com sucesso!");

                    System.out.print("Deseja gravar os dados? (s/n): ");
                    String resposta = scanner.nextLine();
                    if (resposta.equalsIgnoreCase("s")) {
                        cadastro.gravarDados();
                    } else {
                        System.out.println("Os dados não foram gravados.");
                    }

                    // Pergunta se deseja listar as pessoas
                    if (!perguntaVoltarMenu(scanner)) {
                        System.out.println("Saindo do programa. Dados salvos.");
                        cadastro.gravarDados();
                        scanner.close();
                        return;
                    }
                    break;

                case "2":
                    listarPessoas(cadastro);
                    if (!perguntaVoltarMenu(scanner)) {
                        System.out.println("Saindo do programa. Dados salvos.");
                        cadastro.gravarDados();
                        scanner.close();
                        return;
                    }
                    break;

                case "3": // Pesquisar
                    System.out.print("Digite o ID da pessoa a ser pesquisada: ");
                    int idPesquisa = Integer.parseInt(scanner.nextLine());
                    Pessoa pessoaEncontrada = cadastro.pesquisar(idPesquisa);
                    if (pessoaEncontrada != null) {
                        System.out.println("Pessoa encontrada: " + pessoaEncontrada.getNome() + " " + pessoaEncontrada.getSobrenome());
                    } else {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;

                case "4": // Alterar
                    System.out.print("Digite o ID da pessoa a ser alterada: ");
                    int idAlterar = Integer.parseInt(scanner.nextLine());
                    System.out.print("Novo Nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo Sobrenome: ");
                    String novoSobrenome = scanner.nextLine();
                    System.out.print("Novo Gênero: ");
                    String novoGenero = scanner.nextLine();
                    System.out.print("Nova Data de nascimento (dd/mm/aaaa): ");
                    String novaDataNascimento = scanner.nextLine();
                    cadastro.alterar(idAlterar, novoNome, novoSobrenome, novoGenero, novaDataNascimento);
                    break;

                case "5": // Excluir
                    System.out.print("Digite o ID da pessoa a ser excluída: ");
                    int idExcluir = Integer.parseInt(scanner.nextLine());
                    cadastro.excluir(idExcluir);
                    break;

                case "6": // Gravar
                    cadastro.gravarDados();
                    break;

                case "7": // Sair
                    cadastro.gravarDados();
                    System.out.println("Saindo do programa. Dados salvos.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void listarPessoas(Cadastro cadastro) {
        System.out.println("Lista de Pessoas:");
        for (Pessoa p : cadastro.listar()) {
            System.out.println("ID: " + p.getId() +
                               ", Nome: " + p.getNome() + " " + p.getSobrenome() +
                               ", Gênero: " + p.getGenero() +
                               ", Data de Nascimento: " + p.getDataNascimento() +
                               ", Idade: " + p.getIdade());
        }
    }

    private static boolean perguntaVoltarMenu(Scanner scanner) {
        System.out.print("Deseja voltar ao menu de opções? (s/n): ");
        String voltar = scanner.nextLine();
        return voltar.equalsIgnoreCase("s");
    }
}