package main.classes.menu;

import java.util.ArrayList;
import java.util.List;
import main.classes.produtos.Pedido;

public class GaragemCarro {

    private final List<Pedido> listaCarros = new ArrayList<>();
    private static GaragemCarro instancia;

    private GaragemCarro() {
    }

    public static GaragemCarro getInstance() {
        if (instancia == null) {
            instancia = new GaragemCarro();
        }
        return instancia;
    }
    public void adicionarCarro(Pedido carro){
        listaCarros.add(carro);
    }
    public void deletarCarro(int i){
        listaCarros.remove(i);
    }

    public void editarCarro(Pedido carro, int i){
        listaCarros.set(i, carro);
    }
    
    public List<Pedido> getListaCarros() {
        return listaCarros;
    }
}
