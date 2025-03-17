//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    var nt: Double?

    var soma: Double = 0.0

    var con: Int = 1

    var media: Double

    while (con <= 6) {
        
        println("Digite a nota $con (0 a 10): ")
        nt = readln().toDoubleOrNull() // Converte para Double ou retorna null

        if (nt != null && nt in 0.0..10.0) { // Verifica se a nota é válida
            soma += nt
            con++
        } else {
            println("Nota inválida! Digite um valor entre 0 e 10.\n")
        }
    }

    media = soma / 6
    println("A média do aluno é: $media\n")
}