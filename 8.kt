//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Ler um valor N e imprimir todos os valores inteiros entre 1 e N. Considere que o N será sempre maior que ZERO.
    
    var contador: Int


    println("Insira um número: ")
    contador = readln().toInt()

    if (contador != null && contador > 0) {

        for (i in 1..contador) {
            println(i)
        }
    } else {
        println("Valor inválido! Certifique-se de que N é um número maior que zero.")
    }
}