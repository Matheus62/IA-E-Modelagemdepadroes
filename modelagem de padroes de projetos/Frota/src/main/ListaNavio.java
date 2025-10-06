package main;
/*Usa o singleton para criar apenas uma instancia de lista no projeto*/
import java.util.ArrayList;
import java.util.List;

public class ListaNavio {

    private final List<Navio> listaNavios = new ArrayList<>();
    private static ListaNavio instancia;

    private ListaNavio() {
    }

    public static ListaNavio getInstance() {
        if (instancia == null) {
            instancia = new ListaNavio();
        }
        return instancia;
    }
    
    
    public void adicionarNavio(Navio navio){
        listaNavios.add(navio);
    }
    public void deletarNavio(int i){
        listaNavios.remove(i);
    }
    public void editarNavio(Navio navio, int i){
        listaNavios.set(i, navio);
    }
    
    
    public List<Navio> getListaNavios() {
        return listaNavios;
    }
}
