package br.com.caelum.leilao.servico;

import java.util.*;

import br.com.caelum.leilao.dominio.*;

public class Avaliador {
	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;
	private double valorMedio;
	private List<Lance> maiores;

	public void avalia(Leilao leilao) {
		if (leilao.getLances().size() == 0) {
			throw new RuntimeException("Não é possível avaliar um leilão sem lances");
		}
		
		for (Lance lance : leilao.getLances()) {
			if (lance.getValor() > maiorDeTodos) maiorDeTodos = lance.getValor();
			if (lance.getValor() < menorDeTodos) menorDeTodos = lance.getValor();
		}
		
		valorMedio = leilao.getLances().stream().mapToDouble(Lance::getValor).average().getAsDouble();
		maiores = new ArrayList<Lance>(leilao.getLances());
		Collections.sort(maiores, (l1, l2) -> {
			if (l1.getValor() < l2.getValor()) return 1;
			if (l1.getValor() > l2.getValor()) return -1;
			return 0;
		});
		maiores = maiores.subList(0, maiores.size() > 3 ? 3 : maiores.size());
	}
	
	public double getMaiorLance() {
		return maiorDeTodos;
	}
	
	public double getMenorLance() {
		return menorDeTodos;
	}
	
	public double getValorMedio() {
		return valorMedio;
	}
	
	public List<Lance> getTresMaiores() {
		return maiores;
	}
}
