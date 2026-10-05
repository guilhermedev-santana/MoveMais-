
public class Caminhao extends Veiculo {

	private double capacidadeCarga;
	private int numeroEixos;
	Categoria categoria;

	public Caminhao(String modelo, String marca, String cor, double valorDiaria, EstadoVeiculo estado, Categoria categoria,
			double capacidadeCarga, int numeroEixos) {
		super(modelo, marca, cor, valorDiaria, estado, categoria);
		this.capacidadeCarga = capacidadeCarga;
		this.numeroEixos = numeroEixos;
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getNumeroEixos() {
		return numeroEixos;
	}

	public void setNumeroEixos(int numeroEixos) {
		this.numeroEixos = numeroEixos;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	@Override
	public void fichaTecnica() {
		System.out.println("====== FICHA TÉCNICA =====");
		System.out.println("\nModelo: " + getModelo() + "\nMarca: " + getMarca() + "\nCor: " + getCor()
				+ "\nValorDiaria: " + getValorDiaria() + "\nCategoria: " + getCategoria() + "\nEstado: " + getEstado()
				+ "\nCapacidade da Carga: " + getCapacidadeCarga() + "\nNumeros de Eixos: " + getNumeroEixos());
	}

}
