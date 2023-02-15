package java_pila_ejecucion;

public class Cuenta  {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
    
    

    public Cuenta() {
	}

	public Cuenta(int agencia, int numero){
        Cuenta.total++;
        System.out.println("Total de cuentas es " + Cuenta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        System.out.println("Estoy creando una cuenta " + this.numero);
    }

    public void deposita (double valor) throws MiExcepcion{
    	if (valor<=0) {
    		System.out.println(this.saldo);
    		throw new MiExcepcion("lo depositado no puede ser - o = a 0 ");
    		
    	}
        this.saldo = this.saldo + valor;
        System.out.println(this.saldo);
    }

    public void saca(double valor) throws MiExcepcion{
    	if (valor>this.saldo) {
    		System.out.println("su saldo es insuficiente");
    		System.out.println("su saldo es "+this.saldo);
    		throw new MiExcepcion("saldo insuficienfte ");
    		
    	}
            this.saldo -= valor;
           
    }

    public boolean transfiere(double valor, Cuenta destino)  {
        if(this.saldo >= valor) {
          
			try {
				this.saca(valor);
			} catch (MiExcepcion e1) {
				
				e1.printStackTrace();
			}
		
            try {
				destino.deposita(valor);
			} catch (MiExcepcion e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("No pueder ser el valor menor o igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia <= 0) {
            System.out.println("No pueder ser el valor menor o igual a ");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Cuenta.total;
    }


}
