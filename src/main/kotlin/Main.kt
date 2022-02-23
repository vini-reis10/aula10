fun main() {
    //atividade1()
    //atividade2()
    //atividade3()
    atividade4()
}

fun atividade1(): Unit {
    println("Digite a primeira nota:")

    val nota1 = readLine()!!.toFloat()

    println("Digite a segunda nota:")
    val nota2 = readLine()!!.toFloat()

    val media = (nota1 + nota2) / 2
    println("a nota final é: $media")

    if (media >= 9)
        println("Aprovado com excelencia ♥")
    else if (media >= 6) {
        println("APROVADO!")

    } else if (media >= 4)
        println("Recuperação +-")
    else
        println("REPROVADO!")


}

fun atividade2(): Unit {
    println("Qual genero você se identifica?\nM - Masculino\nF - Feminino\nO - Outros")
    val genero = readLine()!!

    if (genero.equals("M",true,))
        println("Seja bem vindo, Senhor!")
    else if (genero.equals("f",true))
        println("Seja bem vinda, Senhora!")
    else if(genero.equals("o",true))
        println("Seja bem vindx, Senhore!")
    else
        println("Genero invalido!")



}

fun atividade3():Unit {
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toFloat()
    println("Digite o segundo número:")
    val num2 = readLine()!!.toFloat()
    println("Escolha a operacao: \n+ - soma\n- - subtração\n* - multiplicação\n/ - divisão")

    when(readLine()!!){
        "+" -> println("A soma é: ${num1 + num2}")
        "-" -> println("A subtração é: ${num1 - num2}")
        "* "-> println("A multiplicação é: ${num1 * num2}")
        "/" -> println("A divisão é: ${num1 / num2}")

    }
}

fun atividade4():Unit{
    println("Digite o total da compra:")
    val totalDaCompra = readLine()!!.toFloat()
    println("Escolha o tipo de cliente: \n1 - cliente comum\n2 - Cliente VIP\n3 - Funcionário")

    when(readLine()!!.toInt()){
        1 -> println("O total da compra é $totalDaCompra")
        2 -> println("O total da compra é ${totalDaCompra - totalDaCompra * 0.05}")
        3 -> println("O total da compra é ${totalDaCompra - totalDaCompra * 0.10}")
        else -> println("Tipo de cliente invalido")
        }
    }
