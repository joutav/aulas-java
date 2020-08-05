
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
		Adminstrador adm = new Adminstrador();
		si.autentica(adm);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		si.autentica(cliente);
	}

}
