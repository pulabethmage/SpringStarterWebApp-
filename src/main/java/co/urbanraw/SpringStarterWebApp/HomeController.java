package co.urbanraw.SpringStarterWebApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home(HttpServletRequest req)
	{
		
		HttpSession session = req.getSession();
		
		//System.out.println("Hi, From Home..");
		String name = req.getParameter("name");
		session.setAttribute("myname", name);
	
		return "home";// Imported the tomcat japser dependency inorder to work this.
	}

}
