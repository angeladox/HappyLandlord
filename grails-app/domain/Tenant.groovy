package happylandlord

class Tenant {
	
	String firstName
	String lastName
	Date DOB
	String email
	
	static belongsTo = [Unit, Property]
	static constraints = {
	}
}
