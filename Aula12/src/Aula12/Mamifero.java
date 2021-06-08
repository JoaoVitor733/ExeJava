package Aula12;

public class Mamifero extends Animal {
    //ATRIBUTOS
	private String corPelo;
	
	//METODOS ESPECIAIS
	public String getCorPelo() {
		return corPelo;
	}
	
	public void setPeso(String p) {
		this.corPelo = p;
	}
	
	//SOBREPOSIÇÃO
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
	    System.out.println("Som do mamifero");
	}

}
