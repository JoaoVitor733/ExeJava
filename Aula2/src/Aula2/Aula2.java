package Aula2;

class Aula2 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
         c1.Cor = "azul";
         c1.Modelo = "BIC cristal";
//         c1.Ponta = 0.5f; // o unico que nao pode ser tribuido pois e privado a sua classe
         c1.Carga = 80; // pode atribuir a atributos/metodos protegidos porque o metodo 
         //main ta dentro de uma classe que tem dentro dela a classe caneta
         c1.Destampar();
         c1.Status();
//        c1.Rabiscar();
        
//        Caneta c2 = new Caneta();
//        c2.Modelo = "Big";
//        c2.Cor = "Preto";
//        c2.Tampar();
//        c2.Rabiscar();
	}

}
