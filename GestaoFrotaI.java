import java.util.ArrayList;

public class GestaoFrota implements OperacaoGestaoFrota {

	private ArrayList<Veiculo> veiculos;

	public GestaoFrota() {
		veiculos = new ArrayList<>();
	}

	@Override
	public void adicionarVeiculo(Veiculo veiculo) {

		if (veiculo == null) {
			System.out.println("Veículo inválido!");
			return;
		}

		for (Veiculo v : veiculos) {

			if (v.getId() == veiculo.getId()) {
				System.out.println("Veículo já cadastrado!");
				return;
			}
		}

		veiculos.add(veiculo);

		System.out.println("Veículo adicionado com sucesso!");
	}

	@Override
	public void removerVeiculo(int id) {

		for (int i = 0; i < veiculos.size(); i++) {

			if (veiculos.get(i).getId() == id) {

				veiculos.remove(i);

				System.out.println("Veículo removido.");

				return;
			}
		}

		System.out.println("ID do veículo incorreto!");
	}

	@Override
	public void procurarVeiculo(int id) {

		for (Veiculo veiculo : veiculos) {

			if (veiculo.getId() == id) {

				veiculo.fichaTecnica();

				return;
			}
		}

		System.out.println("Veículo não encontrado!");
	}

	@Override
	public void procurarCategoria(Categoria categoria) {

		boolean encontrado = false;

		for (Veiculo veiculo : veiculos) {

			if (veiculo.getCategoria() == categoria) {

				veiculo.fichaTecnica();

				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println(
					"Nenhum veículo encontrado nessa categoria!"
			);
		}
	}

	@Override
	public void atualizarValorDiaria(int id, double valor) {

		if (valor <= 0) {

			System.out.println("Valor da diária inválido!");

			return;
		}

		for (Veiculo veiculo : veiculos) {

			if (veiculo.getId() == id) {

				veiculo.setValorDiaria(valor);

				System.out.println(
						"Valor da diária atualizado."
				);

				return;
			}
		}

		System.out.println("Veículo não encontrado!");
	}

	@Override
	public void listarVeiculos() {

		if (veiculos.isEmpty()) {

			System.out.println("Nenhum veículo cadastrado.");

			return;
		}

		System.out.println("===== LISTA DE VEÍCULOS =====");

		for (Veiculo veiculo : veiculos) {

			veiculo.fichaTecnica();
		}
	}
}