public class Professores extends Funcionarios{
    
    private int qtdAulas;
    private double vhAulas;
    
    public Professores(){
    qtdAulas = 0;
    vhAulas = 10.0 ;
    }

    public Professores(int qtdAulas, double VHAulas, int matricula, String nome) 
    {
        
        super(matricula, nome);
        
        this.qtdAulas = qtdAulas;
        this.vhAulas = VHAulas;
    }

    public int getQtdAulas() {
        return qtdAulas;
    }

    public void setQtdAulas(int qtdAulas) {
        this.qtdAulas = qtdAulas;
    }

    public double getVhAulas() {
        return vhAulas;
    }

    public void setVhAulas(double vhAulas) {
        this.vhAulas = vhAulas;
    }

    @Override
    public double calcularSalario() {
        return qtdAulas * vhAulas * 4.5;
    }

    @Override
    public String toString() {
        return "Professores";
    }
    
    
    
}
