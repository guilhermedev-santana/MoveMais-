public class Carro extends Veiculo {

	private double capacidadePortaMala;
	private String tipoCombustivel;

	public Carro(String modelo, String marca, String cor,
	             double valorDiaria, EstadoVeiculoEnum estado,
	             CategoriaEnum categoriaEnum, double capacidadePortaMala,
	             String tipoCombustivel) {

		super(modelo, marca, cor, valorDiaria, estado, categoriaEnum);

		this.capacidadePortaMala = capacidadePortaMala;
		this.tipoCombustivel = tipoCombustivel;
	}

	public double getCapacidadePortaMala() {
		return capacidadePortaMala;
	}

	public void setCapacidadePortaMala(double capacidadePortaMala) {
		this.capacidadePortaMala = capacidadePortaMala;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public void fichaTecnica() {

		System.out.println("====== FICHA TÉCNICA ======");

		System.out.println("ID: " + getId());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Marca: " + getMarca());
		System.out.println("Cor: " + getCor());
		System.out.println("Valor da diária: R$ " + getValorDiaria());
		System.out.println("Categoria: " + getCategoria());
		System.out.println("Estado: " + getEstado());
		System.out.println("Capacidade do porta-malas: "
				+ getCapacidadePortaMala() + " L");
		System.out.println("Tipo de combustível: "
				+ getTipoCombustivel());

		System.out.println();
	}
}