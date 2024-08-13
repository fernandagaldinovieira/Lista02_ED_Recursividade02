package view;

import controller.DivisaoController;

public class Principal {

	public static void main(String[] args) {
		
		DivisaoController divisaoController = new DivisaoController();
	
		int dividendo = 5;
		int divisor = 3;
		
		int resultado = divisaoController.Divisao(dividendo, divisor);
		System.out.println("O resto da divisão de " + dividendo + " por " + divisor + " é: " + resultado);
				
	}
}
