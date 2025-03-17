//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    var soma: Int = 0

    var quan: Int = 0

    var i: Int = 15

    var media: Double

    while (i <= 100) {
        soma += i
        quan++
        i++
    }

    media = soma.toDouble() / quan

    println("A média aritmética dos números entre 15 e 100 é: $media")
}


