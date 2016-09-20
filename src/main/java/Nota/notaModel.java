package Nota;
public class notaModel {
	

	  public static String resultadoNota(float frequencia, float nota) {
	    

	    String result = "";
	    int cont = 0;
	     
	    if (nota>=6 && frequencia>= 72) {
	    	
	    	result = "Aprovado";
	      
	    }else if(nota>=6 && frequencia<72){
	    	
	    	result = "Reprovado por frequencia";
	    	
	    }else if(nota<6 && frequencia >= 72){
	    	
	    	result = "Reprovado por media";
	    	
	    }else if(nota<6 && frequencia<72 && cont>0){
	    	
	    	result = "Reprovado por media e frequencia";
	    	
	    }
	    cont++;
	   
	    return result;
	  }

}
