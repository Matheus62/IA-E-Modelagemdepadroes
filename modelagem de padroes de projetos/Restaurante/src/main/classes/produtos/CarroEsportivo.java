package main.classes.produtos;

public class CarroEsportivo implements Pedido, Cloneable{
    private static Long count = (long) 0;
    private Long id;
    private String placa;
    private String marca;
    private String cor;
    private Double valorAluguel;
    private String status;

    public CarroEsportivo(String placa, String marca, String cor, Double valorAluguel) {
        this.id = count;
        count++;
        this.placa = placa;
        this.marca = marca;
        this.cor = cor;
        this.valorAluguel = valorAluguel;
        this.status = "Disponivel";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
    return new CarroEsportivo(placa, marca, cor, valorAluguel);
    }

    
    
    @Override
    public void alugar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public Double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(Double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    @Override
    public String getTipo() {
        return "Carro Esportivo";
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
