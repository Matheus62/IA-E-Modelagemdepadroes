public class Vaca extends Animal
{

    public Vaca(String nome) {
        super(nome);
    }
    
    @Override
    public void emitirSom(){
        String msg = String.format("A %s é um cachorro que faz Au Au", getNome());
        System.out.println(msg);
    }
}
