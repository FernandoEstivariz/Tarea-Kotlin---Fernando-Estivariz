fun imprimirNumerosImpares(hasta: Int) {
    for (numero in 1..hasta) {
        if (numero % 2 == 0) {
            continue  
        }
        println(numero)  
    }
}

fun main() {
    val limite = 10
    imprimirNumerosImpares(limite)
}
