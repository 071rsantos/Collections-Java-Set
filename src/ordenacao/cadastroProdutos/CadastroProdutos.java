package ordenacao.cadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int qnt){
        produtosSet.add(new Produto(cod, nome, preco, qnt));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtosSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtosSet);
        return produtoPorPreco;
    }
    

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "BomBril", 2.5, 10);
        cadastroProdutos.adicionarProduto(2L, "Amaciante", 12, 10);
        cadastroProdutos.adicionarProduto(3L, "Dragao Verde", 25.9, 10);
        cadastroProdutos.adicionarProduto( 1L, "Detergente omo", 1.5, 10);

        System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println(cadastroProdutos.exibirProdutoPorPreco());

    }

}
