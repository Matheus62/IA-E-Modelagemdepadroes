package main.classes.produtos;

public interface Pedido {
    void alugar();
    String getTipo();
    Long getId();
    String getPlaca();
    String getMarca();
    String getCor();
    Double getValorAluguel();
    String getStatus();
    void setStatus(String status);
    Object clone() throws CloneNotSupportedException;
}