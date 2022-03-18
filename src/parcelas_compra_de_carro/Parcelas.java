package parcelas_compra_de_carro;

public class Parcelas {

	public static void main(String[] args) {
		// Dado um valor de um carro, descubra de quantas vezes ele pode ser parcelado
				// condição valorDaParcela >= 1000
				
				double valorDoCarro = 30000;
				
				for(int parcela=1;parcela <= valorDoCarro;parcela++) {
					double valorDaParcela = valorDoCarro / parcela;
					
					if(valorDaParcela < 1000) {
						break;
					}
					
					System.out.println("Número de Parcelas "+parcela+", Valor da parcela R$: "+valorDaParcela);
				}

	}

}
