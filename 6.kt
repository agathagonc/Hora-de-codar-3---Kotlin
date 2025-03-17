//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    var nt1: Double

    var nt2: Double

    var media: Double

    var res:

    var apro: Int = 0

    do {
        // Entrada de dados

        println("Digite a primeira nota: ")

        nt1 = readln().toDouble()

        println("Digite a segunda nota: ")

        nt2 = readln().toDouble()

        // Cálculo da média


        media = (nt1 + nt2) / 2
        println("Média final: $media")

        // Verificação de aprovação


        if (media >= 9.5) {
            println("Aluno aprovado!")
            apro++
        } else {
            println("Aluno reprovado.")
        }

        // Perguntar se deseja continuar

        println("Calcular a média de outro aluno? (Sim/Não)")
        res = readln()
    } while (res.equals("SIM", ignoreCase = true) || res.equals("S", ignoreCase = true))

    // Resultado final


    println("Quantidade de alunos aprovados: $apro\n")
}