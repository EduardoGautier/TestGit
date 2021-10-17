package com.company.projlibrary;
import java.util.Scanner;


/**
 *
 * @author Eduardo Jose Gautier
 */

public class Main {

    static Biblioteca biblioteca;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        biblioteca = new Biblioteca(100);
        biblioteca.cadastrarLivro("As Vantagens de ser Invisivel", "Stephen Chbosky", 1);
        biblioteca.cadastrarLivro("Java para iniciantes", "Luiz Duarte", 3);
        biblioteca.cadastrarLivro("Querido John", "Nicholas Sparks", 1);


        System.out.println("Usuario: ");
        String usuario = teclado.nextLine();

        System.out.println("Senha: ");
        String senha = teclado.nextLine();

        Seguranca seguranca = new Seguranca();
        if (seguranca.autenticar(usuario, senha) == false){
            System.out.println("Usuario ou senha Invalidos!");
            return ;
        }

        System.out.println("Usuario autenticado com sucesso!");

        System.out.println("===== BIBLIOTECA =====");

        while(true){
            exibirMenu();
        }
    }

    private static void exibirMenu() {
        System.out.println("Escolha uma Opcao:");
        System.out.println("1 - Pesquisar");
        System.out.println("2 - Emprestar");
        System.out.println("3 - Devolver");
        System.out.println("4 - Cadastrar");
        System.out.println("5 - Editar");
        System.out.println("6 - Excluir");
        System.out.println("7 - Sair");

        int opcao = teclado.nextInt();
        teclado.nextLine();
        switch(opcao){
            case 1: pesquisar();
                break;
            case 2: emprestar();
                break;
            case 3: devolver();
                break;
            case 4: cadastrar();
                break;
            case 5: editar();
                break;
            case 6: excluir();
                break;
            case 7: System.exit(0);
                break;
            default: System.out.println("Opcao Invalida!");
                break;
        }
    }

    private static void cadastrar(){
        System.out.println("====== CADASTRAR =====");
        System.out.println("Digite o titulo do livro: ");
        String titulo = teclado.nextLine();
        System.out.println("Digite o nome do autor: ");
        String autor = teclado.nextLine();

        System.out.println("Escolha um genero: ");
        System.out.println("1 - Romance");
        System.out.println("2 - Aventura");
        System.out.println("3 - Não-Ficção");
        int genero = teclado.nextInt();
        teclado.nextLine();

        boolean sucesso = biblioteca.cadastrarLivro(titulo, autor, genero);
        if (sucesso)
            System.out.println("Livro cadastrado com sucesso!");
        else
            System.out.println("Estoque da biblioteca cheio!");
    }

    private static void pesquisar(){
        System.out.println("===== PESQUISAR =====");
        System.out.println("Escolha uma opção de pesquisa:");
        System.out.println("1 - Por titulo");
        System.out.println("2 - Por código");
        int opcao = teclado.nextInt();
        teclado.nextLine();

        if(opcao == 1){
            System.out.println("Digite o titulo do livro:");
            String titulo = teclado.nextLine();
            Livro[] livros = biblioteca.pesquisar(titulo);

            if (livros == null)
                System.out.println("Nenhum livro encontrado com este tiulo!");
            else{
                System.out.println("Livros encontrados:");
                for (int i = 0; i < livros.length; i++) {
                    if (livros[i] != null)
                        System.out.println(livros[i].codigo + " - " + livros[i].titulo + " - " + livros[i].disponivel);
                }
            }
        }
        else if(opcao == 2){
            System.out.println("Digite o codigo do livro:");
            int codigo = teclado.nextInt();
            teclado.nextLine();
            Livro livro = biblioteca.pesquisar(codigo);

            if (livro == null)
                System.out.println("Código inválido!");
            else
                System.out.println();System.out.println(livro.codigo + " - " + livro.titulo + " - " + livro.disponivel);

        }
        else{
            System.out.println("Opção de pesquisa inválida");
        }
    }

    private static void emprestar(){
        System.out.println("=== EMPRESTAR ===");
        System.out.println("Digite o código do livro:");
        int codigo = teclado.nextInt();
        teclado.nextLine();
        boolean sucesso = biblioteca.emprestarLivro(codigo);
        if (sucesso)
            System.out.println("Livro emprestado com sucesso!");
        else
            System.out.println("Não foi possível emprestar o livro!");
    }

    private static void devolver(){
        System.out.println("=== DEVOLVER ===");
        System.out.println("Digite o código do livro:");
        int codigo = teclado.nextInt();
        teclado.nextLine();
        boolean sucesso = biblioteca.devolverLivro(codigo);
        if (sucesso)
            System.out.println("Livro devolvido com sucesso!");
        else
            System.out.println("Não foi possível devolver o livro!");
    }

    private static void editar() {
        System.out.println("===== EDITAR =====");
        System.out.println("Digite o código do livro:");
        int codigo = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite o novo titulo (ou deixe em branco):");
        String novoTitulo = teclado.nextLine();

        System.out.println("Digite o novo autor (ou deixe em branco):");
        String novoAutor = teclado.nextLine();

        System.out.println("Digite o novo genero (ou digite 0):");
        System.out.println("0 - Manter o atual");
        System.out.println("1 - Romance");
        System.out.println("2 - Aventura");
        System.out.println("3 - Não-Ficção");
        int novoGenero = teclado.nextInt();
        teclado.nextLine();

        boolean sucesso = biblioteca.editarLivro(codigo, novoTitulo, novoAutor, novoGenero);
        if (sucesso)
            System.out.println("Edição realizada com sucesso!");
        else
            System.out.println("Livro não encontrado!");
    }

    private static void excluir() {
        System.out.println("=== EXCLUIR ===");
        System.out.println("Digite o código do livro:");
        int codigo = teclado.nextInt();
        teclado.nextLine();

        boolean sucesso = biblioteca.excluirLivro(codigo);
        if (sucesso)
            System.out.println("Livro excluido com sucesso");
        else
            System.out.println("Livro não encontrado");
    }

}
