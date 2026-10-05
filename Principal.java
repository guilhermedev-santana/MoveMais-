public class Principal {

    public static void main(String[] args) {
        GestaoFrota gestao = new GestaoFrota();
        Carro c1 = new Carro(
                "Saveiro",
                "Chevrolet",
                "Vermelho",
                50,
                EstadoVeiculoEnum.EM_MANUTENCAO,
                CategoriaEnum.CARRO,
                55,
                "Gasolina"
        );
        Carro c2 = new Carro(
                "Doblô",
                "Ford",
                "Branco",
                65,
                EstadoVeiculoEnum.DISPONIVEL,
                CategoriaEnum.CARRO,
                60,
                "Gás"
        );
        Caminhao cam1 = new Caminhao(
                "Bongo",
                "KIA",
                "Preto",
                70,
                EstadoVeiculoEnum.EM_TRANSITO,
                CategoriaEnum.CAMINHAO,
                1000,
                6
        );
        gestao.adicionarVeiculo(c1);
        gestao.adicionarVeiculo(c2);
        gestao.adicionarVeiculo(cam1);
        System.out.println(
                "Total de veículos criados: "
                        + Veiculo.getQttTotalVeiculos()
        );
        gestao.listarVeiculos();
        System.out.println(
                "===== VEÍCULOS DA CATEGORIA CARRO ====="
        );
        gestao.procurarCategoria(CategoriaEnum.CARRO);
        gestao.atualizarValorDiaria(1, 55);
        gestao.removerVeiculo(2);
        gestao.listarVeiculos();
    }
}