package cafeteria;

public class Casero extends Cafe{

	public float precioLeche;
	public float precioCrema;
	public float precioChocolate;
	
	public Casero(double precioBase,String[] condimentos) {
		super(precioBase,condimentos);
		
		precioLeche = 6;
		precioCrema = 6;
		precioChocolate = 6;
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
