package Aula12;

public class Canguru extends Mamifero {
    //METODS
	public void usarBolsa() {
		System.out.println("Usando bolsa");
	}
	
	//METODOS DE SOBREPOSI��O
	@Override
	public void locomover() {
		System.out.println("Pulando");
	}
}
