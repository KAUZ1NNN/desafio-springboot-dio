public class FabricaVeiculos {
    public Veiculo criarVeiculo(String tipo) {
        if ("carro".equalsIgnoreCase(tipo)) {
            return new Carro();
        } else if ("moto".equalsIgnoreCase(tipo)) {
            return new Moto();
        } else {
            throw new IllegalArgumentException("Tipo de veículo desconhecido: " + tipo);
        }
    }
}
