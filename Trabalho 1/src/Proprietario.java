//public abstract class Proprietario {
public class Proprietario {
	private String nome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private Endereco localidade;
//	private String rua;
//	private String bairro;
//	private String cidade;
//	private String estado;
//	private String cep;
//	private String complemento;
	
//	public Proprietario() {
//	}
	public Proprietario(String nome, String cpf, String rg) {
		if (nome != null && nome != "") {
			this.nome = nome;
		} else {
			System.out.println("O nome deve ser preenchido");
		}
		if (cpf != null && cpf != "") {
			this.cpf = cpf;
		} else {
			System.out.println("O cpf deve ser preenchido");
		}
		if (rg != null && rg != "") {
			this.rg = rg;
		} else {
			System.out.println("O rg deve ser preenchido");
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getLocalidade() {
		return localidade;
	}
	public void setLocalidade(Endereco localidade) {
		this.localidade = localidade;
	}
//	public String getRua() {
//		return rua;
//	}
//	public void setRua(String rua) {
//		this.rua = rua;
//	}
//	public String getBairro() {
//		return bairro;
//	}
//	public void setBairro(String bairro) {
//		this.bairro = bairro;
//	}
//	public String getCidade() {
//		return cidade;
//	}
//	public void setCidade(String cidade) {
//		this.cidade = cidade;
//	}
//	public String getEstado() {
//		return estado;
//	}
//	public void setEstado(String estado) {
//		this.estado = estado;
//	}
//	public String getCep() {
//		return cep;
//	}
//	public void setCep(String cep) {
//		this.cep = cep;
//	}
//	public String getComplemento() {
//		return complemento;
//	}
//	public void setComplemento(String complemento) {
//		this.complemento = complemento;
//	}	
}