package net.senai;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Sala> salas = new ArrayList<>();
    private static ArrayList<Aluno> alunos = new ArrayList<>();
    private static ArrayList<Dispositivo> dispositivos = new ArrayList<>();

    public static void main(String[] args) {
        inicializarDados();
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            processarOpcao(opcao);
        } while (opcao != 0);
    }

    private static void inicializarDados() {
        // Inicializar alguns dados para testes
        Sala sala1 = new Sala("Sala 101", "Matemática", "Manhã", "Professor A", new ArrayList<>());
        Sala sala2 = new Sala("Sala 102", "História", "Tarde", "Professor B", new ArrayList<>());
        salas.add(sala1);
        salas.add(sala2);

        Aluno aluno1 = new Aluno("João", "01/01/2005", "joao@example.com", "Rua A, 123", sala1);
        Aluno aluno2 = new Aluno("Maria", "02/02/2005", "maria@example.com", "Rua B, 456", sala2);
        alunos.add(aluno1);
        alunos.add(aluno2);

        dispositivos.add(new Notebook(1));
        dispositivos.add(new Tablet(2));
    }

    private static void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Listar salas");
        System.out.println("2. Adicionar aluno");
        System.out.println("3. Listar alunos");
        System.out.println("4. Emprestar dispositivo");
        System.out.println("5. Devolver dispositivo");
        System.out.println("0. Sair");
    }

    private static void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                Escola.listarSalas(new Escola(salas.toArray(new Sala[0])));
                break;
            case 2:
                adicionarAluno();
                break;
            case 3:
                listarAlunos();
                break;
            case 4:
                emprestarDispositivo();
                break;
            case 5:
                devolverDispositivo();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }

    private static void adicionarAluno() {
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        System.out.println("Digite a data de nascimento (dd/mm/aaaa):");
        String dataDeNascimento = scanner.nextLine();
        System.out.println("Digite o e-mail do aluno:");
        String email = scanner.nextLine();
        System.out.println("Digite o endereço do aluno:");
        String endereco = scanner.nextLine();
        System.out.println("Escolha a sala (1 para Sala 101, 2 para Sala 102):");
        int salaEscolhida = scanner.nextInt();
        scanner.nextLine();

        Sala sala = salas.get(salaEscolhida - 1);

        Aluno aluno = new Aluno(nome, dataDeNascimento, email, endereco, sala);
        alunos.add(aluno);
        sala.alunos.add(aluno);

        System.out.println("Aluno adicionado com sucesso!");
    }

    private static void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(Aluno.detalhes(aluno));
        }
    }

    private static void emprestarDispositivo() {
        System.out.println("Escolha o dispositivo para emprestar (1 para Notebook, 2 para Tablet):");
        int dispositivoId = scanner.nextInt();
        scanner.nextLine();

        Dispositivo dispositivo = dispositivos.get(dispositivoId - 1);
        System.out.println("Digite o nome do aluno responsável:");
        String nomeAluno = scanner.nextLine();
        Aluno responsavel = alunos.stream().filter(a -> a.getNome().equals(nomeAluno)).findFirst().orElse(null);
        if (responsavel == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        System.out.println("Digite a data do empréstimo (dd/mm/aaaa):");
        String dataDoEmprestimo = scanner.nextLine();

        dispositivo.emprestar(responsavel, dataDoEmprestimo);
    }

    private static void devolverDispositivo() {
        System.out.println("Escolha o dispositivo para devolver (1 para Notebook, 2 para Tablet):");
        int dispositivoId = scanner.nextInt();
        scanner.nextLine();

        Dispositivo dispositivo = dispositivos.get(dispositivoId - 1);
        dispositivo.devolver();
    }
}
