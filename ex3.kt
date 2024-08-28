//descubra se um numero é par ou impar

fun divid(a: Int): Int {
    return a % 2
}

fun main(){
    var num = 55
    
    var conta = divid(num)
    if (conta == 0)
    println("O número é par")
    else
    println("o numero é impar")
}