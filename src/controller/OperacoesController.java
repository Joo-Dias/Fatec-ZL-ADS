package controller;

import java.util.Iterator;

public class OperacoesController {

	public OperacoesController() {
		// TODO Auto-generated constructor stub
		// Testes
	}
	
	public void concatenaVetor1000() {
		double vetor[] = new double[1000];
		double tempoInicial = System.nanoTime(); // Pegando o tempo inicial e colocando em uma variável
		double tamanhoVetor = vetor.length;
		for(int i = 0; i < tamanhoVetor; i++) {
			
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		System.out.println("Tempo total no vetor de 1000: "+tempoTotal+" Ns.");
	}
	
	public void concatenaVetor10000() {
		double vetor[] = new double[10000];
		double tempoInicial = System.nanoTime(); // Pegando o tempo inicial e colocando em uma variável
		double tamanhoVetor = vetor.length;
		for(int i = 0; i < tamanhoVetor; i++) {
			
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		System.out.println("Tempo total no vetor de 10000: "+tempoTotal+" Ns.");
	}
	
	public void concatenaVetor100000 () {
		double vetor[] = new double[100000 ];
		double tempoInicial = System.nanoTime(); // Pegando o tempo inicial e colocando em uma variável
		double tamanhoVetor = vetor.length;
		for(int i = 0; i < tamanhoVetor; i++) {
			
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		System.out.println("Tempo total no vetor de 100000: "+tempoTotal+" Ns.");
	}

}
