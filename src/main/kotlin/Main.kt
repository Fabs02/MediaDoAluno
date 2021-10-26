fun main(args: Array<String>) {
    var notaBim1 = 0.0
    var notaBim2 = 0.0
    var notaBim3 = 0.0
    var notaBim4 = 0.0
    var media = 0.0

    print("Digite a nota do primeiro bimestre: ")
    notaBim1 = readLine()!!.toDouble()
    print("Digite a nota do segundo bimestre: ")
    notaBim2 = readLine()!!.toDouble()
    print("Digite a nota do terceiro bimestre: ")
    notaBim3 = readLine()!!.toDouble()
    print("Digite a nota do quarto bimestre: ")
    notaBim4 = readLine()!!.toDouble()

    media = (notaBim1 + notaBim2 + notaBim3 + notaBim4) / 4

    println("Sua média é : $media")

    if(media >= 0 && media <= 4) {
        println("Reprovado")
    }else if(media > 4 && media <= 5){
        println("Média regular")
    }else if(media > 5 && media <= 8) {
        println("Média boa")
    }else if(media > 8 && media <= 10) {
        println("Média excelente")
    }else{
        println("Valor inválido")
    }
}