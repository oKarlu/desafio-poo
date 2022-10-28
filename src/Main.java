import br.com.cadu.desafio.dominio.Conteudo;
import br.com.cadu.desafio.dominio.Curso;
import br.com.cadu.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso1.setTitulo("Javascript");
        curso1.setDescricao("descrição curso js");
        curso1.setCargaHoraria(4);

        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("descricão mentoria java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);




    }
}