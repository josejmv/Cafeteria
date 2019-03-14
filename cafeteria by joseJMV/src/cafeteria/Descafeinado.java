package cafeteria;

public class Descafeinado extends Cafe {

	public float precioLeche;
	public float precioCrema;
	public float precioChocolate;
	
	public Descafeinado(double precioBase,String[] condimentos) {
		super(precioBase,condimentos);
		
		precioLeche = 4;
		precioCrema = 6;
		precioChocolate = 5;
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
