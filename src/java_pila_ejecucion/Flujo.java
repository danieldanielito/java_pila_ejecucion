package java_pila_ejecucion;



public class Flujo {
	public static void main(String[] args) {
		System.out.println("inicio main");
		metodo1();
		System.out.println("fin main");
	}
	public static void metodo1() {
		System.out.println("inicio metodo1");
		metodo2();
		System.out.println("fin metodo1");
	}
    public static void metodo2() {
    	System.out.println("inicio metodo2");
    	for (int i = 1; i < 6; i++) {
    		System.out.println(i);
    		try{
    			if(i==3) {
    				int res = i/0;
            		System.out.println(res);	
    			}
    			
        		String cad = null;
        		System.out.println(cad.toString());
    			
    		}catch(ArithmeticException | NullPointerException e) {
    			System.out.println("atrapa excepcion");
    			System.out.println(e.getMessage());
    			e.printStackTrace();
    		
    		}	
		}	
		System.out.println("fin metodo2");
	}
}
