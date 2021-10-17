package condominio;


import java.util.List;
import java.util.Scanner;

public class Principal {

    private static Condominio condominio;

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        condominio = new Condominio(100);

        List<Morador> lista = condominio.getCadastrosAp();

        while (true) {

            System.out.print("\n┌----------------------------------------------------------┐\n"
                    + "│                   CONDOMINIO                              │\n"
                    + "│---------------------------------------------------------- │\n"
                    + "│ 1 -  BUSCAR MORADOR                                       │\n"
                    + "│ 2 -  CADASTRAR MORADOR                                    │\n"
                    + "│ 3 -  LISTAR MORADORES                                     │\n"
                    + "│ 4 -  EXCLUIR MORADOR                                      │\n"
                    + "│ 5 -  EDITAR MORADOR                                       │\n"
                    + "│ 0 -  SAIR                                                 │\n"
                    + "└----------------------------------------------------------┘\n"
                    + "Digite a opção desejada:  ");
            int opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    pesquisar();
                    break;
                case 2:
                    cadastrar();
                    break;
                case 3:
                    listarCadastros();
                    break;
                case 4:
                    excluir();
                    break;
                case 5:
                    editar();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }


    public static void listarCadastros() {
        System.out.println("\n=== Moradores cadastrados ===");
        System.out.println("Código: Nome: Ap: Pago (S/N):");
        for (Cadastro cadastro : condominio.cadastros) {
            if (cadastro != null) {
                System.out.println(cadastro.getCodigo() + "\t"
                        + cadastro.getNome() + "\t"
                        + cadastro.getAp() + "\t"
                        + cadastro.getPago());
            }
        }
        System.out.println("-----------------------\n");
    }

    private static void cadastrar() {
        System.out.println("=== Cadastramento ===");

        System.out.println("Digite o Nome do Propietario:");
        String nome = teclado.nextLine();
        System.out.println("Digite o numero do apartamento:");
        String ap = teclado.nextLine();
        System.out.println("Digite o valor do condominio:");
        int val = teclado.nextInt();
        System.out.println("O Condominio esta pago(S/N):");
        String pago = teclado.next();
        boolean sucesso;
        sucesso = condominio.cadastrarMorador(nome, ap, val, pago);
        if (sucesso) {
            System.out.println("Morador cadastrado com sucesso!");
        } else {
            System.out.println("Condominio cheio - não é possível cadastrar.");
        }
    }
    private static void excluir() {
        System.out.println("=== EXCLUIR ===");
        System.out.println("Digite o código do morador que deseja excluir:");
        int codigo = teclado.nextInt();
        teclado.nextLine();

        boolean sucesso = condominio.excluirMorador(codigo);
        if (sucesso) {
            System.out.println("morador excluido com sucesso");
            return;
        }
        System.out.println("morador não encontrado");
    }

    private static void editar() {
        System.out.println("===== EDITAR =====");
        System.out.println("Digite o código do livro:");
        int codigo = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite o novo nome (ou deixe em branco):");
        String novoNome = teclado.nextLine();

        System.out.println("Digite o novo apartamento (ou deixe em branco):");
        String novoAp = teclado.nextLine();

        System.out.println("Digite o novo valor (ou deixe em branco):");
        int novoVal = teclado.nextInt();

        teclado.nextLine();

        boolean sucesso = condominio.editarMorador(codigo,  novoNome,  novoAp,  novoVal);
        if (sucesso) {
            System.out.println("Edição realizada com sucesso!");
            return;
        }
        System.out.println("Livro não encontrado!");
    }


    private static void pesquisar() {
        while (true) {
            System.out.println("=== Busca ===");
            System.out.println("1 - Buscar por número do apartamento");
            System.out.println("0 - Sair Do Sistema");

            System.out.print("\nDigite a opção desejada: ");
            int opcao = teclado.nextInt();
            teclado.nextLine();
            do {

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o número do apartamento a pesquisar: ");

                        String pesq = teclado.nextLine();
                        Cadastro[] cadastros = condominio.buscarCadastro(pesq);
                        if (cadastros[0] == null) {
                            System.out.println("cadastro não encontrado!");
                            return;
                        }
                        System.out.println("Cadastros encontrados:");
                        System.out.println("Código: Nome: Ap: Pago (S/N):");
                        for (Cadastro cadastro : cadastros) {
                            if (cadastro != null) {
                                System.out.println(cadastro.getCodigo() + "\t" + cadastro.getNome() + "\t" + cadastro.getAp() + "\t" + cadastro.getPago());
                            } else {
                                return;
                            }
                        }
                        break;
                    case 0:
                        System.exit(0);
                        break;

                }

            } while (opcao != 0);
        }

    }


}
