package Exercicio1;

public class Exercicio1 {

	public static void main(String[] args) {
   	   Espelho e1 = new Espelho();
       e1.Cor = "Branco";
       e1.Material = "Madeira";
       e1.Tamanho = 2;
       e1.Naospelha();
       e1.Status();
       e1.Quebrado();
       
        JoaoVitor p1 = new JoaoVitor();
        p1.Altura = 1.78f;
        p1.Idade = 17;
        p1.Cor = "Pardo";
        p1.MediaEscolar = 5;
        p1.Ferias();
        p1.Status();
	}

}
