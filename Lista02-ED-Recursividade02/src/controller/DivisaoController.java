package controller;

public class DivisaoController {

	public DivisaoController() {
		super();
	}

	public int Divisao(int dividendo, int divisor) {
		
		if (dividendo < divisor) {
			return dividendo ;
		} else {
			return Divisao(dividendo - divisor, divisor);
		}
	}
}
