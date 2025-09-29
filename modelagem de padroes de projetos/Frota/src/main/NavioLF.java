package main;

public class NavioLF implements NavioF {

    private String nome;
    private String modelo;
    private String cor;
    private Double valorOperacao;

    private NavioLF(Builder builder) {
        this.nome = builder.nome;
        this.modelo = builder.modelo;
        this.cor = builder.cor;
        this.valorOperacao = builder.valorOperacao;
    }

    @Override
    public Navio inserirNavio() {
        return new NavioSP(nome, modelo, cor, valorOperacao);
    }

    public static class Builder {

        private String nome;
        private String modelo;
        private String cor;
        private Double valorOperacao;

        public Builder(String nome) {
            this.nome = nome;
        }

        public Builder marca(String Modelo) {
            this.modelo = Modelo;
            return this;
        }

        public Builder cor(String cor) {
            this.cor = cor;
            return this;
        }

        public Builder valorAluguel(Double valorOperacao) {
            this.valorOperacao = valorOperacao;
            return this;
        }

        public NavioLF build() {
            return new NavioLF(this);
        }
    }

}
