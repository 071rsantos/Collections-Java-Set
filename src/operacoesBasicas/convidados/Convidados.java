package operacoesBasicas.convidados;

public class Convidados {
    private String nome;
    private int codigoConvite;
    
    public Convidados(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoConvite;
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
        Convidados other = (Convidados) obj;
        if (codigoConvite != other.codigoConvite)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Convidados [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
    }

}
