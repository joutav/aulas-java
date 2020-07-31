
public class TesteReferecias {

	public static void main(String[] args) {

		
		
		
		Gerente g1 = new Gerente();
		

		
		
		g1.setNome("Marcos");
		g1.setSalario(5000.00);
		
		System.out.println(g1.getBonificacao());
		
		
		Funcionario f = new Funcionario();
		f.setSalario(2000.00);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.00);
		
			
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
		
	
	
	
	
	}

}
