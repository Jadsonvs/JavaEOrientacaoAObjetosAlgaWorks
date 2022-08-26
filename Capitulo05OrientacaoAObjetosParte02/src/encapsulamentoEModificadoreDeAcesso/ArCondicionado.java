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
 - O OBJETO deve ser encapsulado e só pode amostrar o importante
 
 - Modificador public permite que qualquer classe do package tenha acesso
 
 - MOdificador private apenas a classe de criação que tem acesso.
 
 MAIS SOBRE -> http://high5devs.com/2015/02/modificadores-de-acesso-em-java/
 MAIS SOBRE -> https://www.devmedia.com.br/modificadores-de-acesso-em-java/18822#modulo-mvp
 MAIS SOBRE -> 
 
 */
