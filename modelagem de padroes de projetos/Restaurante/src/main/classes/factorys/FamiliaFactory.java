package main.classes.factorys;

import main.classes.produtos.CarroLuxo;
import main.classes.produtos.Pedido;

/*Utilizando Abstract Factory e Builder*/
public class FamiliaFactory implements PedidoFactory {

    private String placa;
    private String marca;
    private String cor;
    private Double valorAluguel;

    private FamiliaFactory(Builder builder) {
        this.placa = builder.placa;
        this.marca = builder.marca;
        this.cor = builder.cor;
        this.valorAluguel = builder.valorAluguel;
    }

    @Override
    public Pedido criarPedido() {
        return new CarroLuxo(placa, marca, cor, valorAluguel);
    }

    public static class Builder {

        private String placa;
        private String marca;
        private String cor;
        private Double valorAluguel;

        public Builder(String placa) {
            this.placa = placa;
        }
        public Builder marca(String marca){
            this.marca = marca;
            return this;
        }
        public Builder cor(String cor){
            this.cor = cor;
            return this;
        }
        public Builder valorAluguel(Double valorAluguel){
            this.valorAluguel = valorAluguel;
            return this;
        }
        public FamiliaFactory build(){
            return new FamiliaFactory(this);
        }
    }
}
