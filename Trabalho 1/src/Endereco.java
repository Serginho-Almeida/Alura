public class Endereco {
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String complemento;
	
	public Endereco(String rua, String bairro, String cidade, String estado, String cep, String complemento) {
		if (rua != null && rua != "") {
			this.rua = rua;
		} else {
			System.out.println("A rua deve ser preenchida");
		}
		if (bairro != null && bairro != "") {
			this.bairro = bairro;
		} else {
			System.out.println("O bairro deve ser preenchido");
		}
		if (cidade != null && cidade != "") {
			this.cidade = cidade;
		} else {
			System.out.println("A cidade deve ser preenchida");
		}
		if (estado != null && estado != "") {
			this.estado = estado;
		} else {
			System.out.println("O estado deve ser preenchido");
		}
		if (cep != null && cep != "") {
			this.cep = cep;
		} else {
			System.out.println("O cep deve ser preenchido");
		}
		if (complemento != null && complemento != "") {
			this.complemento = complemento;
		} else {
			System.out.println("O complemento deve ser preenchido");
		}
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}