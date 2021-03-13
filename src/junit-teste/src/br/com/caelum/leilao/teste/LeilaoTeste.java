package br.com.caelum.leilao.teste;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import br.com.caelum.leilao.builder.CriadorDeLeilao;
import br.com.caelum.leilao.dominio.*;

public class LeilaoTeste {
	
	private Usuario joao;
	private Usuario maria;
	private Usuario steveJobs;
	private Usuario billGates;
	
	@Before
	public void criaAvaliador() {
		this.joao = new Usuario("João");
		this.maria = new Usuario("Maria");
		this.steveJobs = new Usuario("Steve Jobs");
		this.billGates = new Usuario("Bill Gates");
	}
	
	@BeforeClass
	public static void testandoBeforeClass() {
	  System.out.println("before class");
	}

	@AfterClass
	public static void testandoAfterClass() {
	  System.out.println("after class");
	}
	
	@Test
	public void deveReceberUmLance() {
		Leilao leilao = new CriadorDeLeilao().para("Macbook Pro 15").constroi();
		assertEquals(0, leilao.getLances().size());
		
		leilao.propoe(new Lance(joao, 2000));
		
		assertEquals(1, leilao.getLances().size());
		assertEquals(2000, leilao.getLances().get(0).getValor(), 0.00001);
	}
	
	@Test
	public void deveReceberVariosLances() {
		Leilao leilao = new CriadorDeLeilao().para("Macbook Pro 15")
				.lance(joao, 2000)
				.lance(maria, 3000)
				.constroi();
		
		assertEquals(2, leilao.getLances().size());
		assertEquals(2000, leilao.getLances().get(0).getValor(), 0.00001);
		assertEquals(3000, leilao.getLances().get(1).getValor(), 0.00001);
	}
	
	@Test
	public void naoDeveAceitarDoisLancesSeguidosDoMesmoUsuario() {
		Leilao leilao = new CriadorDeLeilao().para("Macbook Pro 15")
				.lance(joao, 2000)
				.lance(joao, 3000)
				.constroi();
		
		assertEquals(1, leilao.getLances().size());
		assertEquals(2000,leilao.getLances().get(0).getValor(), 0.00001);
	}
	
	@Test
	public void naoDeveAceitarMaisDoQue5LancesDoMesmoUsuario() {
		Leilao leilao = new CriadorDeLeilao().para("Macbook Pro 15")
				.lance(steveJobs, 2000)
				.lance(billGates, 3000)
				.lance(steveJobs, 4000)
				.lance(billGates, 5000)
				.lance(steveJobs, 6000)
				.lance(billGates, 7000)
				.lance(steveJobs, 8000)
				.lance(billGates, 9000)
				.lance(steveJobs, 10000)
				.lance(billGates, 11000)
				.lance(steveJobs, 12000)
				.constroi();
		
		assertEquals(10, leilao.getLances().size());
		assertEquals(11000, leilao.getLances().get(leilao.getLances().size()-1).getValor(), 0.00001);
	}
	
	@Test
	public void deveDobrarOUltimoLance() {
		Leilao leilao = new CriadorDeLeilao().para("Macbook Pro 15")
				.lance(steveJobs, 2000)
				.lance(billGates, 3000)
				.constroi();
		
		leilao.dobraLance(steveJobs);
		
		assertEquals(4000.0, leilao.getLances().get(2).getValor(), 0.00001);
	}
	
	@Test
	public void naoDeveDobrarCasoNaoHajaLanceAnterior() {
		Leilao leilao = new CriadorDeLeilao().para("Macbook Pro 15")
				.lance(steveJobs, 2000)
				.constroi();
		
		leilao.dobraLance(billGates);
		
		assertEquals(1, leilao.getLances().size());
	}
}
