package com.example.kotlin_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.kotlin_android.ui.theme.Kotlin_AndroidTheme

class MainActivity : ComponentActivity() {

    companion object {
        const val APP_NAME = "KotlinApp"
        const val APP_VERSION = "1.0.0"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Kotlin_AndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        Text("Ejercicio 1: Variables y constantes")
                        actividad1()

                        Text("Ejercicio 2: Tipos numéricos")
                        actividad2()

                        Text("Ejercicio 3: if como expresión")
                        actividad3()

                        Text("Ejercicio 4: when con rangos")
                        actividad4()

                        Text("Ejercicio 5: Bucles while y for")
                        actividad5()

                        Text("Ejercicio 6: Colecciones")
                        actividad6()

                        Text("Ejercicio 7: Null Safety")
                        ejercicio7()

                        Text("Ejercicio 8: Funciones puras")
                        ejercicio8()

                        Text("Ejercicio 9: Clases vs Data Class")
                        ejercicio9()
                    }
                }
            }
        }
    }

    // Ejercicio 1
    fun actividad1() {
        var contador: Int = 10
        var mensaje: String = "Bienvenido a Kotlin"
        val pi: Double = 3.1416
        val esActivo: Boolean = true

        println("📱 $APP_NAME v$APP_VERSION")
        println("Contador: $contador")
        println("Mensaje: $mensaje")
        println("Constantes: pi = $pi, activo = $esActivo")
    }

    // Ejercicio 2
    fun actividad2() {
        val edad: Int = 25
        val poblacion: Long = 33_000_000L
        val temperatura: Float = 36.6f
        val gravedad: Double = 9.80665

        println("Edad (Int): $edad")
        println("Población (Long): $poblacion")
        println("Temperatura (Float): $temperatura")
        println("Gravedad (Double): $gravedad")
    }

    // Ejercicio 3
    fun calificar(nota: Int): String {
        return if (nota >= 11) "Aprobado" else "Desaprobado"
    }

    fun actividad3() {
        val notas = listOf(8, 11, 14, 10, 17)
        for (n in notas) {
            println("Nota $n → ${calificar(n)}")
        }
    }

    // Ejercicio 4
    fun clasificarEdad(edad: Int): String {
        return when (edad) {
            in 0..12 -> "Niño"
            in 13..17 -> "Adolescente"
            in 18..59 -> "Adulto"
            else -> "Mayor"
        }
    }

    fun actividad4() {
        val edades = listOf(5, 14, 30, 65)
        for (edad in edades) {
            println("Edad $edad → ${clasificarEdad(edad)}")
        }
    }

    // Ejercicio 5
    fun tablaWhile(n: Int) {
        var i = 1
        while (i <= 10) {
            println("$n x $i = ${n * i}")
            i++
        }
    }

    fun tablaFor(n: Int) {
        for (i in 1..10) {
            println("$n x $i = ${n * i}")
        }
    }

    fun actividad5() {
        println("Tabla con while:")
        tablaWhile(5)
        println("Tabla con for:")
        tablaFor(5)
    }

    // Ejercicio 6
    data class Producto(val id: Int, val nombre: String, val precio: Double, val stock: Int)

    fun actividad6() {
        val productos = listOf(
            Producto(1, "Mouse", 25.0, 10),
            Producto(2, "Teclado", 45.0, 0),
            Producto(3, "Monitor", 150.0, 5),
            Producto(4, "USB", 15.0, 0),
            Producto(5, "Laptop", 1200.0, 2)
        )

        val nombresDisponibles = productos
            .filter { it.stock > 0 }
            .map { it.nombre }

        val totalPrecio = productos.sumOf { it.precio }
        val sinStock = productos.count { it.stock == 0 }

        println("🛒 Productos disponibles: $nombresDisponibles")
        println("💰 Total precios: $totalPrecio")
        println("❌ Sin stock: $sinStock")
    }

    // Ejercicio 7
    fun aEnteroSeguro(s: String): Int? {
        return s.toIntOrNull()
    }

    fun ejercicio7() {
        val entradas = listOf("123", "abc", "42", "", "9999")
        for (entrada in entradas) {
            val resultado = aEnteroSeguro(entrada) ?: -1
            println("Entrada: '$entrada' → Resultado: $resultado")
        }
    }

    // Ejercicio 8
    fun esPrimo(n: Int): Boolean {
        if (n < 2) return false
        for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) return false
        }
        return true
    }

    fun fibonacci(n: Int): List<Int> {
        if (n <= 0) return emptyList()
        val secuencia = mutableListOf(0, 1)
        while (secuencia.size < n) {
            val siguiente = secuencia[secuencia.size - 1] + secuencia[secuencia.size - 2]
            secuencia.add(siguiente)
        }
        return secuencia.take(n)
    }

    fun ejercicio8() {
        println("🔢 Fibonacci(10): ${fibonacci(10)}")
        val numeros = listOf(7, 10, 13)
        for (n in numeros) {
            println("¿$n es primo? → ${esPrimo(n)}")
        }
    }

    // Ejercicio 9
    class Persona(val nombre: String, var edad: Int) {
        fun cumplirAnios() {
            edad++
        }

        fun presentacion(): String {
            return "Hola, soy $nombre y tengo $edad años."
        }
    }

    data class Usuario(val nombre: String, val edad: Int)

    fun ejercicio9() {
        val persona = Persona("Erick", 25)
        persona.cumplirAnios()
        println(persona.presentacion())

        val usuario1 = Usuario("Erick", 26)
        val usuario2 = usuario1.copy(edad = 27)
        println("Usuario1: $usuario1")
        println("Usuario2 (copia): $usuario2")
        println("¿Son iguales? → ${usuario1 == usuario2}")
    }
}