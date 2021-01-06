package br.com.dailson.jpa.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode 
@ToString
public class PersonBean implements Serializable{
	private static final long serialVersionUID = 1L;

	@Getter
	private Long id;
	
	@Getter @Setter
	private String login;

	@Getter @Setter
	private String password;
	
	
	
	public boolean validPassword(String login, String password) {
		
		if(login.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			return true;
		}else {
			return false;
		}
	}
}
