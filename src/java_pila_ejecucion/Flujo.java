package java_pila_ejecucion;



public class Flujo {
	public static void main(String[] args)  {
		System.out.println("inicio main");
		metodo1();
		System.out.println("fin main");
	}
	public static void metodo1() {
		System.out.println("inicio metodo1");
		try {
		metodo2();
		}catch(MiExcepcion me) {
			System.out.println("mi excepcion");
			me.printStackTrace();
		}
		System.out.println("fin metodo1");
	}
    public static void metodo2() throws MiExcepcion {
    	System.out.println("inicio metodo2");
    	
    	throw new MiExcepcion("mi excepcion fue lanzada");
		//System.out.println("fin metodo2");
	}
}
