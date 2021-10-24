package condominio;


import java.util.Scanner;

/**
 * @author Eduardo Jose Gautier
 *
 */

public class Principal {

    private static Condominio condominio;

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        condominio = new Condominio(100);


        while (true) {
            System.out.print("\n┌----------------------------------------------------------┐\n"
                    + "│                   CONDOMINIO                             │\n"
                    + "│----------------------------------------------------------│\n"
                    + "│ 1 -  CADASTRAR MORADOR                                   │\n"
                    + "│ 2 -  BUSCAR MORADOR                                      │\n"
                    + "│ 3 -  LISTAR MORADORES                                    │\n"
                    + "│ 4 -  EXCLUIR MORADOR                                     │\n"
                    + "│ 5 -  EDITAR MORADOR                                      │\n"
                    + "│ 0 -  SAIR                                                │\n"
                    + "└----------------------------------------------------------┘\n"
                    + "Digite a opção desejada:  ");
            int opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;

                case 2:
                    pesquisar();
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
        System.out.println("Código: Nome: Ap: Cond: Pago (S/N):");
        for (Cadastro cadastro : condominio.cadastros) {
            if (cadastro != null) {
                System.out.println(cadastro.getCodigo() + "\t"
                        + cadastro.getNome() + "\t"
                        + cadastro.getAp() + "\t"
                        + cadastro.getVal() + "\t"
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
            return;
        }
        System.out.println("Condominio cheio - não é possível cadastrar.");

    }

    private static void pesquisar() {
        while (true) {
            System.out.print("\n┌----------------------------------------------------------┐\n"
                    + "│                                                           │\n"
                    + "│---------------------------------------------------------- │\n"
                    + "│ 1 -  Buscar por número do apartamento                     │\n"
                    + "│ 2 -  Buscar por nome Do Morador                           │\n"
                    + "│ 0 -  SAIR                                                 │\n"
                    + "└----------------------------------------------------------┘\n"
                    + "Digite a opção desejada:  ");
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
                        System.out.println("Código: Nome: Ap: Cond: Pago (S/N):");
                        for (Cadastro cadastro : cadastros) {
                            if (cadastro != null) {
                                System.out.println(cadastro.getCodigo() + "\t" + cadastro.getNome() + "\t" + cadastro.getAp() + "\t" + cadastro.getVal() + "\t" + cadastro.getPago());
                            }
                            return;
                        }
                        break;
                    case 2:
                        System.out.print("Digite o nome do morador que deseja pesquisar: ");

                        String pesqPorNome = teclado.nextLine();
                        Cadastro[] cadastrosPorNome = condominio.pesquisarMorador(pesqPorNome);
                        if (cadastrosPorNome[0] == null) {
                            System.out.println("cadastro não encontrado!");
                            return;
                        }
                        System.out.println("Cadastros encontrados:");
                        System.out.println("Código: Nome: Ap: Cond: Pago (S/N):");
                        for (Cadastro cadastro : cadastrosPorNome) {
                            if (cadastro != null) {
                                System.out.println(cadastro.getCodigo() + "\t" + cadastro.getNome() + "\t" + cadastro.getAp() + "\t" + cadastro.getVal() + "\t" + cadastro.getPago());
                            }
                            return;
                        }
                        break;
                    default:

                        System.out.println("Opção inválida\nDigite novamente");
                }

            } while (opcao != 1 && opcao != 2);
        }

    }

    private static void excluir() {

        byte op;

        Scanner leia = new Scanner(System.in);
        System.out.println("=== EXCLUIR ===");
        System.out.println("Digite o código do morador que deseja excluir:");
        int codigo = teclado.nextInt();

        do {
            System.out.print("┌-------------------┐\n"
                    + "│EXCLUSÃO DO CONTATO│\n"
                    + "└-------------------┘\n"
                    + "Você tem certeza que deseja excluir todos os contatos?\n"
                    + "[1] - Sim\n"
                    + "[2] - Não\n"
                    + "Digite aqui a opção: ");
            teclado.nextLine();
            op = leia.nextByte();
            switch (op) {
                case 1:
                    boolean sucesso = condominio.excluirMorador(codigo);
                    if (sucesso) {
                        System.out.println("morador excluido com sucesso");
                        return;
                    }
                    System.out.println("morador não encontrado");
                    break;
                case 2:
                    System.out.println("Exclusão cancelada");
                    break;
                default:
                    System.out.println("Opção inválida\nDigite novamente");
            }
        } while (op != 1 && op != 2);


    }


    private static void editar() {
        System.out.println("===== EDITAR =====");
        System.out.println("Digite o código do morador:");
        int codigo = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite o novo nome (ou deixe em branco):");
        String novoNome = teclado.nextLine();

        System.out.println("Digite o novo apartamento (ou deixe em branco):");
        String novoAp = teclado.nextLine();

        System.out.println("Digite o novo valor (ou deixe em branco):");
        int novoVal = teclado.nextInt();

        teclado.nextLine();

        boolean sucesso = condominio.editarMorador(codigo, novoNome, novoAp, novoVal);
        if (sucesso) {
            System.out.println("Edição realizada com sucesso!");
            return;
        }
        System.out.println("Morador Não Encontrado!");
    }


}