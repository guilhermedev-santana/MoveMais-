public interface OperacaoGestaoFrota {

	void adicionarVeiculo(Veiculo veiculo);

	void removerVeiculo(int id);

	void procurarVeiculo(int id);

	void procurarCategoria(Categoria categoria);

	void atualizarValorDiaria(int id, double valor);

	void listarVeiculos();

}