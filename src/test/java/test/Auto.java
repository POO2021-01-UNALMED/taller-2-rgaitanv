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
		
		return asientos.length;
		
	}
	
	String verificarIntegridad() {
		boolean asientosIguales = true;
		
		for(int i = 0; i < asientos.length-1; i++) {
			
				if(asientos[0].registro != asientos[i+1].registro) {
					asientosIguales = false;
				}		
			
		}
		
		if ( (motor.registro == this.registro) && asientosIguales) {
				
			return "Auto original";		
			
		}else {
			
			return "Las piezas no son originales";
		}
								
	}
	
	
	
}
