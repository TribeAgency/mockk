package io.mockk.core

import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DefaultMethodTest {
    @Test
    fun `should mock ClassImplementingInterfaceWithoutDefaultMethod class`() {
        val nonReproducible = mockk<ClassImplementingInterfaceWithoutDefaultMethod>()
        every { nonReproducible.foo() } returns 12
        assertEquals(12, nonReproducible.foo())
    }

    @Test
    fun `should mock ClassImplementingInterfaceWithDefaultMethod class`() {
        val reproducible = mockk<ClassImplementingInterfaceWithDefaultMethod>()
        every { reproducible.foo() } returns 12
        assertEquals(12, reproducible.foo())
    }
}