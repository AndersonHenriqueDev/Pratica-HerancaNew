package banco;

public class Gerente extends Funcionario{
	private String login;
	private String senha;
	
	public Gerente(String nome, double salario, String login, String senha) {
		super(nome, salario);
		this.login = login;
		this.senha = senha;
	}
	
	public void infoGerente() {
		System.out.println("Login: " + login);
		System.out.println("Senha: " + senha);
	}
	
	
}
