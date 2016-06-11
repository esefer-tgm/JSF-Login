package model;

import javax.faces.context.FacesContext;

public class User {
	private String name;
	private String password;
	private boolean loggedIn;

	public User() {
		loggedIn = false;
	}

	/**
	 * @return the loggedIn
	 */
	public boolean isLoggedIn() {
		return loggedIn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		if(name.equals("esefer") && password.equals("esefer123456")){
			loggedIn = true;
			return "success";
		} else {
			return "failed";
		}
	}

	public String logout() {
		loggedIn = false;
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "logout";
	}
}