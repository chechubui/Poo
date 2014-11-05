public class Circulo {
	
	//atributos
	/*Cualquier circulo que creemos tendra siempre un valor INICIAL 5*/
	private int radio=5; 
	
	//metodo que devuelve el radio
	public int getRadio(){
		return this.radio;
	}
	//metodo qye cambia el valor del radio
	public void setRadio(int r){
		this.radio=r;
		
		}
	
}
class TestCirculo{
	
	public static void main(String[] args){
		
		//creo un objeto de tipo circulo
		Circulo c1 = new Circulo(); //crea un circulo de radio 5
		System.out.println("Radio del circulo : " +c1.getRadio() );
		Circulo c2 = new Circulo(); //crea un circulo de radio 5
		// Cambio el radio del circulo c2 a un valor de 15
		c2.setRadio(15);
		System.out.println("Radio del circulo : " +c2.getRadio());
		
		}
	}
