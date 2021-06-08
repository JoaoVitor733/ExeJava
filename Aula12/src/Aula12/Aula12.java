package Aula12;

public class Aula12 {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Repitil r = new Repitil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setPeso(77.4f);
		m.setIdade(5);
		m.setMembros(4);
		m.locomover();
		m.alimentar();
		m.emitirSom();
		
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Tartaruga t = new Tartaruga();
		
		k.emitirSom();
		

	}

}
