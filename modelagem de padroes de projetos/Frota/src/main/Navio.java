package main;

public interface Navio {
    /*começo do uso do prototype para criar um padrão para os produtos*/
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