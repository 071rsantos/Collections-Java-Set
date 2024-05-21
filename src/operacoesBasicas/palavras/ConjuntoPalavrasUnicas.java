package operacoesBasicas.palavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(palavrasSet.contains(palavra)){
            palavrasSet.remove(palavra);
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasSet.contains(palavra);
    }
    

    public void exibirPalavras(){
        System.out.println(palavrasSet);
    }
}
