package Automatas;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Triplos {
	
	int TemporalesCount=0,contadorIf=1;
	boolean ElseExist = true;
	ArrayList<String> valores = new ArrayList<String>();
	
	public Triplos(ArrayList<Variables> TablaSimbolos){
		cuentaTemporales(TablaSimbolos);
		
		
		//imprime simbolos
		for(int i=0;i<TablaSimbolos.size();i++){
			System.out.print(TablaSimbolos.get(i).toString());
		}
	}
	public void cuentaTemporales(ArrayList<Variables> tab){
		for(int i=0;i<tab.size();i++)
		{
			if(tab.get(i).getTipo()==2 || tab.get(i).getTipo()==3)
			{
				String[] tokens;
				tokens = tab.get(i).getValor().split(" ");
				for(int j=0;j<tokens.length;j++)
					valores.add(tokens[j]);
				valores.remove(0);
				
				
				for(int j=0;j<valores.size();j++){
					if(valores.get(j).equals("*") || valores.get(j).equals("/") || valores.get(j).equals("+") || valores.get(j).equals("-"))
						TemporalesCount++;
				}
				valores.clear();
			}
		}
	}
	
}