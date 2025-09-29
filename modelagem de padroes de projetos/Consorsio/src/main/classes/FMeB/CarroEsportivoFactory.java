package main.classes.FMeB;

import main.classes.carros.Carro;
import main.classes.carros.CarroEsportivo;

public class CarroEsportivoFactory implements CarroFactory{
    private String placa;
    private String marca;
    private String cor;
    private Double valorAluguel;

    private CarroEsportivoFactory(Builder builder) {
        this.placa = builder.placa;
        this.marca = builder.marca;
        this.cor = builder.cor;
        this.valorAluguel = builder.valorAluguel;
    }

    @Override
    public Carro criarCarro() {
        return new CarroEsportivo(placa, marca, cor, valorAluguel);
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
        public CarroEsportivoFactory build(){
            return new CarroEsportivoFactory(this);
        }
    }
}
