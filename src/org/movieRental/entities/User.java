package org.movieRental.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String user;
	private String password;
	
	@OneToMany(mappedBy="user")
	private Set<Movie>movie;
	
	
	public Set<Movie> getMovie() {
		return movie;
	}

	public void setMovie(Set<Movie> movie) {
		this.movie = movie;
	}

	public User(){}

	public User(int id, String user, String password) {
		super();
		this.id = id;
		this.user = user;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", user=" + user + ", password=" + password + "]";
	}
	
	

}
