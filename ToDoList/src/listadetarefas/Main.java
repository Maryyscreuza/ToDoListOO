package listadetarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Instancias

		// Usuario

		boolean rodando = true;

		while (rodando) {

			System.out.println("[1] Cadastrar usuário");
			System.out.println("[2] Listar todos usuários cadastrados");
			System.out.println("[3] Procurar usuário por email");
			System.out.println("[4] Atualizar dados de um usuário");
			System.out.println("[5] Remover usuário");
			System.out.println("[6] Sair");
			System.out.println("Digite a opção");
			String opcao = scanner.nextLine();

			switch (opcao) {

			case "1": {
				System.out.println("=== CADASTRO DE USUÁRIO ===");

				System.out.print("Digite o email:");
				String email = scanner.nextLine();
				System.out.print("Digite o nome:");
				String nome = scanner.nextLine();

				Usuario u = new Usuario();
				u.setEmail(email);
				u.setNome(nome);

				usuario.add(u);

				break;
			}

			case "2": {
				System.out.println("=== USUÁRIOS CADASTRADOS ===");

				for (int i = 0; i < usuario.size(); i++) {

					Usuario uTemp = usuario.get(i);
					System.out.println("Usuário " + i);
					System.out.println("\tEmail: " + usuario.get(i).getEmail());
					System.out.println("\tSenha: " + usuario.get(i).getSenha());

				}
				break;
			}

			case "3": {
				System.out.println("=== PROCURAR USUÁRIO POR EMAIL ===");
				System.out.print("Digite o email: ");
				String email = scanner.nextLine();

				boolean encontrado = false;
				for (int i = 0; i < usuario.size(); i++) {

					Usuario uTemp = usuario.get(i);

					if (email.equals(uTemp.getEmail())) {
						System.out.println("Usuario encontrado");
						System.out.println("\tEmail: " + uTemp.getEmail());
						System.out.println("\tSenha: " + uTemp.getNome());
						break;
					}
				}

				if (encontrado == false) {
					System.out.println("Não foi encontrado nenhum usuario com esse email");
				}

				break;
			}

			case "4": {
				break;
			}

			case "5": {
				break;
			}

			case "6": {
				rodando = false;
				break;
			}
			}

		}
	}

}
