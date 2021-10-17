package com.company.projlibrary;

/**
 *
 * @author Eduardo Jose Gautier
 */
public class Seguranca {
    public boolean autenticar(String usuario, String senha) {
        return usuario.equals("admin") && senha.equals("admin");
    }

}
