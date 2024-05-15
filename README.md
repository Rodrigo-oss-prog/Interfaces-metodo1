# Interfaces JAVA

Em Java, uma interface é um tipo de referência semelhante a uma classe e é coleção de métodos abstratos (métodos sem corpo) e constantes. Uma classe implementa uma interface usando a palavra-chave implements. Ao implementar uma interface, a classe está essencialmente assinando um contrato, concordando em executar os métodos definidos na interface.

Aqui estão alguns pontos-chave sobre interfaces em Java:

* Métodos abstratos: Todos os métodos de uma interface são implicitamente abstratos e públicos. Eles não contêm um corpo e devem ser implementados na classe que implementa a interface.
* Variáveis: Todas as variáveis definidas em uma interface são públicas, estáticas e finais por padrão. Ou seja, são constantes.
* Implementação de múltiplas interfaces: Em Java, uma classe pode implementar várias interfaces, o que é útil porque Java não suporta herança múltipla de classes.
* Interfaces de marcação: Uma interface sem campos ou métodos é conhecida como uma interface de marcação. Ela é usada para fornecer informações úteis para a JVM ou qualquer outra entidade aplicável.
* Métodos padrão e estáticos: A partir do Java 8, as interfaces podem conter métodos padrão (métodos com corpo) e métodos estáticos.
* Interfaces funcionais: No Java 8, uma interface com exatamente um método abstrato é conhecida como Interface Funcional. Elas são usadas extensivamente em expressões lambda.

Exemplo:

````
interface ExemploInterface {
    void metodoAbstrato();
}

class ExemploClasse implements ExemploInterface {
    public void metodoAbstrato() {
        System.out.println("Método abstrato implementado");
    }
}


````
