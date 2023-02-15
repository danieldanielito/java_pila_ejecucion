package java_pila_ejecucion;

public class CuentaCorriente extends Cuenta {
	

	public CuentaCorriente() {
		super();
		}
	

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
		
	} 
	
	@Override
	public void saca(double valor) {
		 try {
			super.saca(valor + (valor*.0002));
		} catch (MiExcepcion e) {
			
			e.printStackTrace();
		}
		 System.out.println(this.getSaldo());
	}
	
	

}
