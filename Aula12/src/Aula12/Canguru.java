package Aula12;

public class Canguru extends Mamifero {
    //METODS
	public void usarBolsa() {
		System.out.println("Usando bolsa");
	}
	
	//METODOS DE SOBREPOSIÇÃO
	@Override
	public void locomover() {
		System.out.println("Pulando");
	}
}
