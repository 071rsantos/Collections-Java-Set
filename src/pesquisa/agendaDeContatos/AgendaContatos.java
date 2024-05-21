package pesquisa.agendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agendaContatos;

    public AgendaContatos(){
        this.agendaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        agendaContatos.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        if(!agendaContatos.isEmpty()){
        System.out.println(agendaContatos);
        } else{
            throw new RuntimeException("Agenda de contatos vazia.");
        }
    }

    public Set<Contato> pesquisarContato(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : agendaContatos) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumero(String nome, int numero){
        Contato contatoAtualizado = null;
        for (Contato c : agendaContatos) {
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        //agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Rodrigo", 96487057);
        agendaContatos.adicionarContato("Melissa", 99216500);
        agendaContatos.adicionarContato("Tâmara", 96165965);
        agendaContatos.adicionarContato("Valnei", 91578680);
        agendaContatos.adicionarContato("Ester Casa", 33145812);
        agendaContatos.adicionarContato("Ester", 96646500);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarContato("Ester"));

        System.out.println(agendaContatos.atualizarNumero("Rodrigo", 95020207));

        agendaContatos.exibirContato();
    }

}