public class funcionarios implements Salarios{
    private String nome;
    private int qtdHoras;
    private double valorHora;
    private double salario;
    
    public funcionarios(){
    nome = "";
    qtdHoras = 0;
    valorHora = 0;
    salario = 0;
    }

    public funcionarios(String nome, int qtdHoras, double valorHora) {
        this.nome = nome;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
        this.salario = 0;
    }

    public double getSalario() {
        salario = calcularSalario();
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return qtdHoras * valorHora;
    }

    @Override
    public double reajustarSalario(double salarioAtual) {
        return salarioAtual * 1.10;
    }
    
    
}
