public class Gato extends Animal
{

    public Gato(String nome) {
        super(nome);
    }
    
    @Override
    public void emitirSom(){
        String msg = String.format("A %s é um cachorro que faz Au Au", getNome());
        System.out.println(msg);
    }
}
