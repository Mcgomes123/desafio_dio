package aparelho;

public class main {
	public main(String[]args) {
		aparelhoMultiuso aparelho = new aparelhoMultiuso();
		
		System.out.println("---------->");
		aparelho.selecionarMusica("D");
		aparelho.tocar();
		aparelho.pausar();
		
		System.out.println("---------->");
		aparelho.atender();
		aparelho.iniciarCorreioVoz();
		aparelho.ligar(40028922);
		
		System.out.println("---------->");
		aparelho.exibirPagina();
		aparelho.atualizarPagina();
		aparelho.adicionarNovaAba();
		
		System.out.println("---------->");
		
		
	}
}	
