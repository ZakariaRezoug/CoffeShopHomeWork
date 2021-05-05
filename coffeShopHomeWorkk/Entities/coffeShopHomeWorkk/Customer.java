package coffeShopHomeWorkk;







public class Customer implements Entity {
	 int id;
	 String firstName;
	 String lastName;
	 int dateOfBirth;
	 Long nationalityId;
	 
	
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return getFirstName();
	}
	public void setFirstName(String firstNameString) {
		this.firstName = firstNameString;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Long getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(Long nationalityId) {
		this.nationalityId = nationalityId;
	}

	
}
