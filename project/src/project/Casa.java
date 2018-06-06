package project;

public class Casa {
	private String Material;
	private int  NumeroPuerta;
	private int NumeroHabitacion;
	private String Propietario;
	
	//constructor
	
	public Casa(String pMaterial, int pNumeroPuerta, int pNumeroHabitacion, String pPropietario)  {
		
		Material= pMaterial;
		NumeroPuerta= pNumeroPuerta;
		NumeroHabitacion= pNumeroHabitacion;
		Propietario= pPropietario;
		
				
	}
	
	public  String getMaterial() {
		return Material;
	}
	public void setMaterial(String material) {
		this.Material = material;
	}
	
	public int getNumeroHabitacion() {
		return NumeroHabitacion;
	}
	
	public void setNumeroHabitacion(int numeroHabitacion) {
		this.NumeroHabitacion = numeroHabitacion;
	}
	
	public int getNumeroPuerta() {
		return NumeroPuerta;
	}	
	
	public void setNumeroPuerta(int numeroPuerta) {
		this.NumeroPuerta = numeroPuerta;
	}
	
	public String getPropietario() {
		return Propietario;
	}
	
	
	public void setPropietario(String propietario) {
		this.Propietario = propietario;
	}
	
	@Override
	public String  toString() {
		return "La casa de  "+Propietario+" con "+NumeroHabitacion+" habitaciones"
				+ " esta hecho de "+Material
				+" tiene "+NumeroPuerta+" puertas";
		
	
	
	
	
		
				
				
		 	}
	
	
	

}
