package EX01;
import java.util.Scanner;

public class Carro extends Veiculo{

	Scanner scstr = new Scanner(System.in);
	Scanner scnum = new Scanner(System.in);
	
	private int qtdeAssentos;
	private int totalCavalos;
	
	public Carro(String Marca, String Modelo, String Cor) {
		super(Marca, Modelo, Cor);
		this.qtdeAssentos = 0;
		this.totalCavalos = 0;
		super.setQtdeRodas(4);
	}
	
	public void Cadastrar() {
		super.Cadastrar();
		System.out.print("Quantidade de Assentos: ");
		qtdeAssentos = scnum.nextInt();
		System.out.print("Total de Cavalos: ");
		totalCavalos = scnum.nextInt();
		System.out.println("\n-- Carro Cadastrado! --\n");
	}
	
	public void Informacoes() {
		super.Informacoes();
		System.out.println("Quantidade de Assentos: " + this.qtdeAssentos);
		System.out.printf("Total de Cavalos: %dcv%n", this.totalCavalos);
	}

	public void UpgradeCavalos(int cavalosMais) {
		this.totalCavalos += cavalosMais;
	}
	
	public int getQtdeAssentos() {
		return qtdeAssentos;
	}

	public void setQtdeAssentos(int qtdeAssentos) {
		this.qtdeAssentos = qtdeAssentos;
	}

	public int getTotalCavalos() {
		return totalCavalos;
	}

	public void setTotalCavalos(int totalCavalos) {
		this.totalCavalos = totalCavalos;
	}
	
	
}
