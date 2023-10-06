package banco;

import java.util.ArrayList;

public class testBanco {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Joao", 2520, "joaozinho", "joaozinho123");
		gerente.infoBasica();
		gerente.infoGerente();
		System.out.println();
		
		Secretaria secretaria = new Secretaria("Maria", 1620, 37283864);
		secretaria.infoBasica();
		secretaria.infoSecretaria();
		System.out.println();
		
		Telefonista telefonista = new Telefonista("Bianca", 1540, 6647);
		telefonista.infoBasica();
		telefonista.infoTelefonista();
		
		
		ArrayList<String> listaFuncionarios = new ArrayList<>();
		
		//adicionar funcionario
		listaFuncionarios.add("Jose");
		listaFuncionarios.add("Maria");
		listaFuncionarios.add("Joao");
		
		System.out.println("Funcionário: " + listaFuncionarios.get(0));
		
		//consultar e mostrar todos os funcionarios da lista
		System.out.println("Funcionários: ");
		for (String funcionarios: listaFuncionarios) {
			System.out.println(funcionarios);
		}
		
		//alterar
		listaFuncionarios.set(1, "Mané");
		
		//remover
		listaFuncionarios.remove("Maria");
		
	}

}
