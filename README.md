# 📱 Kotlin Android - Ejercicios Fundamentales

Este proyecto contiene una serie de ejercicios prácticos escritos en Kotlin, integrados en una aplicación Android con Jetpack Compose. Cada ejercicio está diseñado para reforzar conceptos clave del lenguaje, desde variables hasta programación funcional y clases.

---

## 🧠 Objetivo

Dominar las bases de Kotlin aplicadas al desarrollo Android, incluyendo:

- Tipos de datos y estructuras de control
- Null safety y funciones puras
- Clases, data classes y colecciones
- Buenas prácticas de legibilidad y expresividad

---

## 🛠️ Estructura del Proyecto

- `MainActivity.kt`: Contiene todos los ejercicios del 1 al 9.
- `Kotlin_AndroidTheme`: Tema visual aplicado a la interfaz.
- `Scaffold + Column + Text`: Composición básica para mostrar resultados en pantalla.
- `Logcat`: Se utiliza para imprimir resultados de cada ejercicio.

---

## 📘 Ejercicios y Reflexiones

### 1️⃣ Variables y constantes

- Se usaron `const val` para definir `APP_NAME` y `APP_VERSION`.
- Se declararon variables con `var` y constantes con `val` usando tipos explícitos.
- 🔍 **Reflexión:** `val` no puede ser reasignado porque representa una referencia inmutable. Esto mejora la seguridad del código y evita errores por cambios inesperados.

---

### 2️⃣ Tipos numéricos

- Se trabajó con `Int`, `Long`, `Float` y `Double`, usando sufijos `L` y `f`.
- 🔍 **Reflexión:** `Float` es útil cuando se requiere menos precisión y menor uso de memoria (por ejemplo, en sensores). `Double` es preferible para cálculos más precisos como estadísticas o finanzas.

---

### 3️⃣ if como expresión

- Se implementó `fun calificar(nota: Int): String` usando `if` como expresión.
- Se probó con 5 valores distintos.
- 🔍 **Reflexión:** Usar `if` como expresión permite escribir código más conciso y expresivo, retornando directamente un valor sin necesidad de bloques adicionales.

---

### 4️⃣ when con rangos

- Se implementó `fun clasificarEdad(edad: Int): String` usando rangos con `in`.
- 🔍 **Reflexión:** `when` con rangos mejora la legibilidad y permite clasificaciones claras, ideal para lógica de negocio como segmentación por edad.

---

### 5️⃣ Bucles while y for

- Se generó la tabla de multiplicar con `while` y `for`.
- 🔍 **Reflexión:** El bucle `for` es más legible cuando se conoce el rango exacto. `while` ofrece más control cuando la condición depende de lógica interna.

---

### 6️⃣ Colecciones

- Se creó `data class Producto` con `id`, `nombre`, `precio` y `stock`.
- Se aplicaron `filter`, `map`, `sumOf` y `count` sobre una lista inmutable.
- 🔍 **Reflexión:** Kotlin permite trabajar con colecciones de forma declarativa. Esto hace que el código sea más limpio, expresivo y fácil de mantener.

---

### 7️⃣ Null Safety en práctica

- Se implementó `fun aEnteroSeguro(s: String): Int?` usando `toIntOrNull()` y operador Elvis `?:`.
- 🔍 **Reflexión:** Kotlin ofrece herramientas poderosas para evitar errores por valores nulos. El operador Elvis permite asignar valores por defecto de forma segura.

---

### 8️⃣ Funciones puras

- Se implementaron `fun esPrimo(n: Int): Boolean` y `fun fibonacci(n: Int): List<Int>`.
- 🔍 **Reflexión:** Las funciones puras no dependen de estado externo ni lo modifican. Son predecibles, fáciles de testear y fundamentales para programación funcional.

---

### 9️⃣ Clases vs Data Class

- Se creó una clase regular `Persona` con métodos personalizados.
- Se comparó con `data class Usuario` usando `copy()` y `==`.
- 🔍 **Reflexión:** Las `data class` generan automáticamente métodos útiles como `equals()`, `hashCode()` y `copy()`, lo que las hace ideales para representar datos. Las clases regulares ofrecen más control sobre comportamiento.

---

## 📷 Capturas y Resultados

Los resultados de cada ejercicio se imprimen en Logcat. Se recomienda ejecutar la app en modo debug y observar la salida para verificar el comportamiento esperado.

---

## ✨ Recomendaciones

- Usa cada ejercicio como base para crear componentes visuales con Jetpack Compose.
- Agrega navegación entre ejercicios si deseas una experiencia más interactiva.
- Documenta tus reflexiones y aprendizajes directamente en este archivo para futuras referencias.

---

## 👨‍💻 Autor

**Kelman** — Desarrollador Android apasionado por Kotlin, Jetpack Compose y la creación de interfaces limpias, interactivas y funcionales.

---
