public class Rectangulo{
	private int alto=5; 
	 
	private int ancho=10; 
	
	//metodo que devuelve el valor de ancho alto y area
	public int getAlto(){
		return this.alto;
	}
	public int getAncho(){
		return this.ancho;
	}
	public int getArea(){
		return this.alto*ancho;
	}
	
	//metodo qye cambia el valor del ancho y del alto
	public void setAlto(int a){
		this.alto=a;
		
		}
	
	public void setAncho(int an){
		this.ancho=an;
		
		}
	
}
class TestRectangulo{
	
	public static void main(String[] args){
		
		//creo un objeto de tipo circulo
		Rectangulo rec1 = new Rectangulo(); //crea un rectangulo
		System.out.println("\nAlto del rectangulo : " +rec1.getAlto() ); // llamamos a la clase 
		System.out.println("Ancho del rectangulo : " +rec1.getAncho() ); // llamamos a la clase 
		System.out.println("Area del rectangulo : " +rec1.getArea() ); // llamamos a la clase 
		
		
		Rectangulo rec2 = new Rectangulo(); //crea un circulo de radio 5
		// Cambio el radio del circulo c2 a un valor de 15
		rec2.setAlto(10);
		System.out.println("\nNUEVO VALOR DE ALTO   : " +rec2.getAlto());
		System.out.println("NUEVO VALOR DE AREA   : " +rec2.getArea());
		System.out.println("\nVALOR ANTIGUO  DE AREA   : " +rec1.getArea());
		
		
		}
	}
	
	

