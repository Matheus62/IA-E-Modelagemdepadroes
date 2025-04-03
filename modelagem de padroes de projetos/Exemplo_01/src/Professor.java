public class Professor {
    
    private String nome;
    private int qtdaulas;
    private double salario;
    
    public Professor(){
    
        nome = "";
        qtdaulas = 0;
        salario = 0;
        
    }
    public Professor(String nome, int qtdaulas)
    {
        
    this.nome = nome;
    this.qtdaulas = qtdaulas;
    this.salario = 0;
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdaulas() {
        return qtdaulas;
    }

    public void setQtdaulas(int qtdaulas) {
        this.qtdaulas = qtdaulas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcularSalario()
    {
        salario = qtdaulas * 4.5 * 40;
    }
    
    @Override
    public String toString(){
        
        return "nome:" + nome + "\nAulas " + qtdaulas + "\nSalario " + salario;
        
    }
    
}