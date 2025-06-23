public class Principal {
    public static void main(){
    funcionarios maria = new funcionarios();
    maria.setNome("Maria");
    maria.setQtdHoras(8);
    maria.setValorHora(40);
    
    System.out.println("Salario: " + maria.getSalario());
    }
}
