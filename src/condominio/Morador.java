package condominio;

/**
 *
 * @author Eduardo Jose Gautier
 */

public class Morador extends Cadastro{

    public Morador(int codigo, String nome, String ap, int val, String pago) {
        super(codigo, nome, ap, val, pago);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getAp() {
        return ap;
    }

    public int getVal(){ return val; }

    public String getPago() {
        return pago;
    }













}










