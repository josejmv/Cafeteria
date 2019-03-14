package finanzas;

import cafeteria.*;
import datos.Informacion;

public class Principal implements Informacion{
	
	private Cafe[] cafesVendidos;
	
	public Principal()
	{
		cafesVendidos = new Cafe[ventasCafe.length];
	}
	
	public void cargarInfo()
	{
		
		String[] separador = null;
		String[] separador2 = null;
		String[] condimentos = null;
		int i=0;
		
				
		for(String ventas : ventasCafe)
		{
			separador= new String[(ventas.split("-")).length];
			separador = ventas.split("-");
			
			if(separador.length>1)
			{
				condimentos = new String[(separador[1].split(",")).length];
				condimentos = separador[1].split(",");	
			}
			else if (separador.length==1)
			{
				condimentos = new String[1];
				condimentos[0]="sin condimentos";
			}
			
			
			for(String precios : preciosCafe)
			{
				separador2 = new String[(precios.split("-")).length];
				separador2 = precios.split("-");
				
				
				 if(separador[0].intern()=="Ex" && separador2[0].intern()=="Ex")
				{
					cafesVendidos[i] = new Expreso(Double.parseDouble(separador2[1]),condimentos);
					cafesVendidos[i].mostrar();
					System.out.println("");
					i++;
					break;
				} else if(separador[0].intern()=="Ca" && separador2[0].intern()=="Ca")
				{
					cafesVendidos[i] = new Casero(Double.parseDouble(separador2[1]),condimentos);
					cafesVendidos[i].mostrar();
					System.out.println("");
					i++;
					break;
				} else if(separador[0].intern()=="To" && separador2[0].intern()=="To")
				{
					cafesVendidos[i] = new Tostado(Double.parseDouble(separador2[1]),condimentos);
					cafesVendidos[i].mostrar();
					System.out.println("");
					i++;
					break;
				} else if(separador[0].intern()=="De" && separador2[0].intern()=="De")
				{
					cafesVendidos[i] = new Descafeinado(Double.parseDouble(separador2[1]),condimentos);
					cafesVendidos[i].mostrar();
					System.out.println("");
					i++;
					break;
				}
				
				 
			}	
		}
	}

	public Cafe getCafesVendidos(int i) {
		return cafesVendidos[i];
	}
	
	
}
