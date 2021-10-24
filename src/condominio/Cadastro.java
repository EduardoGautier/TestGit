
package condominio;


/**
 *
 * @author Eduardo Jose Gautier
 *
 */

public abstract class Cadastro {

    int codigo, val;
    String nome,ap, pago;

    public Cadastro(int codigo, String nome, String ap, int val, String pago) {
        this.codigo = codigo;
        this.nome = nome;
        this.ap = ap;
        this.val = val;
        this.pago = pago;
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


    public String getPago() {
        return pago;
    }

    public int getVal(){ return val; }



}