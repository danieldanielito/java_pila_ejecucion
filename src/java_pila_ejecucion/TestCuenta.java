package java_pila_ejecucion;

public class TestCuenta {

	public static void main(String[] args) throws MiExcepcion {
		Cuenta cuenta = new Cuenta();
		//cuenta.deposita(10);
		//cuenta.saca(15);
		CuentaCorriente cue = new CuentaCorriente();
		cue.deposita(11);
		cue.saca(11);

	}

}
