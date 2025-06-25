public class Principal {
    public static void main(String[] args){
    
    Moto M = new Moto("Honda Hornet","XYZ-5T78");
    Carro C = new Carro("Fiat Pulse","EPC-1A34");
    
    C.ExibirDados();
    //System.out.println("Valor do Servico: R$" + C.calcularServico());
    
    
    M.ExibirDados();
    //System.out.println("Valor do Servico: R$" + M.calcularServico());
    }
}
