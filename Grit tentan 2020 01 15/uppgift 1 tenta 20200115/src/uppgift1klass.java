import java.io.*; 
import java.util.ArrayList; 
import javax.servlet.*; 
import javax.servlet.http.*;
public class uppgift1klass {

	
	//skapar en lista med elever 
	public class EleverServlet 
	protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response) 
throws ServletException, IOException
{
		response.setContentType("text/html;charset=UTF-9"); 
	     try (PrintWriter out = response.getWriter()) { 
	       out.println("<!DOCTYPE html>"); 
	       out.println("<html>"); 
	       out.println("<head>"); 
	       out.println("<title>Servlett EleverServlett</title>"); 
	       out.println("</head>"); 
	       out.println("<body>"); 
}
}
    ArrayList<Elever> std = new ArrayList<Elev>(); 

 // Lägger till medlemmar i klassen Elever
    std.add(new Elev("Robin G", 31)); 
    std.add(new Elev("Johan", 27)); 
    std.add(new Elev("Anna", 35)); 
    std.add(new Elev("Sara", 26)); 
    std.add(new Elev("Niklas", 43)); 
    
    request.setAttribute("data", std);
    
    RequestDispatcher rd =  
            request.getRequestDispatcher("stdlist.jsp"); 
    
    rd.forward(request, response); 
    out.println("</body>"); 
    out.println("</html>"); 
    
}
}

protected void doGet(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException 

{
processRequest(request, response);
}
public String getServletInfo() 
{
    return "Short description"; 
}
}


    
    