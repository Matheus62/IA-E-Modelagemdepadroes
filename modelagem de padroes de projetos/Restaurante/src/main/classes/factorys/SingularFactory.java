package main.classes.factorys;

import main.classes.produtos.CarroSimples;
import main.classes.produtos.Pedido;

public class SingularFactory implements PedidoFactory {

    private String Pedido;
    private String marca;
    private String cor;
    private Double valorAluguel;

    private SingularFactory(Builder builder) {
        this.Pedido = builder.placa;
        this.marca = builder.marca;
        this.cor = builder.cor;
        this.valorAluguel = builder.valorAluguel;
    }

    @Override
    public Pedido criarPedido() {
        return new CarroSimples(Pedido, marca, cor, valorAluguel);
    }

    public static class Builder {

        private String placa;
        private String marca;
        private String cor;
        private Double valorAluguel;

        public Builder(String placa) {
            this.placa = placa;
        }

        public Builder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public Builder cor(String cor) {
            this.cor = cor;
            return this;
        }

        public Builder valorAluguel(Double valorAluguel) {
            this.valorAluguel = valorAluguel;
            return this;
        }

        public SingularFactory build() {
            return new SingularFactory(this);
        }
    }

}
