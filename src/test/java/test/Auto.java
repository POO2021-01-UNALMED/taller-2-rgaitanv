package test;

public class Auto {
	
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados; 
	
	
	
	public int cantidadAsientos() {
		
		int con = 0 ;
		for (int i = 0 ; i < asientos.length; i++) {
			if(asientos[i] != null ) {
				con++;
			}
		}		
		
		return con;
	}
	
	
	String verificarIntegridad() {
		boolean asientosIguales = true;
		
		for(int i = 0; i < asientos.length; i++) {
			if(asientos[i] != null) {
				if(asientos[i].registro != registro) {
					asientosIguales = false;
				}		
			}
		}
		
		if ( (motor.registro == this.registro) && asientosIguales) {
				
			return "Auto original";		
			
		}else {
			
			return "Las piezas no son originales";
		}
								
	}
	
	
	
}
