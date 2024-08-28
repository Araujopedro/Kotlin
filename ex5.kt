fun main(){
    println("Digite sua idade")
    val Idadeinput = readLine() // faz a leitura do print como uma string

    if(Idadeinput == null){
        println("digite um valor valiido")// faz uma verificação se o valor é nulo ou não
        return
    }

    val idade = Idadeinput.toIntOrNull() //converte em int ou nulo

    if (idade == null) { // verifica se deu certo a conversão anterior
        println("idade invalida")
        return // retorna o valor
    }
    if (idade >= 18) {
        println("voce é maior de idade")
    } else {
        println("voce é menor de idade")
    }





}