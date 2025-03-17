//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    var n1: Double

    var n2: Double

    var resul: Double

    println("Digite o primeiro número: ")
    n1 = readln().toDouble()
    println("Digite o segundo número(não pode ser ser menor ou igual a 0: )")
    n2 = readln().toDouble()

    while(n2 <= 0){
        println ("O segundo número não pode ser menor ou igual a 0. Digite novamente: ")
        n2 = readln().toDouble()
        resul = n1 /n2
        print("O resultado da divisão é: $resul")
    }
    resul = n1 /n2
    print("O resultado da divisão é: $resul")
}