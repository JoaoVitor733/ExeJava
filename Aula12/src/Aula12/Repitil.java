package Aula12;

public class Repitil extends Animal {
	//ATRIBUTOS
	private String corEscama;
	
	//METODOS ESPECIAIS
	public String getCorEscama() {
		return corEscama;
	}
	
	
	public void setCorEscama(String c) {
		this.corEscama = c;		
	}
	//SOBREPOSIÇÃO
	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Emitindo som de repitil");
	}

}
