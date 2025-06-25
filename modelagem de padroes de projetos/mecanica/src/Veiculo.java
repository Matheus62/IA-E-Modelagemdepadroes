public abstract class Veiculo implements Servico {
    
    private String modelo;
    private String placa;
    
    public Veiculo(){
        modelo = "";
        placa = "";
    }

    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void ExibirDados(){
        //String mod = String.format("modelo: %s", modelo);
        
        
        String mod = String.format("modelo: ");
        System.out.println(mod + modelo);
        String plac = String.format(" placa: ");
        System.out.println(plac + placa);
        
        System.out.println("Valor do Servico: R$" + calcularServico());
    }    
    @Override
    public abstract double calcularServico();
}


