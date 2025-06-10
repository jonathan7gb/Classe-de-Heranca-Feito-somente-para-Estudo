package EX01;
import java.util.Scanner;

public class Moto extends Veiculo{

	Scanner scstr = new Scanner(System.in);
	Scanner scnum = new Scanner(System.in);
	
	private Boolean escapeOriginal;
	private int numChassi;
	
	public Moto(String Marca, String Modelo, String Cor) {
		super(Marca, Modelo, Cor);
		this.escapeOriginal = true;
		this.numChassi = 0;
	}
	
	public void Cadastrar() {
		super.Cadastrar();
		System.out.print("Escape Original (True | False): ");
		this.escapeOriginal = scstr.nextBoolean();
		
		System.out.print("Número do Chassi: ");
		this.numChassi = scnum.nextInt();
		System.out.println("\n-- Moto Cadastrada! --\n");
	}
	
	public void Informacoes() {
		super.Informacoes();
		System.out.printf("Escape Original: %s%n", this.escapeOriginal ? "Sim" : "Não");
		System.out.println("Número do Chassi: " + this.numChassi);
	}

	public Boolean getEscapeOriginal() {
		return escapeOriginal;
	}

	public void setEscapeOriginal(Boolean escapeOriginal) {
		this.escapeOriginal = escapeOriginal;
	}

	public int getNumChassi() {
		return numChassi;
	}

	public void setNumChassi(int numChassi) {
		this.numChassi = numChassi;
	}
	
	
}
