package prog2.prac0.test;

import static org.junit.Assert.*;

import org.junit.Test;

import prog2.prac0.Prac0;

public class TestAccumMatriz
{
	@Test
	public void ejemploConsigna1() {
		int[][] mtx = {{1, 2, 3}, {4, 5, 6}};
		assertTrue(Prac0.mayorDiversidad(mtx));
	}

	@Test
	public void ejemploConsigna2() {
		int[][] mtx = {{1, 2, 3}, {4, 5, 5}};
		assertFalse(Prac0.mayorDiversidad(mtx));
	}

	@Test
	public void ejemploConsigna3() {
		int[][] mtx = {{1, 2, 3}, {2, 4, 6}};
		assertFalse(Prac0.mayorDiversidad(mtx));
	}
	
	// TODO: añadir más tests.
}
