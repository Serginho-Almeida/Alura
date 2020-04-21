//public class Carro extends Proprietario {
public class Carro {
	private String modelo;
	private String cor;
	private int ano;
//	private String marca;
	private Marca montadora;
	private String chassi;
//	private Proprietario dono = new Proprietario("Sergio","987654432-98", "18276545-9");
	protected Proprietario dono;
	private double velocidadeMaxima;
	private double velocidadeAtual;
	private int portas;
	private boolean temTetoSolar;
	private int marchas;
	private boolean temCambioAutom;
	private double volumeCombustivel;
	
//	public Carro(Proprietario dono) {
//		this.dono = new Proprietario();
//	}	
	public Carro(Proprietario dono) {
		this.dono = dono;
//		new Proprietario("Sergio","987654432-98", "18276545-9");
	}
//	public Carro(String nome, String cpf, String rg) {
//		//if (super.getNome() != null | super.getNome() != " ") {
//		//	super.nome = super.getNome();
//		Proprietario propExemplo = new Proprietario("Sergio","987654432-98", "18276545-9");
//		if(nome != null | nome != " ") {
//			nome = nome;
//		} else {
//			System.out.println("O nome deve ser preenchido");
//		}
//		//if (super.getCpf() != null | super.getCpf() != " ") {
//		//	super.cpf = super.getCpf();
//		if(cpf != null | cpf != " ") {
//			cpf = cpf;
//		} else {
//			System.out.println("O cpf deve ser preenchido");
//		}
//		//if (super.getRg() != null | super.getRg() != " ") {
//		//	super.rg = super.getRg();
//		if(rg != null | rg != " ") {
//			rg = rg;
//		} else {
//			System.out.println("O rg deve ser preenchido");
//		}
//	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Marca getMontadora() {
		return montadora;
	}
	public void setMontadora(Marca montadora) {
		this.montadora = montadora;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public Proprietario getDono() {
		return dono;
	}
	public void setDono(Proprietario dono) {
		this.dono = dono;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public boolean getTemTetoSolar() {
		return temTetoSolar;
	}
	public void setTemTetoSolar(boolean temTetoSolar) {
		this.temTetoSolar = temTetoSolar;
	}
	public int getMarchas() {
		return marchas;
	}
	public void setMarchas(int marchas) {
		this.marchas = marchas;
	}
	public boolean getTemCambioAutom() {
		return temCambioAutom;
	}
	public void setTemCambioAutom(boolean temCambioAutom) {
		this.temCambioAutom = temCambioAutom;
	}
	public double getVolumeCombustivel() {
		return volumeCombustivel;
	}
	public void setVolumeCombustivel(double volumeCombustivel) {
		this.volumeCombustivel = volumeCombustivel;
	}
	public void acelera(double velocidade) {
		this.velocidadeAtual += 1.0;
	}
	public void freia() {
		this.velocidadeAtual = 0.0;
	}
	public void trocaMarcha(int marcha) {
		if(this.marchas < 6) {
			this.marchas += 1;
	} else 
		System.out.println("Você não pode trocar de marcha, pois já está"
				+ " na última marcha");
	}
	public void reduzMarcha(int marcha) {
		if(this.marchas == 0) {
			System.out.println("Você não pode reduzir a marcha, pois já está"
					+ " na marcha neutra");
		} else {
			if(this.marchas == 1) {
				System.out.println("Você não pode reduzir a marcha, pois já está"
					+ " na primeira marcha");
			} else {
				if(this.marchas <= 6) {
					this.marchas -= 1;
				}
			}
		}
	}
	public void marchaRe(double velocidade) {
		if(this.velocidadeAtual > 0.0) {
			System.out.println("A marcha ré não pode ser engatada");
		} else
			System.out.println("Marcha ré engatada");
	}
}