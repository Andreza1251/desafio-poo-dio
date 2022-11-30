/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiopoodio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

/**
 *
 * @author andre
 */
public class DesafioPooDio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //instanciando os objetos Curso
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);
        
         Curso curso2 = new Curso();
         curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(8);
        
          //instanciando os objetos Mentoria
          Mentoria mentoria1 = new Mentoria();
          mentoria1.setTitulo("mentoria Java");
          mentoria1.setDescricao("mentoria sobre o curso Java");
          mentoria1.setData(LocalDate.now()); //esse método now() vai mostrar a data de hoje 
          
      /*  System.out.println(curso1);
        System.out.println(curso2);
         System.out.println(mentoria1); */
      
      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Um bootcamp sobre a linguagem Java");
        bootcamp.getConteudos().add(curso1);
          bootcamp.getConteudos().add(curso2);
          bootcamp.getConteudos().add(mentoria1);
          
      Dev devAndreza = new Dev();
      devAndreza.setNome("Andreza");
      devAndreza.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos inscritos " + devAndreza.getConteudosInscritos());
      devAndreza.progredir();
      System.out.println("-----");
       System.out.println("Conteudos inscritos " + devAndreza.getConteudosInscritos());
      System.out.println("Conteudos concluídos " + devAndreza.getConteudosConcluidos());
      System.out.println("XP: " + devAndreza.calcularXP());
      
       Dev devJoana = new Dev();
      devAndreza.setNome("Joana");
      devJoana.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos inscritos " + devJoana.getConteudosInscritos());
      devJoana.progredir();
      System.out.println("-----");
       System.out.println("Conteudos inscritos " + devJoana.getConteudosInscritos());
       System.out.println("Conteudos concluídos " + devJoana.getConteudosConcluidos());
       System.out.println("XP: " + devJoana.calcularXP());
      
      
      
    }
    
}
