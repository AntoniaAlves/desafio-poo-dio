import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main{

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargahoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria ();
        mentoria.setTitulo("mentoria em java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPersona1 = new Dev();
        devPersona1.setNome("Persona1");
        devPersona1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Persona1: " + devPersona1.getConteudosInscritos());
        devPersona1.progredir();
        devPersona1.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Persona1: " + devPersona1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Persona1: " + devPersona1.getConteudosConcluidos());
        System.out.println("XP:"+ devPersona1.calcularTotalXp());

        System.out.println("------------");

        Dev devPersona2 = new Dev();
        devPersona2.setNome("Persona2");
        devPersona2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Persona2: " + devPersona2.getConteudosInscritos());
        devPersona2.progredir();
        devPersona2.progredir();
        devPersona2.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Persona2: " + devPersona2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Persona2: " + devPersona2.getConteudosConcluidos());
        System.out.println("XP:"+ devPersona2.calcularTotalXp());
    }
}