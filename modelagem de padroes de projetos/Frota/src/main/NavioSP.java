package main;

public class NavioSP implements Navio, Cloneable {

    private static Long count = (long) 0;
    private Long id;
    private String Nome;
    private String modelo;
    private String cor;
    private Double valorOperacao;
    private String status;

    public NavioSP(String placa, String marca, String cor, Double valorAluguel) {
        this.id = count;
        count++;
        this.Nome = placa;
        this.modelo = marca;
        this.cor = cor;
        this.valorOperacao = valorAluguel;
        this.status = "Disponivel";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
    return new NavioSP(Nome, modelo, cor, valorOperacao);
    }
    
    @Override
    public void alugar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
    public Double getValorOperac() {
        return valorOperacao;
    }

    public void setValorOperacao(Double valorOperacao) {
        this.valorOperacao = valorOperacao;
    }

    @Override
    public String getTipo() {
        return "Navio Furtivo";
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
