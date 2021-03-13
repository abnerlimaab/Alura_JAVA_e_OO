package br.com.caelum.matematica;

import org.junit.*;

public class TestaMatematicaMaluca {
	@Test
	public void testaMaiorQueTrinta() {
		var maiorQueTrinta = new MatematicaMaluca().contaMaluca(31);
		Assert.assertEquals(31 * 4, maiorQueTrinta, 0.00001);
	}
	
	
}
