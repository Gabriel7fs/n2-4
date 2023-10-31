package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class N2ApplicationTests {

	/**
	 * Verifica se a função digital_root retorna o dígito correto para um número com
	 * um único dígito.
	 */
	@Test
	public void testDigitalRootOneDigit() {
		int n = 1;

		int result = digitalRoot(n);

		// Então o resultado deve ser o próprio número
		assertEquals(1, result, "O resultado deve ser o próprio número");
	}

	/**
	 * Verifica se a função digital_root retorna o dígito correto para um número de
	 * dois dígitos.
	 */
	@Test
	public void testDigitalRootTwoDigits() {
		int n = 16;

		int result = digitalRoot(n);

		// Então o resultado deve ser o dígito da raiz digital
		assertEquals(7, result, "O resultado deve ser o dígito da raiz digital");
	}

	/**
	 * Verifica se a função digital_root retorna o dígito correto para um número de
	 * vários dígitos.
	 */
	@Test
	public void testDigitalRootMultipleDigits() {
		int n = 942;

		int result = digitalRoot(n);

		// Então o resultado deve ser o dígito da raiz digital
		assertEquals(6, result, "O resultado deve ser o dígito da raiz digital");
	}

	/**
	 * Verifica se a função digital_root retorna o valor correto para um número
	 * negativo.
	 */
	@Test
	public void testDigitalRootNegativeNumber() {
		int n = -1;

		int result = digitalRoot(n);

		// Então o resultado deve ser -1
		assertEquals(-1, result, "O resultado deve ser -1");
	}

	private static int digitalRoot(int n) {
		if (n < 10) {
			return n;
		}

		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}

		return digitalRoot(sum);
	}
}
