package main;

import java.util.ArrayList;
import java.util.List;

public class ListaNavio {

    /* 
    ListaNavio é a classe responsável por gerenciar a coleção de todos os 
    objetos Navio criados. 
    Ela centraliza o armazenamento, a adição, a remoção 
    e a consulta de navios.
    */
    private final List<Navio> listaNavios = new ArrayList<>();
    private static ListaNavio instancia;

    private ListaNavio() {
    }
    /*
    Garante que exista apenas uma única instância da lista de navios em toda a 
    aplicação. Qualquer tela que precise acessar ou modificar a lista 
    (cadastro, consulta, gerenciamento) o fará através dessa instância única, 
    garantindo a consistência e a integridade dos dados pelo uso do singleton.
    */
    public static ListaNavio getInstance() 
    {
        if (instancia == null) 
        {
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
