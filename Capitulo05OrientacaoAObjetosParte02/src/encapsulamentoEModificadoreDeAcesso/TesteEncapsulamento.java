package encapsulamentoEModificadoreDeAcesso;

public class TesteEncapsulamento {
	
	public static void main(String[] args) {
		ArCondicionado arCondicionado = new ArCondicionado();

		arCondicionado.trocarTemperatura(21);
		System.out.println("Temperatura do ArCondicionado: " + arCondicionado.obterTemperatura() + "º");
		
		arCondicionado.trocarTemperatura(10);
		System.out.println("Temperatura do ArCondicionado: " + arCondicionado.obterTemperatura() + "º");
	}	
}
