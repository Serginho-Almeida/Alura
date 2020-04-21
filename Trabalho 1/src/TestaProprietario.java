
public class TestaProprietario {

	public static void main(String[] args) {
		Proprietario dono1 = new Proprietario(null, "","");
		dono1.setDataNascimento("06/04/1978");
		System.out.println(dono1.getNome());
		System.out.println(dono1.getCpf());
		System.out.println(dono1.getRg());
		System.out.println(dono1.getDataNascimento());
		}
}
