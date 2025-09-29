package main.classes.lista;

import java.util.ArrayList;
import java.util.List;
import main.classes.carros.Carro;

public class ListaCarro {

    private final List<Carro> listaCarros = new ArrayList<>();
    private static ListaCarro instancia;

    private ListaCarro() {
    }

    public static ListaCarro getInstance() {
        if (instancia == null) {
            instancia = new ListaCarro();
        }
        return instancia;
    }
    public void adicionarCarro(Carro carro){
        listaCarros.add(carro);
    }
    public void deletarCarro(int i){
        listaCarros.remove(i);
    }

    public void editarCarro(Carro carro, int i){
        listaCarros.set(i, carro);
    }
    
    public List<Carro> getListaCarros() {
        return listaCarros;
    }
}
