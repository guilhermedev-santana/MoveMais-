
public class Carro extends Veiculo {

	private double capacidadePortaMala;
	private String tipoCombustivel;
	Categoria categoria;

	public Carro(String modelo, String marca, String cor, double valorDiaria, EstadoVeiculo estado, Categoria categoria,
			double capacidadeCombustivel, String tipoCombustivel) {
		super(modelo, marca, cor, valorDiaria, estado, categoria);
		this.capacidadePortaMala = capacidadeCombustivel;
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void fichaTecnica() {
		System.out.println("====== FICHA TÉCNICA =====");
		System.out.println("\nModelo: " + getModelo() + "\nMarca: " + getMarca() + "\nCor: " + getCor()
				+ "\nValorDiaria: " + getValorDiaria() + "\nCategoria: " + getCategoria() + "\nEstado: " + getEstado()
				+ "\nCapacidade do Porta Mala: " + getCapacidadePortaMala() + "\nTipo de Combustivel: "
				+ getTipoCombustivel());
	}
}
