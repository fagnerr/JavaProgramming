package section2_3;

public class MountainBike extends Bicicleta {

	//Propriedades Genericas
	private String tipoDeAmortecedor;

	//Construtores
	public MountainBike() {	}

	public MountainBike(String codigo, String tipoDeQuadro, String tipoDeRoda, int aro, int quantMarchas,
			double veloMedia, String tipoDeAmortecedor) {
		super(codigo, tipoDeQuadro, tipoDeRoda, aro, quantMarchas, veloMedia);
		this.setTipoDeAmortecedor(tipoDeAmortecedor);
	}

	//Comportamentos
	public String getTipoDeAmortecedor() {
		return tipoDeAmortecedor;
	}

	public void setTipoDeAmortecedor(String tipoDeAmortecedor) {
		this.tipoDeAmortecedor = tipoDeAmortecedor;
	}

	@Override
	public String toString() {
		return "MountainBike [tipoDeAmortecedor=" + tipoDeAmortecedor + ", getCodigo()=" + getCodigo()
		+ ", getTipoDeQuadro()=" + getTipoDeQuadro() + ", getTipoDeRoda()=" + getTipoDeRoda()
		+ ", getAro()=" + getAro() + ", getQuantMarchas()=" + getQuantMarchas() + ", getVeloMedia()="
		+ getVeloMedia() + "]";
	}

}
