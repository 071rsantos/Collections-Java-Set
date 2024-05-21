package operacoesBasicas.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidados> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidados(nome, codigoConvite));
    }

    public void removerConvidadosPorCodigo(int codigoConvite){
        Convidados convidadoParaRemover = null;
        for (Convidados c : convidados) {
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        System.out.println(convidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " +conjuntoConvidados.contarConvidados()+ " convidados dentro do set convidados.");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Existem " +conjuntoConvidados.contarConvidados()+ " convidados dentro do set convidados.");


        conjuntoConvidados.removerConvidadosPorCodigo(1234);


        System.out.println("Existem " +conjuntoConvidados.contarConvidados()+ " convidados dentro do set convidados.");


        conjuntoConvidados.exibirConvidados();

    }
    
}
