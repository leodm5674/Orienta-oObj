import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sistema {

	public static void main(String[] args) throws Exception {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Companhia companhia = new Companhia();
		String opcao = "";

		while (!opcao.equals("4")) {
			System.out.println("1 - Cadastrar voo");
			System.out.println("2 - Listar voos");
			System.out.println("3 - Consultar voo");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opcao: ");
			opcao = leitor.readLine();

			switch (opcao) {
			case "1":
				cadastrarVoo(leitor, companhia);
				break;

			case "2":
				listarVoos(companhia);
				break;

			case "3":
				consultarVoo(leitor, companhia);
				break;

			case "4":
				System.out.println("Sistema encerrado");
				break;

			default:
				System.out.println("Opcao invalida");
				break;
			}
		}
	}





	public static void cadastrarVoo(BufferedReader leitor, Companhia companhia) throws Exception {
		Voo voo = new Voo();

		System.out.print("Codigo do voo: ");
		voo.setCodigodovoo(leitor.readLine());

		System.out.print("Origem: ");
		voo.setOrigem(leitor.readLine());

		System.out.print("Destino: ");
		voo.setDestino(leitor.readLine());

		System.out.print("Data: ");
		voo.setData(leitor.readLine());

		System.out.print("Hora: ");
		voo.setHora(leitor.readLine());

		companhia.cadastrarVoo(voo);
		System.out.println("Voo cadastrado.");
	}






	public static void listarVoos(Companhia companhia) {
		if (companhia.getTotalDeVoos() == 0) {
			System.out.println("Nenhum voo cadastrado");
			return;
		}

		for (int i = 0; i < companhia.getTotalDeVoos(); i++) {
			Voo voo = companhia.getListaDeVoos()[i];
			System.out.println("\nCodigo: " + voo.getCodigodovoo());
			System.out.println("Origem: " + voo.getOrigem());
			System.out.println("Destino: " + voo.getDestino());
			System.out.println("Data: " + voo.getData());
			System.out.println("Hora: " + voo.getHora());
		}
	}








	public static void consultarVoo(BufferedReader leitor, Companhia companhia) throws Exception {
		System.out.print("Digite o codigo do voo: ");
		String codigo = leitor.readLine();

		for (int i = 0; i < companhia.getTotalDeVoos(); i++) {
			Voo voo = companhia.getListaDeVoos()[i];

			if (voo.getCodigodovoo().equalsIgnoreCase(codigo)) {
				System.out.println("\nVoo encontrado:");
				System.out.println("Codigo: " + voo.getCodigodovoo());
				System.out.println("Origem: " + voo.getOrigem());
				System.out.println("Destino: " + voo.getDestino());
				System.out.println("Data: " + voo.getData());
				System.out.println("Hora: " + voo.getHora());
				return;
			}
		}

		System.out.println("Voo nao encontrado.");
	}
}
