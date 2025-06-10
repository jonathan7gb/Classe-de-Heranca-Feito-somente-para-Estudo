package EX01;
import java.util.Scanner;

public class Veiculo {

	Scanner scstr = new Scanner(System.in);
	Scanner scnum = new Scanner(System.in);
	
	private String Marca;
	private String Modelo;
	private String Cor;
	private int qtdeRodas;
	private static int totalVeiculos;
			
	public Veiculo(String Marca, String Modelo,String Cor) {
		this.Marca = Marca;
		this.Modelo = Modelo;
		this.Cor = Cor;
		this.qtdeRodas = 0;
		totalVeiculos++;
	}
	
	public void Cadastrar() {
		System.out.print("Marca: ");
		this.Marca = scstr.nextLine();
		System.out.print("Modelo: ");
		this.Modelo = scstr.nextLine();
		System.out.print("Cor: ");
		this.Cor = scstr.nextLine();
		System.out.print("Quantidade de Rodas: ");
		this.qtdeRodas = scnum.nextInt();
	}
	
	public void Informacoes() {
		System.out.println("-----------------------------------------");
		System.out.println("Marca: " + this.Marca);
		System.out.println("Modelo: " + this.Modelo);
		System.out.println("Cor: " + this.Cor);
		System.out.println("Quantidade de Rodas: " + this.qtdeRodas);
	}
	
	public static void totalVeiculosCadastrados() {
		System.out.println("Total de Veículos: " + totalVeiculos);
	}

	//GETTERS AND SETTERS
	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		this.Marca = marca;
	}
	public String getModelo() {
		return Marca;
	}
	
	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		this.Cor = cor;
	}

	public int getQtdeRodas() {
		return qtdeRodas;
	}

	public void setQtdeRodas(int qtdeRodas) {
		this.qtdeRodas = qtdeRodas;
	}

	public static int getTotalVeiculos() {
		return totalVeiculos;
	}
	
	
}
