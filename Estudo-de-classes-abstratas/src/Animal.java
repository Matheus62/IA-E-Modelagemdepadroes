public abstract class Animal {
    private String nome;
    
    public Animal()
    {
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void exibirDados()
    {
        String msg = String.format("este animal é o()",getNome());
        System.out.println("");
    }
    public abstract void emitirSom(); 
}
