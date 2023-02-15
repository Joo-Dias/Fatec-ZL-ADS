package view;

import controller.OperacoesController;

public class Main {

	public static void main(String[] args) {
		
		OperacoesController opControl = new OperacoesController();
		
		opControl.concatenaVetor1000();
		opControl.concatenaVetor10000();
		opControl.concatenaVetor100000();

	}

}
