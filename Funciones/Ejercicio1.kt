fun sumaNumerosPositivos(numeros: List<Int>): Int {
    var suma = 0
    for (numero in numeros) {
        if (numero < 0) {
            continue  // Ignora los números negativos
        }
        suma += numero  
    }
    return suma
}

fun main() {
    val listaDeNumeros = listOf(1, -2, 3, -4, 5)
    val resultado = sumaNumerosPositivos(listaDeNumeros)
    println("La suma de los números positivos es: $resultado")
}
