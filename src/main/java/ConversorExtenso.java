import java.text.ParseException;

import junit.framework.Assert;

public class ConversorExtenso {

	public String converte(double y){
		String resultado = "";
		String sinal = "";
		
		if (y < 0) {
			sinal = "menos ";
			y= y*-1;
		}
			
		
	    java.text.DecimalFormat df = new  java.text.DecimalFormat(); 
		int i = (int)y;
		double t = y-i; 
		int fracao = 0;
		
		try {
			fracao = (int) (df.parse(df.format(t)).doubleValue() *100);
		} catch (ParseException e) {			
			e.printStackTrace();
		}
		
		// Trata inteiro
		if ( i>= 100){
			if (i == 100)
				resultado += "cem";
			else {
				resultado +=  ConverteCentena(i/100);
				i = i % 100;
			}
		}
		
		if ( i >= 20){	
			String temp = ConverteDezenaII(i/10);
			if (!resultado.isEmpty()&& !temp.isEmpty())
				resultado += " e " + temp;
			else
				resultado += temp;
			
		    i= i % 10;
		}
		
		if ( i >= 10 && i < 20)	{		
			String temp =  ConverteDezenaI(i);
			if (!resultado.isEmpty()&& !temp.isEmpty())
				resultado += " e " + temp;
			else
				resultado += temp;
		}
		else{
			String temp = ConverteUnidade(i);
			if (!resultado.isEmpty()&& !temp.isEmpty())
				resultado += " e " + temp;
			else
				resultado += temp;
		}
		
		// Trata fração
		if (fracao > 0 && fracao < 99){
			if ( fracao >= 20){	
				String temp = ConverteDezenaII(fracao/10);
				if (!resultado.isEmpty()&& !temp.isEmpty())
					resultado += " e " + temp;
				else
					resultado += temp;
				
			    fracao= fracao % 10;
			}
			if ( fracao >= 10 && fracao < 20)	{		
				String temp =  ConverteDezenaI(fracao);
				if (!resultado.isEmpty()&& !temp.isEmpty())
					resultado += " e " + temp;
				else
					resultado += temp;
			}
			else{
				String temp = ConverteUnidade(fracao);
				if (!resultado.isEmpty()&& !temp.isEmpty())
					resultado += " e " + temp;
				else
					resultado += temp;
			}
			
			resultado += " centavos";
		}
		
		if (!sinal.isEmpty())
			return sinal + resultado;
		else 
			return resultado;
	}
	
	public String ConverteCentena (int i) {
		
		switch (i){      
		case 9:
			return "novessentos";
		case 8:
			return "oitocentos";
		case 7:
			return "setecentos";
		case 6:
			return "seiscentos";	
		case 5:
			return "quinhentos";	
		case 4:
			return "quatrocentos";			
		case 3:
			return "trezentos";					
		case 2:
			return "duzentos";
		case 1:
			return "cento";
		}
		return "";
	}
	
	public String ConverteDezenaII (int i) {
		
		switch (i){      
		case 9:
			return "noventa";
		case 8:
			return "oitenta";
		case 7:
			return "setenta";
		case 6:
			return "sessenta";	
		case 5:
			return "cinquenta";	
		case 4:
			return "quarenta";			
		case 3:
			return "trinta";					
		case 2:
			return "vinte";
		}
		return "";
	}

	public String ConverteDezenaI (int i) {
		
		switch (i){      
		case 19:
			return "dezenove";
		case 18:
			return "dezoito";
		case 17:
			return "dezessete";
		case 16:
			return "dezeseis";	
		case 15:
			return "quinze";	
		case 14:
			return "quatorze";			
		case 13:
			return "treze";					
		case 12:
			return "vinte";
		case 11:
			return "onze";
		case 10:
			return "dez";
		}
		return "";
	}

	public String ConverteUnidade(int i){
		switch (i){      
		case 9:
			return "nove";
		case 8:
			return "oito";
		case 7:
			return "sete";
		case 6:
			return "seis";	
		case 5:
			return "cinco";	
		case 4:
			return "quatro";			
		case 3:
			return "três";					
		case 2:
			return "dois";
		case 1:
			return "um";
		}
		return "";
	}
}
