
public class Visualizacao {
	
	//Atributos
	private Gafanhoto espectador;
	private Video filme;
	
	//Construtor
	public Visualizacao(Gafanhoto espectador, Video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
		this.filme.setViews(this.filme.getViews()+1);
	}
	
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(float porc) {
		int tot = 0; //parametro do if
		
		if(porc <=20) { //condi��es
			tot = 3;
		}else if (porc<=50){
			tot=5;
		}else if (porc <=90) {
			tot=8;
		}else {
			tot=10;
		}
		this.filme.setAvaliacao(tot); //jogando o resultado na avalia��o do filme
	}
	
	//Getters e Setters
	public Gafanhoto getEspectador() {
		return espectador;
	}
	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}
	public Video getFilme() {
		return filme;
	}
	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
	
	
}
