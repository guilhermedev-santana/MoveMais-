import java.util.ArrayList;

public class GestaoFrota implements OperacaoGestaoFrota {
	ArrayList<Veiculo> veiculos;

	public GestaoFrota() {
		veiculos = new ArrayList<Veiculo>();
	}

	@Override
	public void adicionarVeiculo(Veiculo veiculo) {
		for (Veiculo v : veiculos) {
			if (v.getId() == veiculo.getId()) {
				veiculos.add(veiculo);
				System.out.println("Veiculos adicionado.");
				return;
			}
		}
		System.out.println("Já possui veiculo cadastrado!");
	}

	@Override
	public void removerVeiculo(int id) {
		for (int i = 0; i < veiculos.size(); i++) {
			if (veiculos.get(i).getId() == id) {
				veiculos.remove(i);
				System.out.println("Veículo Removido.");
				return;
			}
		}
		System.out.println("Id do veículo incorreto!");
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
		for (Veiculo veiculo : veiculos) {
			if (veiculo.getCategoria().equals(categoria)) {
				veiculo.fichaTecnica();
				return;
			}
		}
		System.out.println("Categoria não existe!");
	}

	@Override
	public void atualizarValorDiaria(int id, double valor) {
		for (Veiculo veiculo : veiculos) {
			if (veiculo.getId() == id) {
				veiculo.setValorDiaria(valor);
				System.out.println("Valor Atualizado.");
				return;
			}
		}
		System.out.println("Veículo não encontrado!");
	}

	@Override
	public void listarVeiculos() {
		System.out.println("===== LISTA VÉICULOS =====");
		for (Veiculo veiculo : veiculos) {
			veiculo.fichaTecnica();
		}
	}
}
