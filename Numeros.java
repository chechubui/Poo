public class Numeros {
	
	//atributo valor
	private int valor;
	
	//getter
	 public int getValor(){
		 return this.valor;
		 }
		 
	//setter
	public void setValor(int valor){
			System.out.println("usando metodo setValor(int valor)  ");
			this.valor=valor;
		}
	
	public void setValor(double valor){
			System.out.println("usando metodo setValor(double valor)  ");
			this.valor=(int)valor;
			return;
		}
	
}

