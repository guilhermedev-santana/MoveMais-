public interface IOperacaoGestaoFrota {

	void adicionarVeiculo(Veiculo veiculo);

	void removerVeiculo(int id);

	void procurarVeiculo(int id);

	void procurarCategoria(CategoriaEnum categoriaEnum);

	void atualizarValorDiaria(int id, double valor);

	void listarVeiculos();

}