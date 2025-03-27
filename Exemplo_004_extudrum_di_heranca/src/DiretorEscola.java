public class DiretorEscola extends Professores{

    public DiretorEscola() {
    }

    public DiretorEscola(int qtdAulas, double vhAulas, int matricula, String nome) {
        super(qtdAulas, vhAulas, matricula, nome);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.5;
    }

    @Override
    public String toString() {
        return "Diretor da Escola";
    }
    
    
    
}
