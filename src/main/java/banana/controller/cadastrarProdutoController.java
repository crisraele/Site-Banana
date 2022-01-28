package banana.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cadastrarProdutoController")
public class cadastrarProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cadastrarProdutoController() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset-UTF-8");
		
		
		String descricao = request.getParameter("descricao");
		String quantidade = request.getParameter("quantidade");
		String preco = request.getParameter("preco");
		String online = request.getParameter("online");
		
		System.out.println("[BANANA]: " + descricao);
		System.out.println("[BANANA]: " + quantidade);
		System.out.println("[BANANA]: " + preco);
		System.out.println("[BANANA]: " + online);
		
	}
	
	

}
