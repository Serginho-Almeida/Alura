
public class TestaEndereco {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("", null, "", "RJ", "20910-110", "casa 16 - apt. 201");
		endereco.getRua();
		System.out.println(endereco.getRua());
		endereco.getBairro();
		System.out.println(endereco.getBairro());
		endereco.getCidade();
		System.out.println(endereco.getCidade());
		endereco.getEstado();
		System.out.println(endereco.getEstado());
		endereco.getCep();
		System.out.println(endereco.getCep());
		endereco.getComplemento();
		System.out.println(endereco.getComplemento());
	}
}
