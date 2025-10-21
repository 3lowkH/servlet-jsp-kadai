package sj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("name");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<a href=\"" + request.getContextPath() + "/link?name=侍太郎\">名前「侍太郎」をServletに送信</a><br>");
        out.println(userName + "さん、こんにちは！");
	}
}
