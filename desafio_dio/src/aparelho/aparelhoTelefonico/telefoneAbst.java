package aparelho.aparelhoTelefonico;

public abstract class telefoneAbst implements telefoneIntfc {
	
	public void ligar(int numero) {
		System.out.println("Ligando para " + numero);		
	}

	public void atender() {
		System.out.println("Atender a ligacao.");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz.");
	}
	
}

