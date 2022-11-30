/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dio.desafio.dominio;

/**
 *
 * @author andre
 */
public abstract class Conteudo {
    
    //criar uma constante para representar o valor xp padrão, o valor que vai iniciar é 10
    protected static final double XP_PADRAO = 10;
    
    private String titulo;
    private String descricao;
    
    public abstract double calcularXp(); //quando criamos um metodo abstrato a classe também precisa ser abstrata

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
     
    
    
    
}
