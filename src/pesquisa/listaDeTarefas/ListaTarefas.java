package pesquisa.listaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Set<Tarefa> tarefaParaRemover = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(t);
            }
        }
        tarefaSet.removeAll(tarefaParaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluida() == true) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluida() == false) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equals(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equals(descricao)) {
                t.setConcluida(false);
            }
        }
    }

    public void limparLista(){
        tarefaSet.clear();
    }


    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.adicionarTarefa("Tarefa 5");

        System.out.println("Numero total de tarefas: "+listaTarefas.contarTarefas());
        //listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Tarefa 4");

        System.out.println("Numero total de tarefas: "+listaTarefas.contarTarefas());
        //listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("Tarefa 1");
        listaTarefas.marcarTarefaConcluida("Tarefa 5");

        System.out.println("Tarefas concluidas: "+listaTarefas.obterTarefasConcluidas());
        System.out.println("tarefas pendentes: "+listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaPendente("Tarefa 5");
        System.out.println("Tarefas concluidas: "+listaTarefas.obterTarefasConcluidas());
        System.out.println("tarefas pendentes: "+listaTarefas.obterTarefasPendentes());

        listaTarefas.limparLista();
        System.out.println("Numero total de tarefas: "+listaTarefas.contarTarefas());
    }

}
