package main;

public interface Navio {
    
    void alugar();
    
    String getTipo();
    
    Long getId();
    
    String getNome();
    
    String getModelo();
    
    String getCor();
    
    Double getValorOperac();
    
    String getStatus();
    
    void setStatus(String status);
    
    Object clone() throws CloneNotSupportedException;
}