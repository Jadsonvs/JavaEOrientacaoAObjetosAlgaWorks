package encapsulamentoEModificadoreDeAcesso;

public class ArCondicionado {
	
	private int temperatura;
	
	public void trocarTemperatura(int temperatura) {
		if(temperatura >= 17 && temperatura <= 25) {
			this.temperatura = temperatura;
		}
	}
	
	public int obterTemperatura() {
		return temperatura;
	}

}

/*
 - O OBJETO deve ser encapsulado e s� pode amostrar o importante
 
 - Modificador public permite que qualquer classe do package tenha acesso
 
 - MOdificador private apenas a classe de cria��o que tem acesso.
 
 */
