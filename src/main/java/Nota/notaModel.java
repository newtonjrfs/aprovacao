package Nota;
public class notaModel {
	

	  public static String resultadoNota(float frequencia, float nota) {
	    

	    String result = "";
	    
	     
	    if (nota>=6 && frequencia>= 72) {
	    	
	    	result = "Aprovado";
	      
	    }else if(nota>=6 && frequencia<72){
	    	
	    	result = "Reprovado por frequência";
	    	
	    }else if(nota<6 && frequencia >= 72){
	    	
	    	result = "Reprovado por média";
	    	
	    }else if(nota<6 && frequencia<72){
	    	
	    	result = "Reprovado por média e frequência";
	    	
	    }
	    return result;
	  }

}
