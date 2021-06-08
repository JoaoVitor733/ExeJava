package Aula12;

public class Ave extends Animal {
	//ATRIBUTOS
	private String corPena;
	
	//METODOS
	public void fazerNinho() {
		System.out.println("Construir ninho");
	}
	
	//METODOS ESPECIAIS
	public String getCorPena() {
		return corPena;
	}
	
	public void getCorPena(String c) {
		this.corPena = c;
	}
	
	//METODOS SOBREPOSTOS
	@Override
	public void locomover() {
		System.out.println("Voando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");
	}
    @Override
	public void emitirSom() {
		System.out.println("Emitindo som da ave");
	}
}
