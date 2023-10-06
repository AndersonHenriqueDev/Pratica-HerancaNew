package banco;

public class Telefonista extends Funcionario {
	private int codigoEstacao;
	
	public Telefonista(String nome, double salario, int codigoEstacao) {
		super(nome, salario);
		this.codigoEstacao = codigoEstacao;
	}
	
	public void infoTelefonista() {
		System.out.println("Codigo estação: " + codigoEstacao);
	}
}
