package estudo;

public  class CenarioFactory {

	public static Cenario criarCenario(int nivel) {
		if(nivel == 1) {
			return new Deserto();
		}else {
			return new Selva();
		}
	}
	
}
