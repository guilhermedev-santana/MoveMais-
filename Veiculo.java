public abstract class Veiculo {
	private static int proxid = 1;
	private static int qttTotalVeiculos = 0;

	private int id;
	private String modelo;
	private String marca;
	private String cor;
	private double valorDiaria;
	private EstadoVeiculo estado;
	private Categoria categoria;

	public Veiculo(String modelo, String marca, String cor, double valorDiaria, EstadoVeiculo estado,Categoria categoria) {
		this.id = proxid++;
		qttTotalVeiculos++;
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.setValorDiaria(valorDiaria);
		this.estado = estado;
		this.categoria = categoria;
		
	}

	public static int getQttTotalVeiculos() {
		return qttTotalVeiculos;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		if (valorDiaria > 0) {
			this.valorDiaria = valorDiaria;
		} else {
			System.out.println("Valor Incorreto!");
		}
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public EstadoVeiculo getEstado() {
		return estado;
	}

	public void setEstado(EstadoVeiculo estado) {
		this.estado = estado;
	}

	public int getProxid() {
		return proxid;
	}

	public int getId() {
		return id;
	}

	public abstract void fichaTecnica();

	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", valorDiaria="
				+ valorDiaria + ", estado=" + estado + ", categoria=" + categoria + "]";
	}

}