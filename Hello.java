import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Hello extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		String a=req.getParameter("t1");
		String b=req.getParameter("t2");
		int n1=Integer.parseInt(a);
		int n2=Integer.parseInt(b);
		int sum=n1+n2;
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=yellow>");
		out.println("<h1>sum of 2 numbers is:"+sum+"<h1>");
		out.println("</body>");
		out.println("<html>");
	}
}	
	
