package RafaelPaulo.controler;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="user")
@SessionScoped

public class User {
	private String nome;
	private String senha;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenha() {
		return this.senha;
	}
	
	public String login(){
		if(nome != null && senha != null){
			if(nome.equals("admin") && senha.equals("admin")){
				nome = "";
				senha = "";
				return "/sucess?faces-redirect=true";
			}
			else{
				return "/error?faces-redirect=true";
			}
		}
		return "/error?faces-redirect=true";
	}
}

