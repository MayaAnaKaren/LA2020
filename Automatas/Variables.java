
package Automatas;
import java.util.Arrays;
public class Variables
{
	private String variable;
	private int tipo;
	private String valor;
	private int linea;
	private int uso;
	//Uso En variables 	0 = declaracion / 	1 = asignacion
	//Uso En Ifs		0 = inicio		/	1 = fin
	
	public Variables(String variable, int tipo, String valor,int linea,int uso)
	{
		this.variable=variable;
		this.tipo=tipo;
		this.valor=valor;
		this.linea=linea;
		this.uso=uso;
	}
	
	public String getVariable()
	{
		return variable;
	}
	public int getTipo()
	{
		return tipo;
	}
	public String getValor()
	{
		return valor;
	}
	public int getLinea()
	{
		return linea;
	}
	public int getUso()
	{
		return uso;
	}
	
	public void setVariable(String variable)
	{
		this.variable = variable;
	}
	public void setTipo(int tipo)
	{
		this.tipo = tipo;
	}
	public void setValor(String valor)
	{
		this.valor = valor;
	}
	public void setLinea(int linea)
	{
		this.linea = linea;
	}
	public void setUso(int uso)
	{
		this.uso = uso;
	}
	
	
	//Funcion para separar una cadena de texto
	private static String[] separaCaracteres(String cadena, String separator){        
	    //System.out.println("Separator: " + separator);
	    String[] parts = null;   
	    if(separator.equals("|")|| separator.equals("\\")||separator.equals(".")||separator.equals("^")||separator.equals("$")
	            ||separator.equals("?")||separator.equals("*")||separator.equals("+")||separator.equals("(")||separator.equals(")")
	            ||separator.equals("{")||separator.equals("[")){
	        //Es metacaracter!
	        parts = cadena.split("\\"+separator);      
	        
	    }else{
	        //No es metacaracter.
	        parts = cadena.split(separator);
	    }    
	    return parts;
	}
	
	public String toString() {
		String valores = getValor();
		String valor = getVariable();
		String [] partes = separaCaracteres(valores, " ");
		String parte0 = partes[0];
		String parte1 = partes[1];
		String parte2 = partes[2];
		String parte3 = partes[3];
		String parte4 = partes[4];
		String parte5 = partes[5];
		String mensaje, ecuacion, total_ecuacion = "";
		int parte1num = Integer.parseInt(parte1);
		int parte3num = Integer.parseInt(parte3);
		int parte5num = Integer.parseInt(parte5);		
		 
		ecuacion = valor + " = " + valores;  // ECUACION  
		mensaje = "Operador: " + parte2 + "," + parte4 + "\n" +  // OPERADOR
		 		"Operando 1: " + parte1 + "\n" +				// OPERANDO 1
		 		"Operando 2: " + parte3 + "," + parte5 + "\n" +   // OPERANDO 2
		 		"Resultado: " + valor;								// RESULTADO
		total_ecuacion = valor + " = " + (parte1num + (parte3num * parte5num));  // VALOR DEL RESULTADO
		
		
		return "Ecuacion: " + ecuacion + "\n" + mensaje + "\n" + "\n" + total_ecuacion; 

	}
	
	
}