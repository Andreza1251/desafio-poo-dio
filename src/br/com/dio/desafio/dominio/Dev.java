/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import br.com.dio.desafio.dominio.Bootcamp;

/**
 *
 * @author andre
 */
public class Dev {
    
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
    
    
    
    
    //métodos ue criamos
    public void inscreverBootcamp(Bootcamp bootcamp){
     this.conteudosInscritos.addAll(bootcamp.getConteudos());
     bootcamp.getDevsInscritos().add(this); //vai adicionar esse dev(this) no bootcamp
    }
    
    public void progredir(){
    Optional<Conteudo> conteudo = this.conteudosConcluidos.stream().findFirst();
    
    if(conteudo.isPresent()){
     this.conteudosConcluidos.add(conteudo.get());
     this.conteudosInscritos.remove(conteudo.get());
    }else{
    
    System.out.println("Você não está matriculado em nenhum conteúdo");
     }
    
    }
    
    public double calcularXP(){
     return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.conteudosInscritos);
        hash = 29 * hash + Objects.hashCode(this.conteudosConcluidos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dev other = (Dev) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.conteudosInscritos, other.conteudosInscritos)) {
            return false;
        }
        if (!Objects.equals(this.conteudosConcluidos, other.conteudosConcluidos)) {
            return false;
        }
        return true;
    }

    
    
    
    
    
}
