package main;

public class CarroEF implements CarroF{
    private String placa;
    private String marca;
    private String cor;
    private Double valorAluguel;

    private CarroEF(Builder builder) {
        this.placa = builder.placa;
        this.marca = builder.marca;
        this.cor = builder.cor;
        this.valorAluguel = builder.valorAluguel;
    }

    @Override
    public Carro inserirCarro() {
        return new CarroEP(placa, marca, cor, valorAluguel);
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
        public CarroEF build(){
            return new CarroEF(this);
        }
    }
}
