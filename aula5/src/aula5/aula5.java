package aula5;

public class aula5 {

	public static void main(String[] args) {
		Conta c1 = new Conta();
	    c1.AbrirConta("CC");
		c1.setNumConta(255);		
		c1.setDono("Jubileu");

		Conta c2 = new Conta();
		c2.setDono("Creusa");
		c2.AbrirConta("CP");
		c2.setNumConta(122);
		
		c1.Depositar(300);
		c2.Depositar(500);
		

		c1.Sacar(350);
		c2.Sacar(550);
		
		c1.FecharConta();
		c2.FecharConta();
			
		c1.PagarMensal();
		c2.PagarMensal();
		
		
        c1.StatusAtual();
        c2.StatusAtual();
	}

}
