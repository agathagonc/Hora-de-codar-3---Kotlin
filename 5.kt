//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    var n1: Int

    var n2: Int

    var soma: Int = 0

    var quan: Int = 0

    var media: Double

    var i: Int

    println("Escreva o primeiro número (menor): ")

    n1 = readln().toInt()
    println("Escreva o segundo número (maior): ")

    n2 = readln().toInt()

    if (n1 >= n2) {
        println("Erro: O primeiro número deve ser menor que o segundo.")
        return
    }

    i = n1 // Inicializa i com o valor de n1
    while (i <= n2) { // Itera de n1 até n2
        soma += i
        quan++
        i++
    }

    media = soma.toDouble() / quan // Converte soma para Double antes da divisão
    println("A média aritmética dos números entre $n1 e $n2 é: $media")
}