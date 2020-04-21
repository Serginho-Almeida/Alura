
public class TestaCarro {
	
	public static void main(String[] args) {
		Carro carroSergio = new Carro(null);//("Sergio","987654432-98","18276545-9");
		carroSergio.setModelo("Uno");
		carroSergio.setCor("Azul");
		carroSergio.setAno(2017);
		carroSergio.setChassi("AXCDE234EW");
		carroSergio.setVelocidadeMaxima(150.0);
		carroSergio.setVelocidadeAtual(0.0);
		carroSergio.setPortas(5);
		carroSergio.setTemTetoSolar(false);
		carroSergio.setMarchas(0);
		carroSergio.setTemCambioAutom(false);
		carroSergio.setVolumeCombustivel(8.0);
		Marca marcaSergio = new Marca();
		marcaSergio.setAnoLancamento(1990);
		marcaSergio.setCodigoIdentificador("10AB");
		marcaSergio.setNome("Fiat");
		marcaSergio.setNrDeModelos(1000);
		System.out.println(carroSergio.getModelo());
		System.out.println(marcaSergio.getAnoLancamento());
		carroSergio.reduzMarcha(1);
		System.out.println(carroSergio.getMarchas());
		carroSergio.marchaRe(0.0);
		System.out.println(carroSergio.getVelocidadeAtual());
		carroSergio.acelera(0.0);
		System.out.println(carroSergio.getVelocidadeAtual());
		carroSergio.acelera(carroSergio.getVelocidadeAtual());
		System.out.println(carroSergio.getVelocidadeAtual());
		carroSergio.freia();
		System.out.println(carroSergio.getVelocidadeAtual());
		Proprietario sergio = new Proprietario("Sergio","987654432-98", "18276545-9");
		carroSergio.dono = sergio;
//		carroSergio.dono = propExemplo;
//		System.out.println(carroSergio.dono.nome);
//		System.out.println(carroSergio.dono.cpf);
//		System.out.println(carroSergio.dono.rg);
		System.out.println(carroSergio.getDono().getNome());
		System.out.println(carroSergio.getDono().getCpf());
		System.out.println(carroSergio.getDono().getRg());
	}
}