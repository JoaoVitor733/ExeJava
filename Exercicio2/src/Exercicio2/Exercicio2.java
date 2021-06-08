package Exercicio2;

public class Exercicio2 {

	public static void main(String[] args) {
		 Pessoa p[] = new Pessoa[2];
		 Livro l[]= new Livro[3];
		 
		 p[0] = new Pessoa("João", 17, "M");
		 p[1] = new Pessoa("Pedro", 8, "M");
		 
		 l[0] = new Livro("American pie", "Stifler", 60, p[0]);
		 l[1] = new Livro("Superbad", "Mclovin", 75, p[0]);
		 l[2 ]= new Livro("Galinha pitadinha", "Carejo", 20, p[1]);
		 
		 l[0].abrir();
		// l[0].folhear(60);
		 l[0].folhear(20);
		 l[0].voltarPag();
		 //l[0].avancarPag();
		
   	     l[0].detalhes();
	}

}
