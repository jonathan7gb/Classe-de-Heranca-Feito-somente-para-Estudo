package EX01;

public class Main {

	public static void main(String[] args) {
		
		Carro c1 = new Carro(null, null, null);
		
		c1.Cadastrar();
		
		c1.UpgradeCavalos(50);
		
		c1.Informacoes();
		
		Veiculo.totalVeiculosCadastrados();
		
		Moto m1 = new Moto(null, null, null);
		
		m1.Cadastrar();
		
		m1.Informacoes();
		
		Veiculo.totalVeiculosCadastrados();
		
	}

}
