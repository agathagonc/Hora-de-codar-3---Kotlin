//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Escreva um programa para imprimir todas as tabuadas de 1 a N. N será informado pelo usuário.

    println("Digite um valor para N (maior que zero):")
    
    val N = readln().toIntOrNull()


    if (N != null && N > 0) {

        for (i in 1..N) {
            println("\nTabuada do $i:\n") // Título da tabuada

            for (j in 1..10) {
                println("$i x $j = ${i * j}")
            }
        }
    } else {
        println("Valor inválido! Certifique-se de que N é um número maior que zero.")
    }
}