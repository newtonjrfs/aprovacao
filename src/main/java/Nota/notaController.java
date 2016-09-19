package Nota;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/aprovacao")
public class notaController extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    //Preparação dos parâmetros.
    
	String nome = req.getParameter("nome");
	  
    String frequenciaStr = req.getParameter("frequencia");
    float frequencia = frequenciaStr == null || frequenciaStr.isEmpty() ? 0 : Float.parseFloat(frequenciaStr);

    String notaStr = req.getParameter("nota");
    float nota = notaStr == null || notaStr.isEmpty()? 0 : Float.parseFloat(notaStr);

    

    //Chamada ao Model.
    String resultadoNota = notaModel.resultadoNota(frequencia,nota);

    //Passagem de atributos para o JSP.
    req.setAttribute("resultadoNota", resultadoNota);

    //Chamando o JSP.
    String nextJsp = "/aprovacao.jsp";
    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJsp);
    dispatcher.forward(req, resp);
  }
}
