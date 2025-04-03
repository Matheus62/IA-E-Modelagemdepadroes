public class Principal {
    
    public static void main(String[] args) {
        
        Professor objeto1, objeto2;
        
        objeto1 = new Professor();
        objeto1.setNome("Guilherme");
        objeto1.setQtdaulas(48);
        objeto1.calcularSalario();
        System.out.println(objeto1);
        
        objeto2 = new Professor("Nidia", 20);
        objeto2.calcularSalario();
        System.out.println(objeto2);
        
    }
    
        
}
