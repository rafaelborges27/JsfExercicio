package RafaelPaulo.controler;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="userController")
@SessionScoped

public class UserController {
	
	public String test(){
		return "/error?faces-redirect=true";
	}
	
	public String test2(){
		return "/sucess?faces-redirect=true";
	}
	
}
