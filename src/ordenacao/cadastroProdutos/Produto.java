package ordenacao.cadastroProdutos;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private long cod;
    private String nome;
    private double preco;
    private int qnt;

    public Produto(long cod, String nome, double preco, int qnt) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.qnt = qnt;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (cod ^ (cod >>> 32));
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
        Produto other = (Produto) obj;
        if (cod != other.cod)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[Codigo: " + cod + ", " + nome + ", R$ " + preco + ", Quantidade em estoque: " + qnt + "]";
    }
    
}

class ComparatorPorPreco implements Comparator<Produto>{
    
    @Override
public int compare(Produto p1, Produto p2) {
    return Double.compare(p1.getPreco(), p2.getPreco());
}
}