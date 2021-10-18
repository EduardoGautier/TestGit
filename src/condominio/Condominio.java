package condominio;



import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Eduardo Jose Gautier
 *
 */

public class Condominio {

    Cadastro[] cadastros;


    private int proximoCodigo = 1;

    public Condominio(int tamanho) {
        cadastros = new Cadastro[tamanho];


    }


    public boolean cadastrarMorador(String nome, String ap, int val, String pago) {
        Morador morador = new Morador(proximoCodigo, nome, ap, val, pago);

        for (int i = 0; i < cadastros.length; i++) {
            if (cadastros[i] == null) {
                cadastros[i] = morador;
                proximoCodigo++;
                return true;
            }
        }

        return false;
    }

    public Cadastro[] buscarCadastro(String ap) {
        Cadastro[] result = new Cadastro[cadastros.length];
        ap = ap.toLowerCase();

        int iRes = 0;
        for (Cadastro cadastro : cadastros) {
            if ((cadastro != null) && (cadastro.getAp().toLowerCase().contains(ap))) {
                result[iRes++] = cadastro;
            }
        }

        return result;
    }

    public Cadastro[] pesquisarMorador(String nome) {
        Cadastro[] result = new Cadastro[cadastros.length];
        nome = nome.toLowerCase();

        int iRes = 0;
        for (Cadastro cadastro : cadastros) {
            if ((cadastro != null) && (cadastro.getNome().toLowerCase().contains(nome))) {
                result[iRes++] = cadastro;
            }
        }
        return result;
    }

    public boolean excluirMorador(int codigo) {
        for (int i = 0; i < cadastros.length; i++) {
            if (cadastros[i] != null && cadastros[i].codigo == codigo) {
                cadastros[i] = null;
                return true;
            }
        }
        return false;
    }

    public Cadastro pesquisar(int codigo) {
        for (int i = 0; i < cadastros.length; i++) {
            if (cadastros[i] != null && cadastros[i].codigo == codigo)
                return cadastros[i];
        }
        return null;
    }

    public boolean editarMorador(int codigo, String novoNome, String novoAp, int novoVal) {
        Cadastro morador = pesquisar(codigo);
        if (morador == null)
            return false;

        if (novoNome != null && !novoNome.equals(""))
            morador.nome = novoNome;

        if (novoAp != null && !novoAp.equals(""))
            morador.ap = novoAp;

        if (novoVal != 0)
            morador.val = novoVal;



        return true;
    }






}