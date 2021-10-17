package com.company.projlibrary;

/**
 *
 * @author Eduardo Jose Gautier
 */
public class Livro {

    public int codigo;
    public String titulo;
    public String autor;
    public String genero;
    public boolean disponivel;

    public Livro(){

    }

    public Livro(int codigo, String titulo, String autor, String genero, boolean disponivel){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = disponivel;
    }




}
