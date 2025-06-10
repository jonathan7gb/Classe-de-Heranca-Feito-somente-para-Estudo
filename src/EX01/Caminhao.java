package EX01;
import java.util.Scanner;

public class Caminhao extends Veiculo{

    Scanner scstr = new Scanner(System.in);
    Scanner scnum = new Scanner(System.in);

    private float comprimentoTotal;
    private int qtdeEixos;

    public Caminhao(String Marca, String Modelo, String Cor){
        super(Marca, Modelo, Cor);
        this.comprimentoTotal = 0;
        this.qtdeEixos = 0;
    }

    public void Cadastrar(){
        System.out.println("=== Cadastrar Caminhão ===");
        super.Cadastrar();
        System.out.print("Comprimento Total (metros): ");
        this.comprimentoTotal = scnum.nextFloat();
        System.out.print("Quantidade de Eixos: ");
        this.qtdeEixos = scnum.nextInt();
        System.out.println("-- Caminhão Cadastrado! --");
    }

    public void Informacoes(){
        super.Informacoes();
        System.out.println("- Comprimento Total: " + this.comprimentoTotal + "m");
        System.out.println("- Quantidade de Eixos: " + this.qtdeEixos);
    }

    public float getcomprimentoTotal() {
		return this.comprimentoTotal;
	}

	public void setcomprimentoTotal(float comprimentoTotal) {
		this.comprimentoTotal = comprimentoTotal;
	}

    public int getqtdeEixos() {
		return this.qtdeEixos;
	}

	public void setqtdeEixo(int qtdeEixos) {
		this.qtdeEixos = qtdeEixos;
	}


}
