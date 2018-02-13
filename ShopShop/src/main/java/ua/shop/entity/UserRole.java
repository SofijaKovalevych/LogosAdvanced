package ua.shop.entity;

public enum UserRole {
	
	ROLE_STUDENT("USER"), ROLE_TEACHER("ITEM"), ROLE_ADMIN("ADMIN");
	
	private String roleName;

	private UserRole(String roleName) {
		this.roleName = roleName;
	}
	
	public String getRoleName() {
		return roleName;
	}
	

}
