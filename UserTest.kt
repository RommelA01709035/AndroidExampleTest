package com.example.test

import com.google.firebase.firestore.auth.User
import org.junit.Assert.*
import org.junit.Test

    class UserTest {
        // Método que verifica si la edad es mayor o igual a 18
        fun isAdult(edad: Int): Boolean {
            return edad >= 18
        }

        fun isYounger(edad: Int): Boolean {
            return edad <= 17
        }
        @Test
        fun testIsAdult() {
            val edad = 20
            assertTrue("La persona debería ser mayor de edad", isAdult(edad))
        }

        @Test
        fun testIsYounger() {
            val edad = 16
            assertTrue("La persona es más joven", isYounger(edad))
        }

        fun isOkayMetric(valor: Double): Boolean {
            return valor >= 5.00
        }

        @Test
        fun testIsOkayMetric(){
            var valor = 4.999
            assertFalse("Esta okay ", isOkayMetric(valor))

            valor = 5.00
            assertTrue("Es mayor", isOkayMetric(valor))
        }

    }




