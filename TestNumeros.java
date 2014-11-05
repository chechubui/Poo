public class TestNumeros {
	
	public static void main (String args[]) {
		Numeros n=new Numeros ();
		System.out.println("Numero : " +n.getValor()); // inicializa el valor en 0
		n.setValor(12);
		System.out.println("Numero : " +n.getValor());
		n.setValor(13.3);
		System.out.println("Numero : " +n.getValor());
		
	}
}

