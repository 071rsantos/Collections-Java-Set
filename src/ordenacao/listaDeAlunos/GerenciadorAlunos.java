package ordenacao.listaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunosSet;

    public GerenciadorAlunos(){
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double notaMedia){
        alunosSet.add(new Aluno(nome, matricula, notaMedia));
    }

    public void removerAluno(long matricula){
        Set<Aluno> alunosParaRemover = new HashSet<>();
        for (Aluno a : alunosSet) {
            if (a.getMatricula() == matricula) {
                alunosParaRemover.add(a);
            }
        }
        alunosSet.removeAll(alunosParaRemover);
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunoPorNome = new TreeSet<>(alunosSet);
        return alunoPorNome;
    }

    public Set<Aluno> exibirAlunoPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorAlunoPorNota());
        alunoPorNota.addAll(alunosSet);
        return alunoPorNota;
    }



    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Rodrigo Santos", 27658L, 7.77);
        gerenciadorAlunos.adicionarAluno("Melissa Queiros", 79863L, 7.32);
        gerenciadorAlunos.adicionarAluno("Adelson Santana", 89765L, 6.45);
        gerenciadorAlunos.adicionarAluno("Caio Costa", 54321L, 7.0);
        gerenciadorAlunos.adicionarAluno("Quezia Paim", 12345L, 6.0);

        gerenciadorAlunos.exibirAlunos();

        System.out.println("---------------------------------------------------------------");

        gerenciadorAlunos.removerAluno(54321L);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("---------------------------------------------------------------");
        System.out.println(gerenciadorAlunos.exibirAlunoPorNota());
        System.out.println("---------------------------------------------------------------");

    }

}
