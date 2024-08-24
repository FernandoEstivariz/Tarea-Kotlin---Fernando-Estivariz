fun buscarElemento(lista: List<Int>, elemento: Int): Boolean {
    var encontrado = false
    for (item in lista) {
        if (item == elemento) {
            encontrado = true
            break  
        }
    }
    return encontrado
}

fun main() {
    val listaDeNumeros = listOf(1, 2, 3, 4, 5)
    val elementoBuscado = 3
    
    val encontrado = buscarElemento(listaDeNumeros, elementoBuscado)
    
    if (encontrado) {
        println("El elemento $elementoBuscado está en la lista.")
    } else {
        println("El elemento $elementoBuscado no está en la lista.")
    }
}
