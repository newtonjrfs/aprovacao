package Nota;
public class notaModel {
	

	  public static String resultadoNota(float frequencia, float nota) {
	    

	    String result = "";
	    
	     
	    if (nota>=6 && frequencia>= 72) {
	    	
	    	result = "Aprovado";
	      
	    }else if(nota>=6 && frequencia<72){
	    	
	    	result = "Reprovado por frequ�ncia";
	    	
	    }else if(nota<6 && frequencia >= 72){
	    	
	    	result = "Reprovado por m�dia";
	    	
	    }else if(nota<6 && frequencia<72){
	    	
	    	result = "Reprovado por m�dia e frequ�ncia";
	    	
	    }
	    return result;
	  }

}
