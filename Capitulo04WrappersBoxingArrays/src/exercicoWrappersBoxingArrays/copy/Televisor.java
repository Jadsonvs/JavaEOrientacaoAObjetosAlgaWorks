package exercicoWrappersBoxingArrays.copy;

public class Televisor {
	
	Integer canal = 130;
	Integer volume = 20;

	void mudarCanal(Integer novoCanal) {
//		if (canal == novoCanal) - valor antigo
		if (canal.equals(novoCanal)) {
			System.out.println("Novo canal é também o canal atual.");
		} else {
			canal = novoCanal;
			System.out.println("Canal alterado para " + canal);
		}
	}
	
	void mudarVolume(Integer novoVolume) {
//		if (novoVolume == volume) - valor antigo
		if (novoVolume.equals(volume)) {
			System.out.println("Novo volume é também o volume atual.");
		} else {
			volume = new Integer(novoVolume.byteValue());
			
			System.out.println("Volume alterado para " + volume);
		}
	}
	
	// Estamos aproveitando a classe Televisor para fazer nosso teste
	public static void main(String[] args) {
		Televisor tv = new Televisor();

		// Não deveria mudar o volume e canal - resolvido
		tv.mudarCanal(130);
		tv.mudarVolume(20);
		
		// Deveria mudar o volume e canal - resolvido
		tv.mudarCanal(10);
		tv.mudarVolume(300);
	}

}
