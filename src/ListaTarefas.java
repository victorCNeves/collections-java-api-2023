import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        listaTarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> listaRemover = new ArrayList<Tarefa>();
        for(Tarefa t : listaTarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                listaRemover.add(t);
            }
        }
        listaTarefas.removeAll(listaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefas);
    }

//    public static void main(String[] args) {
//        ListaTarefas lista = new ListaTarefas();
//        lista.adicionarTarefa("comer");
//
//        System.out.println(lista.obterNumeroTotalTarefas());
//
//        lista.adicionarTarefa("beber");
//        lista.adicionarTarefa("dormir");
//        lista.adicionarTarefa("varrer");
//        lista.adicionarTarefa("comer");
//        lista.adicionarTarefa("sonhar");
//
//        System.out.println(lista.obterNumeroTotalTarefas());
//
//        lista.obterDescricoesTarefas();
//        lista.removerTarefa("comer");
//
//        System.out.println(lista.obterNumeroTotalTarefas());
//        lista.obterDescricoesTarefas();
//    }
}


