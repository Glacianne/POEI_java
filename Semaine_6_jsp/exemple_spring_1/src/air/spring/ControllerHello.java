package air.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerHello {

	@RequestMapping("/") //méthode qui renvoie l'url de notre view
	public String getHello() {
		return "index";
	}
	
	@RequestMapping("/index")
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping("/userForm")
	public String getForm() {
		return "userForm";
	}
	
	//@RequestMapping("/resultForm")
	//public String getResultForm() {
		//return "resultForm";
	//}
	
	@RequestMapping("/resultForm")
	public String getProcessForm(HttpServletRequest request, Model model) {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		System.out.println("Nom : " + nom);
		System.out.println("Prénom : " + prenom);
		
		String email = nom+"."+prenom+"@gmail.com";
		model.addAttribute("email", email.toLowerCase());
		return "resultForm";
	}
	
	
}
