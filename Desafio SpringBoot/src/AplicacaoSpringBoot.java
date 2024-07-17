@SpringBootApplication
public class AplicacaoSpringBoot implements CommandLineRunner {

    @Autowired
    private FabricaVeiculos fabricaVeiculos;

    public static void main(String[] args) {
        SpringApplication.run(AplicacaoSpringBoot.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Veiculo carro = fabricaVeiculos.criarVeiculo("carro");
        carro.ligar();
        carro.desligar();

        Veiculo moto = fabricaVeiculos.criarVeiculo("moto");
        moto.ligar();
        moto.desligar();
    }
}
