fun eliminarVocales(texto: String): String {
    val vocales = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    val resultado = StringBuilder()
    
    for (caracter in texto) {
        if (caracter in vocales) {
            continue  
        }
        resultado.append(caracter)  
    }
    
    return resultado.toString()
}

fun main() {
    val textoOriginal = "Fernando Gustavo Estivariz Buendia"
    val textoSinVocales = eliminarVocales(textoOriginal)
    println(textoSinVocales)  
}
