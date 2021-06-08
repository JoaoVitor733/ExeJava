package ProjetoFinal;

public class ProjetoFinal {

	public static void main(String[] args) {
	    Video v[] = new Video[2];
	    v[0] = new Video("Aula 1");
        v[1] = new Video("Aula 2");
	    
	    Gafanhoto g[] = new Gafanhoto[2];
	    
	    g[1] = new Gafanhoto("João",11,"M", "jUANITO");
	    
	    //System.out.println(v[1].status());
	    //System.out.println(g[1].status());
	    
	    Visualizacao vi[] = new Visualizacao[3];
	    vi[0] = new Visualizacao(g[1],v[0]);
	    vi[0].avaliar();
	    vi[1] = new Visualizacao(g[1], v[1]);
	    vi[1].avaliar(100.0f);
	    
	    System.out.println(vi[0].status());
	    System.out.println(vi[1].status());
	}
}
