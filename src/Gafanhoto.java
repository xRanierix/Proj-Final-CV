
public class Gafanhoto extends Pessoa {
	
	private String login;
	private int totAssistido;
	
	//Construtor importando elementos da classe mae e adicionando login e totAssistido
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}

	//Getters e Setters
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	
	//ToString editado chamando os itens da super classe
	@Override
	public String toString() {
		return "Gafanhoto [" + super.toString() + "\nlogin=" + login +
				", totAssistido=" + totAssistido + "]";
	}
	 
	
	
}
