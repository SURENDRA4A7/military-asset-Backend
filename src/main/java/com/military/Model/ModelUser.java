package com.military.Model;

import com.military.enums.Role;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
    
    

    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public ModelBase getBase() {
		return base;
	}


	public void setBase(ModelBase base) {
		this.base = base;
	}


	public ModelUser() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ModelUser(Long id, String username, String password, Role role, ModelBase base) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.base = base;
	}


	@ManyToOne
    private ModelBase base; 



	
}
