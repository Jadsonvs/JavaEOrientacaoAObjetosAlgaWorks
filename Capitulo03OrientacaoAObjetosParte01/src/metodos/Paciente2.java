package metodos;

public class Paciente2 {
	
	public static void main(String[] args) {
		Paciente paciente2 = new Paciente();
		paciente2.peso = 70.5;
		paciente2.altura = 1.75;
		
		IMC imcCalculado = paciente2.calcularIndiceDeMassaCorporal();
		
		System.out.println("IMC do paciente> " + imcCalculado);
	}

}
