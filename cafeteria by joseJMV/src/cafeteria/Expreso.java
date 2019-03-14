package cafeteria;

public class Expreso extends Cafe{

	public float precioLeche;
	public float precioCrema;
	public float precioChocolate;
	
	public Expreso(double precioBase,String[] condimentos) {
		super(precioBase,condimentos);
		
		precioLeche = 5;
		precioCrema = 8;
		precioChocolate = 7;
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
	
	@Override
	public double calcularCosto() {
		// TODO Auto-generated method stub
		return 0;
	}

}
