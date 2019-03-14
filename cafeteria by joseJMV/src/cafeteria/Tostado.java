package cafeteria;

public class Tostado extends Cafe{

	public float precioLeche;
	public float precioCrema;
	public float precioChocolate;
	
	public Tostado(double precioBase,String[] condimentos) {
		super(precioBase,condimentos);		
		
		precioLeche = 7;
		precioCrema = 10;
		precioChocolate = 8;
	}
	
	public float getPrecioLeche() {
		return precioLeche;
	}

	public float getPrecioCrema() {
		return precioCrema;
	}

	public float getPrecioChocolate() {
		return precioChocolate;
	}
	
	public void mostrar()
	{
		System.out.print("Cafe "+getClass().getSimpleName()+" con: ");
		super.mostrar();
	}
	
	public double calcularCosto() {
	
		return 0;
	}

}
