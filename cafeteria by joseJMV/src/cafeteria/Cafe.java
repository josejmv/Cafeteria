package cafeteria;

abstract public class Cafe {
	
	private double precioBase;
	String[] condimentos;
	
	public Cafe(double precioBase,String[] condimentos)
	{
		this.condimentos = new String[condimentos.length];
		this.condimentos = condimentos;
		this.precioBase = precioBase;
	}
		
	public double getPrecioBase() {
		return precioBase;
	}
	
	public String[] getCondimentos() {
		return condimentos;
	}
	
	public void mostrar()
	{	
		String[] _condimentos = new String[getCondimentos().length];
		_condimentos = getCondimentos();
		
		for (int i=0;i<_condimentos.length;i++)
		{
			
			if(i+1<=_condimentos.length-1)
			{
				if(_condimentos[i].intern()==_condimentos[i+1].intern())
				{
					continue;
				}
			}
			
			
			System.out.print(_condimentos[i]);
			
			
			if(i+1<_condimentos.length-1)
			{
				System.out.print(", ");
			} else
			{
				if(i+1==_condimentos.length-1)
				{
					System.out.print(" y ");
				}
			}
		}
	}
	
	abstract public double calcularCosto();
}
