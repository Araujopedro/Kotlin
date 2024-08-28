// ex para mostra o quadrado de um numero

fun quadrado(a: Int): Int{
    return(a*a)
}

fun main(){
    val a = 50
    val b = 40
    val c = 30

    val calculo = quadrado(a)
    val calculo2 = quadrado(b)
    val calculo3 = quadrado(c)

    println("os valores são $calculo , $calculo2 , $calculo3")
}