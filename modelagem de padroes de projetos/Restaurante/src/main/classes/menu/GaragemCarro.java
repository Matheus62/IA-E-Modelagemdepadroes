package main.classes.menu;

import java.util.ArrayList;
import java.util.List;
import main.classes.produtos.Carro;

public class GaragemCarro {

    private final List<Carro> listaCarros = new ArrayList<>();
    private static GaragemCarro instancia;

    private GaragemCarro() {
    }

    public static GaragemCarro getInstance() {
        if (instancia == null) {
            instancia = new GaragemCarro();
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
