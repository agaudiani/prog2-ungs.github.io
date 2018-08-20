package prog2.prac0.test;

import static org.junit.Assert.*;

import org.junit.Test;

import prog2.prac0.Prac0;

public class TestArrPico
{
	@Test
	public void picoMedio() {
		int arreglo[] = { 1, 3, 5, 2, 0 };
		assertEquals(2, Prac0.indicePico(arreglo));
	}

	@Test
	public void picoIzquierdo() {
		int arreglo[] = { 1, 5, 4, 3, 2, 1 };
		assertEquals(1, Prac0.indicePico(arreglo));
	}

	@Test
	public void picoDerecho() {
		int arreglo[] = { 1, 2, 3, 4, 5, 0 };
		assertEquals(4, Prac0.indicePico(arreglo));
	}

	@Test
	public void tresElementos() {
		int arreglo[] = { 20, 30, 15 };
		assertEquals(1, Prac0.indicePico(arreglo));
	}

	@Test
	public void numerosNegativos() {
		int arreglo[] = { -99, -97, -95, -96, -98 };
		assertEquals(2, Prac0.indicePico(arreglo));
	}

	@Test
	public void todoDescendente() {
		int arreglo5[] = { 5, 4, 3, 2, 1 };
		int arreglo3[] = { 5, 4, 3 };
		assertEquals(-1, Prac0.indicePico(arreglo5));
		assertEquals(-1, Prac0.indicePico(arreglo3));
	}

	@Test
	public void todoAscendente() {
		int arreglo5[] = { 1, 2, 3, 4, 5 };
		int arreglo3[] = { 1, 2, 3 };
		assertEquals(-1, Prac0.indicePico(arreglo5));
		assertEquals(-1, Prac0.indicePico(arreglo3));
	}

	@Test
	public void fallaDescenso() {
		int arreglo[] = { 10, 20, 30, 40, 25, 10, 15 };
		assertEquals(-1, Prac0.indicePico(arreglo));
	}

	@Test
	public void noCrecienteEstricto() {
		int arreglo[] = { 10, 20, 30, 30, 40, 25, 10, 5 };
		assertEquals(-1, Prac0.indicePico(arreglo));
	}

	@Test
	public void noDecrecienteEstricto() {
		int arreglo[] = { 10, 20, 30, 40, 25, 10, 10, 5 };
		assertEquals(-1, Prac0.indicePico(arreglo));
	}

	@Test
	public void arregloPocosElementosNoUnimodal() {
		int arreglo0[] = {};
		int arreglo1[] = { 1 };
		int arreglo2a[] = { 1, 2 };
		int arreglo2b[] = { 3, 2 };
		assertEquals(-1, Prac0.indicePico(arreglo0));
		assertEquals(-1, Prac0.indicePico(arreglo1));
		assertEquals(-1, Prac0.indicePico(arreglo2a));
		assertEquals(-1, Prac0.indicePico(arreglo2b));
	}
}
