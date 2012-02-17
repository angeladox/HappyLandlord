package realestaterentalfun

class Landlord {
	static searchable = true
	
	String userId
	String firstName
	String lastName
	String email
	String password
	Date dateCreated

    static constraints = {
    }
	
	static hasMany = [properties:Property, units:Unit] 
}
