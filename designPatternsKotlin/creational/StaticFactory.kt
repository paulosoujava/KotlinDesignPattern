package designPatternsKotlin.creational

/**
 * Ele fornece um nome melhor para o construtor, o que ele espera e, às vezes, o que ele produz.
Normalmente não esperamos exceções de um construtor. As exceções de um método regular, por outro lado, são totalmente válidas.
Falando em expectativas, esperamos que o construtor seja rápido.
 Bom para:
 Caching
    O Static Factory Method pode fornecer armazenamento em cache,
    como Long realmente faz. Em vez de sempre retornar uma nova instância
    para qualquer valor, valueOf () verifica no cache se esse valor já foi analisado.
    Se for, ele retorna uma instância em cache. Chamar repetidamente o método de fábrica
    estático com os mesmos valores pode produzir menos lixo para coleta do que usar construtores
    o tempo todo.

 Subclassing
Ao chamar o construtor, sempre instanciamos a classe que especificamos.
Por outro lado, chamar um Método de Fábrica Estático pode produzir qualquer
uma das instâncias da classe ou uma de suas subclasses. Chegaremos a isso
depois de discutir a implementação desse padrão de design no Kotlin.
 */
class NumberMaster{
    companion object{
        fun valueOf(hopeFullNumber: String):Long {
            return hopeFullNumber.toLong()
        }
    }
}
private class MyTest private constructor(){
    companion object {
        fun create():MyTest{
            return MyTest()
        }
    }
    fun show() = "show"
}

fun main() {
    val instance = MyTest.create()
    println(instance.show())
    println(MyTest.create().show())
    println(NumberMaster.valueOf("123"))
}