public class Moto extends Veiculo {
    public Moto(String modelo, String placa){
        super(modelo, placa);
    }
    
    @Override
    public double calcularServico(){
    return 150;
    }
}
