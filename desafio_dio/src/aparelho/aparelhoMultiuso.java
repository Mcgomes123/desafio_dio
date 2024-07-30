package aparelho;

import aparelho.aparelhoTelefonico.telefoneIntfc;
import aparelho.navegadorInternet.navegadorIntf;
import aparelho.reprodutorMusical.reproducaoIntfc;

public class aparelhoMultiuso implements reproducaoIntfc, telefoneIntfc, navegadorIntf {
	
	public void tocar() {
		System.out.println("Ouvindo a musica.");
	}
	public void pausar() {
		System.out.println("Pausando a musica.");
	}
	public void selecionarMusica(String nome) {
		System.out.println(nome + "selecionada");
	}
	public void ligar(int numero) {
		System.out.println("Ligando para " + numero);
	}
	public void atender() {
		System.out.println("Atender ligacao.");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz.");
	}
	public void exibirPagina() {
		System.out.println("Exibindo a pagina");
	}
	public void adicionarNovaAba() {
		System.out.println("Adicionando pagina.");
	}
	public void atualizarPagina() {
		System.out.println("Atualizando pagina.");
	}

}

