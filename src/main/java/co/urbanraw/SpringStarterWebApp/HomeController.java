package co.urbanraw.SpringStarterWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home()
	{
		//System.out.println("Hi, From Home..");
		return "home.jsp";// Imported the tomcat japser dependency inorder to work this.
	}

}
