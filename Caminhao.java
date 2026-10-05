public class Caminhao extends Veiculo {

	private double capacidadeCarga;
	private int numeroEixos;

	public Caminhao(String modelo, String marca, String cor,
	                double valorDiaria, EstadoVeiculoEnum estado,
	                CategoriaEnum categoriaEnum, double capacidadeCarga,
	                int numeroEixos) {

		super(modelo, marca, cor, valorDiaria, estado, categoriaEnum);

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
		System.out.println("Capacidade de carga: "
				+ getCapacidadeCarga() + " kg");
		System.out.println("Número de eixos: "
				+ getNumeroEixos());

		System.out.println();
	}
}