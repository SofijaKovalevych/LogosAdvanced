package ua.shop.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
	
	@Entity
	@Table(name = "User")
	public class User extends BaseEntity {

		private String login;
		private String password;
		private String email;

		@Column(name = "first_name", length = 20)
		private String firstName;

		@Column(name = "last_name", length = 20)
		private String lastName;
		private int age;

		@Enumerated(EnumType.STRING)
		private UserRole role;

		@OneToMany(mappedBy = "user")
		private List<Items> items = new ArrayList<>();

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public UserRole getRole() {
			return role;
		}

		public void setRole(UserRole role) {
			this.role = role;
		}

		public List<Items> getItems() {
			return items;
		}

		public void setItems(List<Items> items) {
			this.items = items;
		}

		@Override
		public String toString() {
			return "User [login=" + login + ", password=" + password + ", email=" + email + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", age=" + age + ", role=" + role + ", items=" + items + "]";
		}
		
		
	
}
