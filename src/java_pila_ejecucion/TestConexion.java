package java_pila_ejecucion;

public class TestConexion {
 public static void main(String[] args) throws Exception {
	
	 try(Conexion con = new Conexion()){
		 con.leerDatos();
	 }catch(IllegalStateException e) {
		 System.out.println("ejecutando catch");
		 e.printStackTrace();
	 }
	 
	 /*Conexion con = null;
	 try {
		 con = new Conexion();
		 con.leerDatos(); 
		 
	 }catch(IllegalStateException e) {
		 System.out.println("ejecutando catch");
		 e.printStackTrace();
	 }
	 finally {
		 
	System.out.println("ejecutando finally");
	if(con != null) {
	 con.cerrar();
	 }
	 }*/
}
}
