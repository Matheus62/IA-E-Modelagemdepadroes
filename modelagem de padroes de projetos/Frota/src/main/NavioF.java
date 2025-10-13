package main;
/*introduz um metodo via factory para inserir(criar) os navios*/
public interface NavioF {
    Navio inserirNavio();
}
/*
Este é o inicio de um conjunto de classes que é responsável pela criação dos 
diferentes tipos de navios.

NavioF.java: interface que define o contrato para as fábricas concretas.

NavioFF.java[...]NavioSP.java: São as fábricas concretas. 
Cada uma sabe como instanciar um tipo específico de navio.

Padrões de Projeto que representam:

Factory Method: A interface NavioF e suas implementações (NavioFF, etc.) 
definem um método para criar objetos, mas deixam para as subclasses a decisão 
de qual classe concreta instanciar.

Abstract Factory: O conjunto de todas as fábricas pode ser visto como uma 
implementação deste padrão, pois fornece uma interface para criar "famílias" 
de objetos relacionados (diferentes tipos de navios) sem especificar suas 
classes concretas.

*/