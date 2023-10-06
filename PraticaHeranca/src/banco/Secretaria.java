package banco;

public class Secretaria extends Funcionario {
	private int numeroRamal;
	
	public Secretaria(String nome, double salario, int numeroRamal) {
		super(nome, salario);
		this.numeroRamal = numeroRamal;
	}
	
	public void infoSecretaria() {
		System.out.println("Numero ramal: " + numeroRamal);
	}
	
}
