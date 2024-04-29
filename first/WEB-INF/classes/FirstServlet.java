import javax.servlet.*;
import java.io.*;


public class FirstServlet extends GenericServlet{
   public void service(ServletRequest req,ServletResponse res){
      try{
	      res.setContentType("text/html");
		  PrintWriter pw=res.getWriter();
		  pw.println("<h1>Welcome to Servlet Programming</h1>");
		 }
         catch(Exception e){
            e.printStackTrace();
         }
   }
}   