package project;

public class main

{

	public static void main(String[] args) {
		Casa Casa1=new Casa("madera",3,5,"Juan");
		Casa Casa2=new Casa("ladrillo",2,7,"Maria");
		
		System.out.println(Casa1.toString());
		System.out.println(Casa2.toString());
		
		if(Casa1.getNumeroHabitacion()>Casa2.getNumeroHabitacion()) {
			System.out.println(Casa1.getPropietario()+" tiene mas habitaciones...") ;
		}else {
			System.out.println(Casa2.getPropietario()+" tiene mas habitaciones...") ;
		}
	}
	
		
		
}// TODO Auto-generated method stub

