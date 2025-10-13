package main;
/* 
    Interface que cria uma classe principal de modelo de dados (o Model). 
    Ela define o que é um "Navio", contendo todos os seus atributos, como nome, 
    tipo, modelo, Id, cor, valor da operação e o status.
    
    Esta interface implementa o o primeiro passo do prototype que permite com
    que ela possa ser copiada, e o buider que Facilita a criação de um objeto 
    Navio que possui muitos atributos. Em vez de um construtor com uma longa 
    lista de parâmetros, o padrão Builder permite construir o objeto passo a 
    passo, tornando o código mais limpo e legível. 
    
*/
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