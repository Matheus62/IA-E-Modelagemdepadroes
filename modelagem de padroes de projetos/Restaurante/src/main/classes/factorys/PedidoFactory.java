package main.classes.factorys;

import main.classes.produtos.Carro;

public interface PedidoFactory {
    Carro criarCarro();
}
