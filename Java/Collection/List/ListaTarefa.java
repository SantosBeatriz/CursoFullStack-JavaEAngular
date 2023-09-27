package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // atributo
    private List<Tarefa> tarefaList;

    // construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // metodos
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        if (!tarefaList.isEmpty()) {
            for (Tarefa t : tarefaList) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover.add(t);
                }
            }
            tarefaList.removeAll(tarefasParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefas() {
        if (!tarefaList.isEmpty()) {
            System.out.println(tarefaList);
        } else {
            System.out.println("A lista stá vazia!");
        }
    }

    public static void main(String[] args) {
        // criando uma instancia de classe
        ListaTarefa listaTarefa = new ListaTarefa();

        // adicionando as tarefas
        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar para o exame");
        listaTarefa.adicionarTarefa("Fazer exercícios");

        // total de tarefas
        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        // descrição das tarefas
        listaTarefa.obterDescricaoTarefas();

        // removendo uma tarefa
        listaTarefa.removerTarefa("Trabalhar");

        // total de tarefas
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

        // descrição das tarefas
        listaTarefa.obterDescricaoTarefas();

        // removendo uma tarefa de uma ista vazia
        listaTarefa.removerTarefa("Estudar para o exame");

        // total de tarefas
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

    }

}