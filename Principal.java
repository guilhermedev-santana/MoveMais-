public class Principal {
	public static void main(String[] args) {
		Veiculo veiculo = null;
		GestaoFrota gestao = new GestaoFrota();

		Carro c1 = new Carro("Saveiro", "Chevrolet", "Vermelho", 50, EstadoVeiculo.EM_MANUTENCAO,Categoria.CARRO, 55, "Gasolina");
		Carro c2 = new Carro("Doblô", "Ford", "Branco", 65, EstadoVeiculo.DISPONIVEL,Categoria.CARRO, 60, "Gás");
		Caminhao cam1 = new Caminhao("Bongo", "KIA", "Preto", 70, EstadoVeiculo.EM_TRANSITO,Categoria.CAMINHAO, 1000, 6);

		veiculo.getQttTotalVeiculos();
		gestao.adicionarVeiculo(c1);
		gestao.adicionarVeiculo(c2);
		gestao.adicionarVeiculo(cam1);
		gestao.listarVeiculos();
		gestao.procurarCategoria(Categoria.CARRO);
		gestao.atualizarValorDiaria(1, 55);
		gestao.removerVeiculo(2);
		gestao.listarVeiculos();

	}
}
