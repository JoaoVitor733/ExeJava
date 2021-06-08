package Aula11;

public class Aula11 {

	public static void main(String[] args) {
//		Visitante v1 = new Visitante();
//		v1.setNome("José");
//        v1.setIdade(10);
//        v1.setSexo("M");
//        System.out.println(v1.status());
//        
//        Aluno a1 = new Aluno();
//        a1.setNome("André");
//        a1.setIdade(18);
//        a1.setSexo("M");
//        a1.setMatricula(125);
//        a1.setCurso("Informatica");
//        //a1.pagarMensa();
//        System.out.println(a1.status());
//        
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(12);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensa();
        System.out.println(b1.status());
        
	}

}
