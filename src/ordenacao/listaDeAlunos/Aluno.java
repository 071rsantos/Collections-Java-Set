package ordenacao.listaDeAlunos;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private long matricula;
    private double notaMedia;

    public Aluno(String nome, long matricula, double notaMedia) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaMedia = notaMedia;
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (matricula ^ (matricula >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (matricula != other.matricula)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Aluno [ "+ nome + ", matricula: " + matricula + ", Media: " + notaMedia + "]";
    }
    
}

class ComparatorAlunoPorNota implements Comparator<Aluno>{

    @Override
    public int compare(Aluno p1, Aluno p2) {
        return Double.compare(p1.getNotaMedia(), p2.getNotaMedia());
    }

}